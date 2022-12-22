import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nombor, jumlah = 0, bilangan ;
        System.out.println("Aturcara mengira jumlah 5 nombor yang dimasukkan");

        System.out.println("Nombor" +" : ");
        nombor = input.nextInt();
        jumlah += nombor;
        input.close();

        System.out.println("Hasil tambah bagi 5 nombor di atas ialah " +jumlah);
    }
}
