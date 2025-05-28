public class pal 
{
    public static void main(String args[])
    {
        System.out.println("All the palindrome numbers from 1 to 100 are: ");
        for(int n = 1; n <= 100; n++)
        {
            int org = n;
            int rem, rev = 0;
            int temp = n;
            while(temp > 0)
            {
                rem = temp % 10;
                rev = (rev * 10) + rem;
                temp = temp/10;
            } 
            if(rev == org)
                System.out.print(org+" ");
        }
    }
}
