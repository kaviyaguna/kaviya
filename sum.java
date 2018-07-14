public static void main(String args[])
    {
		int x,i=1,sum=0;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		while(i<=x){
        	sum=sum+i;
       i++;
    	   }
       System.out.println(sum);
    
    }
