import java.util.Scanner;

public class Permainan {
    public static void main(String[] args) {
        
   System.out.println("ATURCARA PERMAINAN MATEMATIK-OPERASI TAMBAH ");
   
    Scanner input = new Scanner(System.in);

    int nom1 = ( int )(Math.random()*101);
    int nom2 = ( int )(Math.random()*101);

    System.out.println("Nyatakan jawapan " +nom1+" + "+nom2+" = ");
    int jawapan = input.nextInt();

    while (nom1 + nom2 != jawapan) {

        System.out.println("Jawapan anda salah! sila cuba lagi...\n nyatakan jawapan " +nom1+" + "+nom2+" =");
            jawapan = input.nextInt();
            input.close();
    }

    System.out.println("Tahniah, jawapan anda benar!");

    }
}
