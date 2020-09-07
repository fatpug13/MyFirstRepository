
public class Program {

	public static void main(String[] args) {	
		var a = 5;
		//var b = "Ts";

		System.out.println(squirrel(a));
	}
	
	public static boolean startsWith(String text, String substr) 

	{
		
		var lengthtSubstr = substr.length() -1;
		var resText = "";
		var resSubstr = "";
		 
		for (var i = 0; i <= lengthtSubstr; i ++) {
			 
			resText += text.charAt(i);
			resSubstr += substr.charAt(i);
			 		 
			}
		return resText.equals(resSubstr);
	}
	
	public static int squirrel (int N) 
	{
		var result = 1;
		
		if (N == 0 || N == 1) {
			return result;
		} 
		else {	
		for (var i = 1; i <= N; i++)
		{
			result *= i;  
		}
		
		var firstInteger = Integer.parseInt(Integer.toString(result).substring(0,1));
		return firstInteger;
		}
	}
}