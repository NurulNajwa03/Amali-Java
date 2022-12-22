import java.util.Scanner;

public class Merdeka {
    public static void main(String[] args) {

        System.out.println("ATURCARA TENTUKAN ANDA LAHIR SEBELUM ATAU SELEPAS MERDEKA");

        //istihar
        Scanner input = new Scanner(System.in);

        //paparteks
        System.out.println("Masukkan tahun anda dilahirkan dan tekan enter:");
        int lahir = input.nextInt();
        input.close();

        //istihar pemboleh ubah input
        int Merdeka = 1957;
        
        //istihar
        if(lahir > Merdeka){
            System.out.println("Anda dilahirkan selepas merdeka");
        } else{
            System.out.println("Anda dilahirkan sebelum merdeka");
        }
        
    }
    
}
