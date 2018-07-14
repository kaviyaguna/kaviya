public static void main(String[] args) {
        int count = 0, num;
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        while(num != 0)
        {
            num =num/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
