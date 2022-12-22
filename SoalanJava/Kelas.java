import java.util.Scanner;
public class Kelas {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
    System.out.println("Masukkan Bilangan A");
    int Bilangan = input.nextInt();

    System.out.println("Adakah anda mendapat A dalam matematik dan bahasa inggeris");
    boolean hasil = input.nextBoolean();

    input.close();

    if(Bilangan>5){
        if(hasil == true){
           System.out.println("Tahniah, Anda layak memasuki kelas 4 Sains Komputer"); 
        } 
    }
        else    
            {
                System.out.println("Maaf anda tidak layak");
            }
    } 
}
