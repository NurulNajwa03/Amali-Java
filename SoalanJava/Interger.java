import java.util.Scanner;

public class Interger {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Sila masukkan nombor: ");
        int nom = input.nextInt();
        input.close();

        if(nom % 2 == 0){
            System.out.println( "nombor "+nom+" ialah nombor genap" );

        }else{
            System.out.println("nombor "+nom+" ialah nombor ganjil");
        }
    }
}
