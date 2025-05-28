import java.util.*;
public class Prime
{
    public static void main(String a[])
    {
        int n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(int i = 2; i<n; i++)
        {
            if(n % i == 0)
                flag = 1;
        }
        if(flag==0)
            System.out.println("The number " +n+ " is a prime number.");
        else
            System.out.println("The number " +n+ " is not a prime number.");
    }   
}
