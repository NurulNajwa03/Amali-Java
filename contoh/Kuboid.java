public class Kuboid {
static java.util.Scanner taip = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        //istihar pembolehubah
        double papar;  
        //umpukkan nilai dengan sub aturcara fungsi
        papar = kiraLuas();
        //panggil semula nilai untuk output
        System.out.println("Isipadu bagi kuboid yang adalah "+ papar +" padu");
    }

    //sub aturcara yang berbentuk fungsi
    static double kiraLuas() {
        //istihar pembolehubah
        double panjang, lebar, tinggi, Isipadu;
                System.out.println("Panjang kuboid: ");
                    panjang = taip.nextDouble();
                System.out.println("Lebar kuboid: ");
                    lebar = taip.nextDouble();
                System.out.println("Tingi Kuboid: ");
                    tinggi = taip.nextDouble();

                    //lakukan operasi pengiraan
                    Isipadu = panjang*lebar*tinggi;

                //hantar data setelah pengiraan
                return Math.round(Isipadu);
    }
}
