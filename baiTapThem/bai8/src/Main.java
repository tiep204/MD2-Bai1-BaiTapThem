
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số gồm ba chữ số:");
        int num = sc.nextInt();
        int a, b, c;
        a = (num/100);
        b = (num%100)/10;
        c = (num%100)%10;
        System.out.println("so dao ngược la: "+c+b+a);


    }
}