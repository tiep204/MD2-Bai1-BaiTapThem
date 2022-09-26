import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập nắm vào đây");
        int nam = sc.nextInt();
        System.out.println("hãy nhập tháng vào đây");
        int thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng nay la thang co 31 ngay");
                break;
            case 4:
            case 9:
            case 11:
                System.out.println("tháng này là tháng có 30 ngày");
                break;
            case 2:
                if(nam % 4 == 0 && nam%100 !=0 || nam % 400 == 0){
                    System.out.println("tháng này là tháng có 29 nagy");
                }else{
                    System.out.println("tháng này là tháng có 28 ngày");
                }
        }
    }
}