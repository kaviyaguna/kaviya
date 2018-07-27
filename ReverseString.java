import java.util.Scanner;
public class ReverseString {
	public static void main(String args[]){
		String a;
		Scanner in=new Scanner(System.in);
		a=in.nextLine();
        int i,j;
        System.out.println("Enter the string");
       String reverse=" ";
       int length=a.length();
       for(i=length-1;i>=0;i--){
    	   reverse=reverse+a.charAt(i);
       }
       String c=a+reverse;
    	   System.out.println(reverse);
       }
       }


