public class environment {
    private int block = 0;
    public int  bar (){
        if (block == 1)
        {
            return 1;
        }
        else if (block == 0)
        {
            return 0;
        }
        return 0;
    }
}
