public class Findingevendigits {
    public static void main(String[] args)
    {
       int[]nums={12,44,567,842};
        System.out.println();
    }
    static boolean display(int []nums)
    {
        int element=evendigit();
        if (element%2==0)
        {
           return true;
        }return false;

    }
    static int evendigit(int nums)
    {
        int count=0;
        while(nums>0)
        {
          count++;
          nums=nums/10;

        }
    }
}
