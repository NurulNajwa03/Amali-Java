import java.util.Scanner;


public class Contoh1 {
    public static void main(String[] args) {
    
    //panggil Semula sub aturcara 1,2,3
        namaAnda();
        soalan(); 
        ucapan();
    }
//sub1
    static void soalan() {
        Scanner input =  new Scanner(System.in);
        System.out.println("Masukkan satu nombor bulat: ");
        int  nombor=input.nextInt();
        input.close();

       

    //tentukan nombor genap dan ganjil
        if (nombor %2 == 0) {
            System.out.println(nombor+" adalah nombor genap.");
        }else{
            System.out.println(nombor+" adalah nombor ganjil.");
        }
    }   
    //sub2
    static void ucapan(){
        System.out.println("Terima Kasih sila cuba lagi");
    }
    //sub3
    static void namaAnda(){
        System.out.println("TENTUKAN NOMBOR GENAP/GANJIL");

        Scanner nama = new Scanner(System.in);
        System.out.println("Nama anda: ");
        String Sendiri = nama.next();
        nama.close();
       System.out.println("Terima kasih : "+ Sendiri);
       
       
    }

}
