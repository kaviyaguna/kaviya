public class abc_positiveandnegative {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
   int a;
   System.out.println("enter the number");
   Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
      if (a==0)
         {
             System.out.println("The Zero number");
         } 
     

      else  if(a>0)
          {
             System.out.println("The positive number");
          }
         else 
         {
         System.out.println("The negative number");
         }
         
     }
    

}
