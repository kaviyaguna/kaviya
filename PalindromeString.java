import java.util.Scanner;
public class PalindromeString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    {
	        String a, b = "";
	        Scanner s = new Scanner(System.in);
	        a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("yes");
	        }
	        else
	        {
	            System.out.println("no");
	        }
	    }
	}
	}


