import java.util.Scanner;
public class PowerFunction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base : ");
        int a=Integer.parseInt(sc.nextLine());
        int x=a;
        System.out.print("Enter the exponent : ");
        int n=Integer.parseInt(sc.nextLine());
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*a;
        }
        System.out.print("The power of "+x+" raised to "+n+" equals "+temp);
        sc.close();
    }
}