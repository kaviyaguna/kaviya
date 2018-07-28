import java.util.Scanner;
public class Comman {
	public static void main(String[] args) {
		String str1 ;
	    String str2 ;
	    String strbuilder = "";
        Scanner in=new Scanner(System.in);
        str1=in.nextLine();
        str2=in.nextLine();
	    char[] first = str1.toLowerCase().toCharArray();
	    char[] second = str2.toLowerCase().toCharArray();
	    int minLength = Math.min(first.length, second.length);
	    for (int i = 0; i < minLength; i++) {
	        if (first[i] == second[i]) {
	            strbuilder += String.valueOf(first[i]);
	        }
	    }
	    System.out.println(strbuilder);
	}
}
