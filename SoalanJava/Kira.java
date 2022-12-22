import java.util.Scanner; 
public class Kira{ 
    public static void main(String []args) { 
        Scanner input = new Scanner(System.in); 
 
       final double purata,jumlah; 
        double peratus; 
       //papar teks 
       System.out.println("Masukkan markah BM:"); 
       int bahasa = input.nextInt(); 
 
       System.out.println("Masukkan markah SEJ:"); 
       int sejarah  = input.nextInt(); 
       input.close(); 
        //operasi 
 
       jumlah = bahasa+ sejarah; 
       purata = jumlah / 2; 
       peratus = ((jumlah / 100) * 100); 
 
        //jumlah keseluruhan
 
        System.out.println(); 
        System.out.println("Jumlah keseluruhan: " +jumlah); 
        System.out.println(); 
        System.out.println("purata markah : " +purata); 
        System.out.println(); 
        System.out.println("nilai peratus ialah: " +peratus); 
        
     
    } 
     
}