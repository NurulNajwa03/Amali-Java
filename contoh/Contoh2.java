public class Contoh2 {
    public static void main(String[] args) {
        String[] senaraiNama = {"Kamal","Izzati","Ahmad","Nurul"};
        String[]  senaraiRumahSukan = {"Marikh","Pluto","Bumi","Zuhrah"};
        double[] senaraiMata = new double[4];
            senaraiMata[0] = 35.2;
            senaraiMata[1] = 44.2;
            senaraiMata[2] = 56.1;
            senaraiMata[3] = 29.4;
        System.out.println("KEDUDUKAN MARKAH UNTUK 4 PESERTA");
        System.out.println("PESERTA\tRUMAH\tMATA");
        for(int i=0; i<4;i++){
        System.out.print(senaraiNama[i] +"\t");
        System.out.print(senaraiRumahSukan[i]+"\t");
        System.out.print(senaraiMata[i]);
        System.out.println();}
        


    }
}
