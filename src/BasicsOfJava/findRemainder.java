package BasicsOfJava;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int a = sc.nextInt();
        System.out.print("Enter Quotient : ");
        int b = sc.nextInt();
        int q = a/b;
        int r = a - (b*q);
        System.out.print("The remainder when " +a+ " is divided by " +b+ " is " + r);
    }
}
