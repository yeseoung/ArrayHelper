import com.sun.jdi.Method;

public class Main {
    public static int[] test_set = {0,0,0,0,0,0,0,0,0,0,0,1};//input set
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.print(test_set);
        System.out.println(arrays.outIndex(test_set,2));
        arrays.print(test_set);







    }
}
