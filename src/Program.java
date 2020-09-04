
public class Program {

	public static void main(String[] args) {	
		var a = "Targaryen";
		var b = "Ts";

		System.out.println(startsWith(a, b));		
	}
	
	public static boolean startsWith(String text, String substr) {
		
		var lengthtSubstr = substr.length() -1;
		var resText = "";
		var resSubstr = "";
		 
		for (var i = 0; i <= lengthtSubstr; i ++) {
			 
			resText += text.charAt(i);
			resSubstr += substr.charAt(i);
			 		 
			}
		return resText.equals(resSubstr);
		}
			 
}