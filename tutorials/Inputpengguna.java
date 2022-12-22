import java.util.Scanner;

public class Inputpengguna {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        input.close();

        System.out.println("masukkan nilai jejari bulatan:");

        double jejari = input.nextDouble();

        double luas = Math.round((jejari*jejari*3.14159)*100.0)/100.0;

        System.out.println("Luas bulatan dengan jejari "+jejari+" adalah " +luas);

    }
}
