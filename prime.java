public static void main(String args[]){  
		  int n,count=0; 
		  Scanner in=new Scanner(System.in);
		  n=in.nextInt();
		  for(int i=2; i<=n/2; i++){
		 if(n%i==0){
			 count++;
		 }
		  }
		 if(count>1){
		   System.out.println("no");  
		 }
		  else    
		  {
		   System.out.println("yes");    
		}  
		
	}
