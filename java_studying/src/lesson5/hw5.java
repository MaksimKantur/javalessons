package lesson5;

public class hw5 {
    int sum(){
        int result = 0;  
        return result;
    }
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return sum(a, b) + c;
    }
    int sum(int a, int b, int c, int d){
        return sum(a, b, c) + d;
    }
}
class hw5Test{
public static void main(String[] args) {
    int a = 10;
    int b = 11;
    int c =12;
    int d = 13;
    hw5 s1 = new hw5();
    hw5 s2 = new hw5();
    hw5 s3 = new hw5();
    hw5 s4 = new hw5();
    hw5 s5 = new hw5();
    s1.sum();
    s2.sum(a);
    s3.sum(a, b);
    s4.sum(a, b, c);
    s5.sum(a, b, c, d);
    System.out.println(s1.sum());
    System.out.println(s2.sum(a));
    System.out.println(s3.sum(a, b));
    System.out.println(s4.sum(a, b, c));
    System.out.println(s5.sum(a, b, c, d));
}
}