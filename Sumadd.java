import java.util.Scanner;
public class Sumadd{
public static void main(String args[]){
	int n,b=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
	 b+=a[i];
	
	}
	System.out.println(b);
}
}
