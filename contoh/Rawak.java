public class Rawak {
    public static void main(String[] args) {

            StringBuilder cetak = new StringBuilder();
         
      //jana 3 aksara
         for(int i = 0; i < 3; i++){

            char aksara = (char)(Math.random() * 26 + 'A');
            cetak.append(aksara);

         }
      //jana 4 nombor
         for(int i = 0; i < 4; i++){

            char nombor = (char)(Math.random() * 10 + '0');
            cetak.append(nombor);

         }
      //cetak output
      System.out.println("JANA NOMBOR PENDAFTARAN PELAJAR");
      System.out.println("Nombor pendaftaran pelajar: " +cetak);
    }
}
