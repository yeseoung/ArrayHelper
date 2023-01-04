import com.sun.jdi.Method;

public class Main {
    public static int[] test_set = {1,2,3,4,5,6,7,8,9,10,11};//input set
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.print(test_set);
        arrays.outIndex(test_set,9);
        System.out.println("");
        arrays.print(test_set);







    }
}
