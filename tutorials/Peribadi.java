import java.time.Year;
import java.util.Scanner;
    
    public class Peribadi {
        public static void main(String[] args){

        //pengisytiharan pembolehubah Scanner
        Scanner input = new Scanner(System.in);

        //papar teks pernyataan1 & isytihar pmbolehubah nilai input1
        System.out.println("Masukkan nama anda: ");
        String nama = input.next();

        //papar teks pernyataan2 & isytihar pmbolehubah nilai input2
        System.out.println("Masukkan tahun anda dilahirkan : ");
        int tahun = input.nextInt();
        
        //papar teks pernyataan1 & isytihar pmbolehubah nilai input3
        System.out.println("Masukkan bandar anda dilahirkan: ");
        String negeri = input.next();
        input.close();

        //pengiraan umur
        int tahunsemasa = Year.now().getValue();
        int umur=tahunsemasa-tahun;

        //paparan output
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Bandar Kelahiran : "+negeri);
        }
}