
    public static void main(String[] args) 

    {

        int n, max=0;
        int a[] = new int[] {1,2,3,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
            }
        System.out.println("Maximum value:"+max);
    }
