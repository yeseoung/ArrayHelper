
public class Main {
    public static int[] test_set = {1,2,3,4,5,6,7,8,9,10};//input set
    public static void main(String[] args) {
        Arrays arrays = new Arrays();//

        arrays.print(test_set);
        arrays.declare(test_set);//declare all elements of parameter's array to 0
        arrays.indeter(test_set,0);//print index of element
        arrays.print(test_set);//print all of array's elements
        arrays.replace(test_set,0,10);
        arrays.print(test_set);

    }
}
