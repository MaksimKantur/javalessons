package lesson4;

public class lesson4 {  
    double sum(Double a, double b, double c) {
        double result = a + b + c;
        return result;
    }
    double sredneeArifmeticheskoe(double a1, double b1, double c1){
        double result2 = sum(a1, b1,  c1) /3;
        return result2;
    }
}
class lesson4test2{
    public static void main(String[] args) {
        lesson4 l2 = new lesson4();
        double chislo = l2.sredneeArifmeticheskoe(5, 3, 3);
        System.out.println(chislo);
    }
}
class lesson4test{
    public static void main(String[] args) {
        lesson4 l = new lesson4();
       double sumOfThreeNums = l.sum(1.0, 4.0, 6.0);
        System.out.println(sumOfThreeNums);
        System.out.println(l.sredneeArifmeticheskoe(20, 40, 60));
    }
}