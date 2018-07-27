import java.util.Scanner;
public class Nonreapeat{
public static void main(String args[]){
	int n,count=0,count1=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			if(i!=j){
				if(a[i]!=a[j]){
					count=1;
				}
				else{
					count=0;
					break;
				}
			}
		}
		if(count==1){
			count1++;
			System.out.println(a[i]+" ");
		}
	}
	System.out.println(" ");
	}
}
