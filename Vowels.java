    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
		
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' ||ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' ||ch=='u')
        {
            System.out.println("This is a Vowel");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
