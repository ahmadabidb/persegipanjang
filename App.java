import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int panjang, lebar, luas;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan panjang : ");
        panjang = scan.nextInt();

        System.out.print("Masukkan lebar : ");
        lebar = scan.nextInt();

        luas = panjang * lebar;
        
        System.out.println("Luas Persegi Panjang adalah " + luas);
  }
}
