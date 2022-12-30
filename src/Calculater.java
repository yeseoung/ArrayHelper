public class Calculater {

    public Calculater(){}
    public int sum(int x,int y){
        x += y;
        return x;
    }
    public  int minus(int x,int y){
        x -= y;
        return x;
    }
    public boolean isOdd(int x) {
        if ((x % 2) == 0) {
            return false;
        } else if ((x % 2) == 1) {
            return true;
        }
        return true;
    }
    public int avg(int[] x){
        int id = 0;
        for (int i = 0; i < x.length;i++)
        {
            id += x[i];

        }
        id = id / x.length;
        return id;
    }

}
