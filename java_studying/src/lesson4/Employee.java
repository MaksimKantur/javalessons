package lesson4;


public class Employee{
    int id;
    String surname;
    int age;
    double salary;
    String department;
    public Employee(int id2, String surname2, int age2){
        this (id2 ,surname2, age2, 0.0, null);
        
    }
    
    public Employee(String surname3, int age3){
        this(0, surname3, age3, 0.0, null);
    }
    public Employee(int id4, String surname4, int age4, double salary4, String department4){
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    double balanceDouble(double n){
        salary *= 2;
        return salary;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
    Employee emp1 = new Employee("petrov", 20);
    Employee emp2 = new Employee("ivanov", 40);
    
    System.out.println(emp1.balanceDouble(emp1.salary));
    System.out.println(emp2.balanceDouble(emp2.salary));;
    }
}
