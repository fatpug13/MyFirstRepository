
import java.util.*;
import java.util.stream.IntStream;

public class Level1 {

public static int Unmanned(int L, int N, int [][] track) {
		
		int travelTime = 0;
		boolean redSignal = true;
		int[] lights = new int[3];	
		int haveLights = 0;
		int counterLightsRed = 0;
		int counterLightsGreen = 0;
		int way = 0;
		int counterLights = 0;

		getLightsInfo(track, lights);

		for (int i = 0; i < lights.length; i++) {
			if (i == 0) {
				haveLights = lights[i];
			}
			if (i == 1) {
				counterLightsRed = lights[i];
			}
			if (i == 2) {
				counterLightsGreen = lights[i];
			}
		}
		counterLights += 1;
		
		do {
			
			if (haveLights == way) {
				if(redSignal == true) {
					counterLightsRed --;
				}else {
					counterLightsGreen --;
					way ++;
				}
			}
			else {
				way ++;
				
				if (redSignal == true) {
					counterLightsRed --;
				}else {
					counterLightsGreen --;
				}		
			}

			if (counterLightsRed == 0) {
				redSignal = false;
				counterLightsRed = lights[1];
			}
			if (counterLightsGreen == 0) {
				redSignal = true;
				counterLightsGreen = lights[2];
			}
			
			if (way > haveLights) {

				if (counterLights <= N) {
					
					getLightsInfo(track, lights);

					for (int i = 0; i < lights.length; i++) {
						if (i == 0) {
							haveLights = lights[i];
						}
						if (i == 1) {
							counterLightsRed = lights[i];
						}
						if (i == 2) {
							counterLightsGreen = lights[i];
						}	
					}

					counterLights += 1;

					int k = 1;
					for (int i = 1; i <= travelTime; i++) {
						if (redSignal == true) {
							if (k == counterLightsRed) {
								redSignal = false;
								counterLightsRed = lights[1];
								k = 0;
							}
						} else {
							if (k == counterLightsGreen) {
								redSignal = true;
								counterLightsGreen = lights[2];
								k = 0;
							}
						}
						k += 1;
					}
				}
			}
			travelTime += 1;
		}
		while(way != L);
		
		return travelTime;		
	}
	
	public static int[] getLightsInfo(int[][] data, int[] lights) {
		
		int haveLights = 0;
		int redLights = 0;
		int greenLights = 0;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] != 0) {
					if (j == 0) {
						lights[j] = data[i][j];
						haveLights = data[i][j];
						data[i][j] = 0;
					}
					if (j == 1) {
						lights[j] = data[i][j];
						redLights = data[i][j];
						data[i][j] = 0;
					}
					if (j == 2) {
						lights[j] = data[i][j];
						greenLights = data[i][j];
						data[i][j] = 0;
					}
				}
			}
			if (haveLights != 0 && redLights != 0 && greenLights != 0) {
				break;
			}
		}
		return lights;
	}
	
}
