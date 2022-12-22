import java.util.Scanner;

public class Soalan1 {
    public static void main(String[] args) {

        int n, i, sum=0;
        System.out.print("Enter range ");
        Scanner r = new Scanner( System.in);
        n=r.nextInt();
        r.close();

       
    
             if (n%2==0) {
            for(i=0;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.print("sum of even numbers "+sum);
            
        } else {
            for(i=1;i<=n;i=i+2){
                sum=sum+i;
            }
            System.out.print("sum of odd numbers "+sum);
        }

    //     System.out.println("ATURCARA MATEMATIK- TAMBAH NOMBOR GENAP & GANJIL");
    //     Scanner input = new Scanner(System.in);

    //     System.out.println("taip nombor rendah");
    //     int nom1 = input.nextInt();
    //     System.out.println("taip nombor rendah");
    //     int nom2 = input.nextInt();
    //     input.close();

    //     int jumgenap = 0, jumganjil = 0;
    //     int nombor = nom1;

        
       
    //     //output
    //     System.out.println("jumlh nombor-nombor ganjil dari" +nom1+ " ke " +nom2+" adalah " +jumganjil);
    //     System.out.println("jumlh nombor-nombor genap dari" +nom1+ " ke " +nom2+" adalah " +jumgenap);

       

    }
}
