import java.util.*;

public class Array{
    Scanner sc = new Scanner(System.in);
    public static final Array ar = new Array();//자기자신호출
    public int[] declare(int[] arr){
        for (int i = 0;i < arr.length;i++){
            arr[i] = 0;
        }
        return arr;
    }

    public  void print(int[] arr) {
        System.out.printf("[");
        for(int i = 0;i < arr.length;i++){
            System.out.printf(String.format("%d",arr[i]));
            if(i == arr.length -1){
                break;
            }
            System.out.printf(",");

        }
        System.out.printf("]");
        System.out.println("");
    }
    public void print(String[] arr){
        System.out.printf("[");
        for(int i = 0;i < arr.length;i++){
            System.out.printf(String.format("%s",arr[i]));
            if(i == arr.length -1){
                break;
            }
            System.out.printf(",");

        }
        System.out.printf("]");
        System.out.println("");
    }

    public void indeter(int[] arr, int a){
        System.out.println(arr[a]);
    }
    public void indeter(String[] arr, char a) { System.out.println(arr[a]); }//String 배열 오버로딩

    public  void replace(int[] arr,int target,int metamon) {
        if (target > arr.length){
            System.out.println(String.format("target[%d]is out of lange",target));
        }
        arr[target] = metamon;


    }
    public void replace(String[] arr,int target,String metamon){
        if (target > arr.length){
            System.out.println(String.format("target[%d]is out of lange",target));
        }
        arr[target] = metamon;

    }

    public int outIndex(int[] arr,int targetIndex){

        if (targetIndex == 0){
            for(int i = targetIndex;i < arr.length - targetIndex - 1;i++) {
                arr[i] = arr[i + 1];
            }
        }
        else if (targetIndex >= arr.length) {
            System.out.println("out of range");

        }
        else {
            for (int i = targetIndex; i <= arr.length - 2; i++) {
                arr[i] = arr[i + 1];
            }
        }
        arr[arr.length -1] = 0;
        return arr[targetIndex];
    }

    public int[] duplicate(int[] arr) {
        int size = arr.length;
        int[] repude_arr = new int[size];

        for (int i = 0;i<arr.length;i++){
            repude_arr[i] = arr[i];
            arr[i] = 0;
        }

        for (int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr.length;j++){
                if(repude_arr[i] != arr[j]){
                    arr[i] = repude_arr[i];
                }
                else if (repude_arr[i] == arr[j]){
                    repude_arr[i] = 0;
                }

            }
        }

        return  arr;

    }

    public int[] pop(int[] arr){
        arr[-1] = 0;
        return arr;
    }
    public int[] push(int[]arr, int n){
        int[] pushed_arr = new int[arr.length + 1];

        for(int i = 0; i<arr.length;i++){
            pushed_arr[i] = arr[i];
        }
        pushed_arr[pushed_arr.length-1] = n;
        return pushed_arr;
    }

    private  void testMethod() {
        System.out.println("just test");
    }
}
