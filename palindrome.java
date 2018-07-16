public static void main(String args[]){  
		  int n,r,sum=0,temp=0; 
		  Scanner in=new Scanner(System.in);
		  n=in.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)  {  
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
