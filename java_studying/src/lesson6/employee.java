package lesson6;

public class employee {
    private double salary;
    public String surname;
    int id;
    public double employeeSalary(){
        double result = salary;
        return result;
        
    }
    public String employeeSurname(){
        String result = surname;
        return result;
    }
    public int employeeId(){
        int result = id;
        return result;
    }
    public employee(String surname1){
    surname = surname1;
    }
    employee(int id1){
        id = id1;
        }
    private employee(double salary1){
    salary = salary1;
    }
    public static void main(String[] args) {
        employee emp3 = new employee(500.50);
        System.out.println(emp3.salary);
    }
}

class employeeTest{
    public static void main(String[] args) {    
    employee emp1 = new employee(1);
    employee emp2 = new employee("Stasy");
    //employee emp3 = new employee(500.50);
    System.out.println(emp1.id);
    System.out.println(emp2.surname);
    }
}
