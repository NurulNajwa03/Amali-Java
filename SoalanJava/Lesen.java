import java.time.Year;
import java.util.Scanner;

public class Lesen {
    public static void main(String[] args) {

        System.out.println("BERAPAKAH UMUR ANDA");

        //istihar
        Scanner input = new Scanner(System.in);

        //paparteks
        System.out.println("Masukkan tahun lahir:");
        int tahunlahir = input.nextInt();
        input.close();
        
        int tahunsemasa;
        int Umur;
       
        tahunsemasa = Year.now().getValue();
        Umur = tahunsemasa - tahunlahir;
    
        if(Umur<16){
            System.out.println("Maaf anda belum layak memohon lesen motosikal.");
            } else{
                System.out.println("Anda telah layak memohon lesen motosikal");
            }
        }
}
