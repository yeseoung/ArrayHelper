
public class Main {
    public static void main(String[] args) {
        Driver Di = new Driver("고예성",1000);//객체생성,생성자 호출과 초기화
        Rookie rk = new Rookie("루키",100,3);
        Di.riding();
        Di.Watching();
        rk.lose();



    }
}