import java.util.Scanner;

public class cmachine {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("ILk Sayinizi Yazin : ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayinizi Yazin : ");
        n2 = input.nextInt();

        System.out.println(" 1)Toplama \n 2)Cikarma \n 3)Carpma \n 4)Bolme : ");
        System.out.print("Lutfen Yapmak Istediginiz Islemi Seciniz : ");
        select = input.nextInt();

        if (select == 1) {
            System.out.print("Toplama Sonucu : " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Cikarma Sonucu : " + (n1 - n2));
        } else if (select == 3) {
            System.out.print("Carpma Sonucu: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.print("Bolme sonucu : " + (n1 / n2));
            } else {
                System.out.print("Sayi 0'a Bolunemez");
            }

        }else {
            System.out.print("Yanlis Secim Yaptiniz Tekrar Deneyin!");
        }

    }
}
