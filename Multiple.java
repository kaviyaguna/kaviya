import java.util.Scanner;
public class Multiple {
        public static void main(String[] args) 
        {
            Scanner s = new Scanner(System.in);
    	System.out.print("Enter number:");        
    	int n=s.nextInt();
            for(int i=1; i <= 5; i++)
            {
                System.out.println(n*i);
            }

        }

    }
