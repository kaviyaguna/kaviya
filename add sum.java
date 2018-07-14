public static void main(String args[])
    {
		int n,k,sum=0;
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<k;i++){
			sum=sum+a[i];
		}
       System.out.println(sum);
		}
