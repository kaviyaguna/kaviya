public class Equal{
public static void main(String args[])
{
	int count=0;
   String s1, s2;
   Scanner in = new Scanner(System.in);
   s1 = in.nextLine();
   s2 = in.nextLine();
   if (s1==s2){
	   count++;
   }
	   if(count==0){
      System.out.println("yes");
   }
   else{
      System.out.println("no");
   }
}
}
