
public class Main {
    static int[] data = {1, 3, 5, 7, 9};
    public static void main(String[] args) {
        Calculater ca = new Calculater();

        System.out.println(ca.sum(1,2));

        System.out.println(ca.minus(1,2));

        System.out.println(ca.isOdd(2));
        System.out.println(ca.isOdd(1));

        int result = ca.avg(data);
        System.out.println(result);
    }
}