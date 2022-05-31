import java.util.Scanner;
public class main {
    public static void main(String[] agrs) {
        int r,a;
        double pi = 3.14,alan;
        Scanner ın = new Scanner(System.in);
        System.out.print(" Lütfen Dairenin Yarı Çapını Giriniz :");
        r = ın.nextInt();
        System.out.print("Lütfen Dairenin Merkezi Açısından Ölçüsu Giriniz :");
        a = ın.nextInt();
        alan=(pi*(r*r)*a)/360;
        System.out.print("Dairenizi Alanı :"+alan);


    }
}
