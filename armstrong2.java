public class armstrong2
{
    public static void main(String args[])
    {
        System.out.println("Armstrong numebers are: ");
        for(int n = 1; n <= 1000; n++)
        {
            int rem;
            double res = 0;
            int temp = n;
            int digit = String.valueOf(n).length();
            while(temp != 0)
            {
                rem = temp % 10;
                res = res + Math.pow(rem, digit);
                temp = temp/10;
            }
            if(res == n)
                System.out.print(n+" ");
        }
    }
}
