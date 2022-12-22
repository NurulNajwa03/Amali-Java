public class cuba {
    public static void main(String[] args) {
         int w=1, x=1, y=1, z=1;
         int a = w++;
         int b = ++x;
         int c = y--;
         int d = --z;

         System.out.println("post increment  a=" +a+ " = " +w);
         System.out.println("pre increment  b=" +b+ " = " +x);
         System.out.println("post decrement  c=" +c+ " = " +y);
         System.out.println("pre decrement  d=" +d+ " = " +z);
    }
}
