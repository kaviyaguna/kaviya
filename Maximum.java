import java.util.Scanner;
public class Maximum {
	public static void main(String args[]){
		int n,max=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println("maximum no="+max);
	}

}
