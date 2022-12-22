public class Beli {
    public static void main(String[] args){
        String Barang;
        int kuantiti;
        double harga,jumlah;
        //umpukkan nilai
        Barang="Biskut";
        kuantiti=7;
        harga=2.98;

        jumlah=harga*kuantiti;

        System.out.println();
        System.out.println("Info item:" +Barang);
        System.out.println("Unit dibeli:"+kuantiti);
        System.out.println("Harga seunit:RM" +harga);
        System.out.println();
        System.out.println("Jumlah:"+jumlah);

    }
}
