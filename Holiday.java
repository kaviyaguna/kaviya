import  java.util.Scanner;
public class Holiday {
public static void main(String args[]){
	String day;
	Scanner in=new Scanner(System.in);
	day=in.nextLine();
	if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")||day.equals("Saturday") ||day.equals("sunday")){
	}if(day.equals("Sunday")){
		System.out.println("yes");
	}
	else
	{
		System.out.println("Invalid");
	}
	
}
}
