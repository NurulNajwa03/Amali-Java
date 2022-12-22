import java.util.Scanner;

public class Gred {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int sains =80; 
        //masukkan input 
        System.out.println("Masukkan gred math anda : "); 
        int gred= input.nextInt(); 
 
        input.close(); 

    
 
        if (gred == sains ) { 
            System.out.println("Gred yang diperoleh sama"); 
        } 
        else{ 
            System.out.println("Gred yang diperoleh tidak sama");  
        } 
    }
}
 