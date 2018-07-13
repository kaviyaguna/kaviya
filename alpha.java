public static void main(String args[]){
char c;
Scanner in=new Scanner(System.in);
ch=in.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.println(ch+ "alphabet");
}
else
{
System.out.println(ch+ "not alphabet");
}
