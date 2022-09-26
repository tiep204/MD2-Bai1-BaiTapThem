import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("hay nhap so a bat ky vao day");
        float soA = sc.nextInt();

        System.out.println("hay nhap so b bat ky vao day");
        float soB = sc.nextInt();

        sc.nextLine();
        System.out.println("hay nhap phep tinh vao day: ");
        char tinh = sc.nextLine().charAt(0);

        switch (tinh) {
            case '+':
                System.out.println("dap an cong cua ban la:" +soA+soB);
                break;
            case '-':
                System.out.println("dap an tru cua ban la"+(soA-soB));
                break;
            case '*':
                System.out.println("dap an * cua ban la:"+(soA*soB));
                break;
            case '/':
                System.out.println("dap an / cua ban la:"+(soA/soB));
                break;

        }

    }
}
