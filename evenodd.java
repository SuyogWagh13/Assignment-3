import java.util.Scanner;
public class evenodd 
{
    public static void main(String a[]) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The number is an even number.");
        }
        else 
        {
            System.out.println("The numer is an odd number.");
        }
    }  
}
