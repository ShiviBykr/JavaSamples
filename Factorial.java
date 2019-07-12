import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=Integer.parseInt(sc.nextLine());
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*i;
        }
        System.out.print("Factorial:"+temp);
        sc.close();
    }
}