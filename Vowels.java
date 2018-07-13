    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||
        ch=='u')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}
