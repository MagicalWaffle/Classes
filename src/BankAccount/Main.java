package BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount bk= new BankAccount("123243435",212,"Ardit Ddaku","arditdaku@gmail.com","0457723123123");
        bk.withdraw(100);
        bk.deposit(500);
        bk.withdraw(40);
        System.out.println(bk.getBalance()+" $ ");
        bk.getCustomerEmail();

        VipCustomer person1= new VipCustomer("Diti",4000, "ditiditi@gmail.com");

    }
}
