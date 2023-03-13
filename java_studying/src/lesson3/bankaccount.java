package lesson3;

public class bankaccount {
    int id;
    String name;
    double balance;
    double popolnenieScheta(double x){
        balance += x;
        return balance;
     }
     double snyatieSoScheta(double y){
         balance -= y;
         return balance;
     }
    public static void main(String[] args) {
        bankaccount MyAccount = new bankaccount();
        bankaccount YourAccount = new bankaccount();
        bankaccount HisAccount = new bankaccount();

        MyAccount.id=1;
        MyAccount.name="Maxim";
        MyAccount.balance= 12.33;

        YourAccount.id=2;
        YourAccount.name="Kate";
        YourAccount.balance= 133.13;

        HisAccount.id=3;
        HisAccount.name="James";
        HisAccount.balance= 300.21;

        System.out.println(MyAccount.popolnenieScheta(MyAccount.balance));
        System.out.println(YourAccount.popolnenieScheta(YourAccount.balance));
        System.out.println(HisAccount.popolnenieScheta(HisAccount.balance));
    }
}
