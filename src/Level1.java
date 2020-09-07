import java.util.*;

public class Level1 
{
	public static int squirrel (int N) 
	{
		var result = 1;
		
		if (N == 0 || N == 1) {
			return result;
		} 
		else {	
		for (var i = 1; i <= N; i++)
		{
			result = result * i; 
		}
		  
		var firstInteger = Integer.parseInt(Integer.toString(result).substring(0,1));	
		return firstInteger;
		}
	}
}
