import java.util.Scanner;
public class contoh {
    public static void main (String args[]){

        //pengisytiharaan pemboleh ubah
        Scanner input = new Scanner(System.in);
        
    System.out.println("ATURCARA MENENTUKAN TAHAP UMUR");
    System.out.println("Taip umur anda dan tekan enter");
    int umur = input.nextInt();
    input.close();
    
        if(!(umur > 11)){
            System.out.println("Anda masih kanak kanak");
        }else if (umur >= 11 && umur <= 18){
            System.out.println("Anda masih remaja");
        }else if(umur > 18 && umur <= 35){
            System.out.println("anda masih dewasa");
        }else if(umur == 36 || umur <= 60){
            System.out.println("Anda sudah dipertengahan dewasa");
        }else{
            System.out.println("anda sudah warga emas");
        }
    }
}


