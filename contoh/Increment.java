import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {
        
        int input,i, j, k;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bilangan baris piramid terbalik : ");
        input = scan.nextInt();

            for(i=input;i>=1;i--){
                for(j=input;j>i;j--){
                    System.out.println("");
                    }
                for(k=1;k<(i*2);k++){

                    
                    System.out.println("*");
                }
                
            }
    }
}
