package lesson5;

public class student {
   int id;
   String name;
   String surname;
   int course;
   double mathAvg;
   double economyAvg;
   double forenAvg;
 student(int id1, String name1, String surname1, int course1, double mathAvg1, double economyAvg1, double forenAvg1){
    id = id1;
    name = name1;
    surname = surname1;
    course = course1;
    economyAvg = economyAvg1;
    mathAvg = mathAvg1;
    forenAvg = forenAvg1;
 }
 student(int id2, String name2, String surname2, int course2){
this(id2, name2, surname2, course2, 0.0,0.0,0.0);
 }
 student(){

 }
}
class studentTest{
    public static void main(String[] args) {
        student std1 = new student(1, "Ivan", "Titiov", 3, 4.4, 3.7, 5.0);
        student std2 = new student(2, "Oleg", "Vlasov", 2);
        student std3 = new student();
        System.out.println(std1.id);
        System.out.println(std2.id);
        System.out.println(std3.id);
    }
}
