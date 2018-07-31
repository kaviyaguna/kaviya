import java.util.Scanner;
public class Primecount {
	public static void main(String args[]){
		 int n,m,count=0,count1=0; 
		  Scanner in=new Scanner(System.in);
		  n=in.nextInt();
		  m=in.nextInt();
		  for(int i=n; i<=m; i++){
			  
			  for(int j=2;j<i;j++){
		 if(i%j==0){
			 count++;
			 break;
		 }
		  
			  else{
				  count=0;
			  }
			  }
		  if(count==0){
			count1++;
		  }
		  }     
		  System.out.println(count1);
		}  
			  }

