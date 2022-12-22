import java.util.Scanner;
public class Sfera {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double formula;

        System.out.println("Masukkan isipadu sfera");
        double jejari = input.nextDouble();
        input.close();

        formula = (1.3*3.142*(jejari*jejari*jejari));

        if(formula == formula){
            System.out.println();
            System.out.println("Isipadu sebuah sfera ialah : " +formula);
        }

         
    }
}
