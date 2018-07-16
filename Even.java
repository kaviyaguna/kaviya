public class Even {
	public static void main(String args[]){
	     int n,q,i=0;
	      Scanner in=new Scanner(System.in);
	      n=in.nextInt();
	      q=in.nextInt();
	      for (i=n+1; i<q; i++)
	            if (i%2==0)
	        System.out.println(i);
	   }
}
