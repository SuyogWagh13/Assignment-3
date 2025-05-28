public class ArmstrongNumber
{
    public static void main(String a[]) 
    {
        int num = 153;
        int temp = num;
        int res = 0;
        while (num != 0) 
        {
            int digit = num % 10;
            res = res + (digit * digit * digit); 
            num = num / 10;
        }
        if (temp == res)
            System.out.println("The number " + temp + " is an Armstrong number.");
        else
            System.out.println("The number " + temp + " is not an Armstrong number.");
    }
}
