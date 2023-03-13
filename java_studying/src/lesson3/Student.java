package lesson3;

public class Student {
   int id;
   String name;
   String surname;
   int course;
   double mathAvg;
   double economyAvg;
   double forenAvg;
   double Average(double a, double b, double c){
      mathAvg = a;
      economyAvg = b;
      forenAvg = c;
      double Average = (mathAvg + economyAvg + forenAvg)/3;
      return Average;
   }
}

class StudentTest{
   
   public static void main(String[] args) {
      
   
   Student std1 = new Student();
   Student std2 = new Student();
   Student std3 = new Student();

   std1.id = 1;
   std1.name = "Ivan";
   std1.surname = "Titov";
   std1.course = 3;
   std1.mathAvg = 4.7;
   std1.economyAvg = 3.3;
   std1.forenAvg = 5.0;
   
   std2.id = 2;
   std2.name = "David";
   std2.surname = "Doe";
   std2.course = 4;
   std2.mathAvg = 4.5;
   std2.economyAvg = 2.6;
   std2.forenAvg = 5.0;

   std3.id = 2;
   std3.name = "Daniel";
   std3.surname = "Darvin";
   std3.course = 2;
   std3.mathAvg = 3.2;
   std3.economyAvg = 4.8;
   std3.forenAvg = 4.3;
   
   System.out.println("U uchinika " + std1.name + " sredniy ball: " + std1.Average(std1.mathAvg, std1.economyAvg, std1.forenAvg));
   System.out.println("U uchinika " + std3.name + " sredniy ball: " + std2.Average(std2.mathAvg, std2.economyAvg, std2.forenAvg));
   System.out.println("U uchinika " + std3.name + " sredniy ball: " + std3.Average(std3.mathAvg, std3.economyAvg, std3.forenAvg));
   }
}
