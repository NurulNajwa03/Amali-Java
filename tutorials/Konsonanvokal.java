import java.util.Scanner;

public class Konsonanvokal {
    
    public static void main(String[] args) {
        
    System.out.println("ATURCARA BILNAGA HURUF KONSONAN & VOKAL ");

    Scanner input = new Scanner(System.in);

    System.out.println("Taipkan satu perkataan dan tekan enter ");
    String perkataan = input.next();
    char[] hurufv = perkataan.toCharArray();
    int vokal = 0 ;
    input.close();
    //kawalan ulangan for

        for(char h: hurufv){
            if(h == 'a' || h == 'A' || h == 'e' || h == 'E' || h == 'i' || h == 'I' || h == 'o' || h == 'O' || h == 'u' ||h == 'U'  ){
                
            //PENAMBAH
            vokal++;
            }
        }
        //OUTPUT
        System.out.println();
        System.out.println("bilangan huruf vokal dalam " +perkataan+" adalah: " +vokal);
        System.out.println();
        System.out.println("bilangan huruf konsonan dalam " +perkataan+" Adalah: " +(hurufv.length - vokal));
    }
}
