package lesson4;

public class car{
    car(String cvet, String motor){
    color = cvet;
    engine = motor;

    System.out.println("Cvet mashini: " + color + ", motor: " + engine);
    }
    String color;
    String engine;
    int speed;
    int gaz(int scorost){
    speed+=scorost;
    return speed;
    }
    int tormoz(int scorost){
        speed-=scorost;
        return speed;  
    }
    void showInfo(){
        System.out.println("cvet " + color + " motor " + engine + " skorost' " + speed);
    }
}

class carTest {
    public static void main(String[] args) {
        car car1 = new car("yellow", "v4");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}
