import java.util.Scanner;

public class Markah {
    public static void main(String[] args) {

        System.out.println("APAKAH KEPUTUSAN ANDA");

        //istihar
        Scanner input = new Scanner(System.in);

        //paparteks
        System.out.println("Masukkan KEPUTUSAN anda dan tekan enter:");
        int keputusan = input.nextInt();
        input.close();

        //istihar pemboleh ubah input
        int lulus = 55;
        
        //istihar
        if(keputusan >= lulus) {
            System.out.println(" Tahniah, Anda lulus");
        } else{
            System.out.println("Anda gagal, sila cuba lagi");
        }
        
    }
}
