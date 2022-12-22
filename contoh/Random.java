public class Random {
    public static void main(String[] args) {
        
        double r1 = Math.random();
        int r2 = (int) (Math.random() * 20)-10;
        int r3 =(int) (Math.random()* 5)+3;

        System.out.println("nombor rawak 1 :" +r1);
        System.out.println("nombor rawak 2 :" +r2);
        System.out.println("nombor rawak 3 :" +r3);
    }
}
