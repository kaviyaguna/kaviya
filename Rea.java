import java.util.Scanner;
public class Rea{
	public static void main(String args[]){
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
			  int cnt = 0;
			  for (int i = 0; i < a.length; i++) {
			   for (int j = i + 1; j < a.length; j++) {
			    if (a[i] == a[j]) {
			     System.out.println(a[i]);
			     cnt++;
			    }
			   }
			  }
			 }
			}

