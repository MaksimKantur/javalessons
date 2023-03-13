package lesson4;

public class human {
    String name;
    car2 car;
    bankAccount bA;

    void info(){
        System.out.println(name + car.color + bA.balance);
    }
}
class humantest{
    public static void main(String[] args) {
        human h = new human();
        h.name = "David";
        h.car = new car2("red", "V8");
        h.bA = new bankAccount(18, 210.58);
        h.info();
    }
}
class car2{
    car2(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class bankAccount{
    bankAccount(int id2, double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}
