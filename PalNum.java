import java.util.Scanner;
public class PalNum 
{
    public static void main(String args[])
    {
        int num, rev = 0, rem, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        temp = num;
        while(num > 0)
        {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        if(rev == temp)
            System.out.println("The number "+temp+ " is a palindrome number.");
        else 
        System.out.println("The number "+temp+ " is not a palindromen number.");
    }
}
