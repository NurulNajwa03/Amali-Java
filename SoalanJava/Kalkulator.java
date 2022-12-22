import java.util.Scanner;

public class Kalkulator {
    public static void main(String[]args) { 
       
    
    Scanner input = new Scanner(System.in);
     
        //variable 
     
        final double centi,fahren,batu; 
     
        //masukkan nilai 
        System.out.println("Sila Memasukkan nilai Milimeter :"); 
           double mm = input.nextDouble(); 
     
        System.out.println("Sila Memasukkan nilai Celcius :" ); 
           double cel = input.nextDouble(); 
         
        System.out.println("Sila Memasukkan nilai Kilometer :"); 
           double km = input.nextDouble(); 
     
        input.close(); 
     
    //operasi 
     
     centi = mm /10; 
     fahren = cel * 33.8000; 
     batu = km * 0.62; 
     
     
    //output 
     
    System.out.println(); 
    System.out.println("pertukaran milimeter ke centimeter: " +centi); 
    System.out.println(); 
    System.out.println("pertukaran calcius ke fahrenheit: " +fahren); 
    System.out.println(); 
    System.out.println("pertukaran kilometer ke batu: " +batu); 
    System.out.println(); 
      }
}
