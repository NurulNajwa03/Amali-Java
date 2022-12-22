import java.time.Year;
import java.util.Scanner;

public class Umurdewasa {
     public static void main(String[] args) {
         

    System.out.println("ATURCARA MENGIRA UMUR & PERINGKAT DEWASA");
      
    Scanner input = new Scanner(System.in);
    

    System.out.println("Taip tahun kelahiran anda dan tekan enter:");

    int tahunlahir = input.nextInt();
    input.close();
    
    int tahunsemasa;
    int Umur;
   
    tahunsemasa = Year.now().getValue();
    Umur = tahunsemasa - tahunlahir;

    if(Umur<19){
        System.out.println("Anda berumur "+Umur+" , anda belum dewasa.");
        } else{
            System.out.println("anda dah tua");
        }
    }
}
