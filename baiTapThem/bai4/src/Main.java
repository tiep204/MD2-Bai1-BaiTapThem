import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        /// nhap thong tin sinh vien bao gom:
        // ma sinh vien
        // ten sinh vien
        // tuoi
        // gioi tinh
        // email
        // so dien thoai
        // dia chi

        Scanner sc = new Scanner(System.in);
        System.out.println("***************STUDENT INFORMATION************");
        //b1. thong bao nhap
        System.out.println("ban hay nhap ma sinh vien:");

        String maSV = sc.nextLine();

        System.out.println("hay nhap ten sinh vien:");
        String tenSV = sc.nextLine();

        System.out.println("hay nhap tuoi cua sinh vien:");
        String tuoi = sc.nextLine();

        System.out.println("hay nhap gioi tinh cua sinh vien nam:true,nu:false");
        Boolean gioiTinh = Boolean.parseBoolean(sc.nextLine());

        System.out.println("hay nhap email cua sinh vien:");
        char email = sc.nextLine().charAt(0);

        System.out.println("hay nhap so dien thoai cua sinh vien vao day:");
        int sdt = Integer.parseInt(sc.nextLine());

        System.out.println("hay nhap dia chi cua sinh vien:");
        String diaChi = sc.nextLine();

        System.out.printf("%10s%1s%30s%1s%20s%1s \n","Student ID: ",maSV,"Student Name: ",tenSV,"Age:",tuoi);

        System.out.printf("%10s%1s%30s%1s%30s%1s \n","Gender: ",gioiTinh,"Email: ",email,"Phone:",sdt);

        System.out.println("Addess:"+diaChi);
    }
}