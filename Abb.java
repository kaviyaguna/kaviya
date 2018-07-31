import java.util.Scanner;
public class Abb {
public static void main(String args[]){
       String str;
       Scanner in=new Scanner(System.in);
       str=in.nextLine();
       String s[]=str.split(" ");
	for(int i=0;i<s.length;i++){
		System.out.println((s[i].substring(0,1)).toUpperCase()+s[i].substring(1));
}
}
}
