import java.util.Arrays;
import java.util.Scanner;
public class Reverserepeatedno {
	public static void main(String args[]){
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int count=0,count1=n-1;
		Arrays.sort(a);
		for(int j=n-1;j>=0;j--){
			b[j]=a[j];
		}
			for(int i=0;i<n;i++){
				if(i%2!=0){
					System.out.println(b[count]);
					count=count+1;
				}
				else{
					System.out.println(b[count1]);
					count1=count1-1;
				}
			}
			
		}
	}

