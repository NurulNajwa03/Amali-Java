import java.util.Scanner;

public class Contoh {
    public static void main(String[] args) {

System.out.println("ATURCARA MENGIRA KALENDAR CINA");

    Scanner input = new Scanner(System.in);
    

System.out.println("Taipkan tahun: ");

int tahun_masihi = input.nextInt();
input.close();
int tahun_cina = tahun_masihi % 12;

    switch (tahun_cina) {

    case 0:
    System.out.println("Tahun "+tahun_masihi+"adalah"+"tahun monyet");
    break; 
    case 1:
    System.out.println("Tahun "+tahun_masihi+"adalah"+"tahun ayam");
    break;
    case 2:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun anjing");
    break;
    case 3:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun babi");
    break;
    case 4:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun tikus");
    break;
    case 5:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun lembu");
    break;
    case 6:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun harimau");
    break;
    case 7:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun arnab");
    break;
    case 8:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun naga");
    break;
    case 9:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun ular");
    break;
    case 10:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun kuda");
    break;
    case 11:
    System.out.println("Tahun "+tahun_masihi+" adalah "+"tahun kambing");
    break;
        }  
    }
}
