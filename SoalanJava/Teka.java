import java.util.Scanner;

public class Teka {
    public static void main(String[] args) {
        //istihar
        Scanner sc = new Scanner(System.in);
        
        System.out.println("sila masukkan 1 aksara sahaja : ");
        char aksara = sc.next().charAt(0) ;
        char jawapan = 'H';
        sc.close();

        if(jawapan != aksara){
            System.out.println("Maaf anda silap");
        } else{
            System.out.println("Tahniah, anda berjaya");
        }
        
    }
}
