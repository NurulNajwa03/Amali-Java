import java.util.Scanner;

public class Soalan2 {
    public static void main(String[] args) {
        
        int sifir, bil;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the sifir");
        sifir = input.nextInt();
        input.close();

        for(bil = 1; bil<=10; bil++){

           
            System.out.println(bil + "x" +sifir+ "=" +(bil * sifir));
        }

            
           
        }
        }


     

     