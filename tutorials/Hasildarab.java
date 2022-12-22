import java.util.Scanner;

public class Hasildarab {
    public static void main(String[] args) {
        System.out.println("ATURCARA PERMAINAN MATEMATIK - OPERASI DARAB");

        Scanner input = new Scanner(System.in);
        
        int nom1, nom2;
        String jawab;

        do{
             System.out.println("Nombor pertama: ");
        nom1 = input.nextInt();
        System.out.println("Nombor kedua: ");
        nom2 = input.nextInt();

        System.out.println("Hasil darab: "+nom1+" x "+nom2+" = "+ Math.abs(nom2 *nom1));

        System.out.println("Taip Y untuk teruskan...");
        jawab=input.next();
        }while(jawab.equals("Y")|| jawab.equals("Y"));
       input.close();


    } 
}
