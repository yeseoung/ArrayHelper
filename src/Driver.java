public class Driver{

    static int a = 1;//클래스변수
    int a1 = 1;
    public String Name;

    public int speed;
    environment env = new environment();

    public Driver(String _Name,int _speed){
        this.Name = _Name;
        this.speed = _speed;
    }//생성자
    public void riding() {
        System.out.println("class" + Driver.a );
        System.out.println(String.format("%s is riding on %dKm",Name,speed));
    }
    public void Watching() {
        int front_state = env.bar();
        if (front_state == 1)
        {
            System.out.println(String.format("Stop!%s!",Name));
        }
        else if (front_state == 0)
        {
            System.out.println(String.format("Go!%s!",Name));
        }
    }
}

class Rookie extends Driver{//상속받는 서브클래스는 상속하는 슈퍼클래스와 시그니처 (매개변수)가 동일 해야함
    private int grade; //인스턴스 변수
    public Rookie(String _Name, int _speed,int grade) {
        super(_Name, _speed);
        this.grade = grade;
    }
    public void lose() {
        System.out.println("super class" + Driver.a);
        System.out.println(String.format("%s:%d grade![%dKm]",Name,grade,speed));
    }

}
