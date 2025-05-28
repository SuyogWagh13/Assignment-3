import java.util.Scanner;
public class tab 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Table of the given number is: ");
        for(int i=1; i<=10; i++)
        {
            int table = i * n;
            System.out.println(table);
        }
    }
}
