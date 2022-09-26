import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so day vao day");
        int num = sc.nextInt();
        int giay,phut,gio;
        giay = num/3600;
        phut = (num%3600)/60;
        gio = (num%3600)%60;
        System.out.println( "so giờ ban da đổi được là:"+gio+"h"+phut+"p"+giay+"s");
    }
}