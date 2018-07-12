public class abc_evenorodd {
  public static void main(String[] args){
      int a;
      System.out.println("enter the number");
      Scanner cc=new Scanner(System.in);
       a=cc.nextInt();
       if(a%2==0){
           System.out.println("the even number");
       }
       if(a%2==1)
       {
           System.out.println("the odd number");
       }
    else{
      System.out.println("Invalid");
  }
}
}
