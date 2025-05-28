import java.util.Scanner;
public class armstrong 
{
    public static void main(String a[])
    {
        int num, temp, rem;
        double res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        int digit = String.valueOf(num).length(); 
        temp = num;
        while(num > 0)
        {
            rem = num % 10;
            res = res + Math.pow(rem, digit);
            num = num/10;
        }
        if(res == temp)
            System.out.println("The number "+temp+" is an armstrong number.");
        else 
            System.out.println("The number "+temp+" is not an armstrong number.");
    }
}
