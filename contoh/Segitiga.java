import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

            //istihar pembolehubah
            double lebar, tinggi;
            System.out.println("Kira Luas Segitiga: ");

            //ambil nilai tinggi 
            System.out.println("tinggi segitiga: " );
            tinggi = keyboard.nextDouble();
            //ambil nilai lebar
            System.out.println("Lebar segitiga : ");
            lebar = keyboard.nextDouble();
            keyboard.close();


            //panggil subaturcara
            kiraSegitiga(tinggi,lebar);
    }

    private static void kiraSegitiga(double tinggi, double lebar) {
        //laksana operasi tanpa pulangkan nilai
        double luas = 0.5*tinggi*lebar;
        System.out.println("Luas segitiga adalah " +luas+" persegi.");
    }
}
