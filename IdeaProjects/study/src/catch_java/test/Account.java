package catch_java.test;

public class Account {
    String name;
    String No;
    int number;
    public Account(String name, String No, int number){
        this.name = name;
        this.No = No;
        this.number = number;
    }
    void deposit(int num){
        number += num;
    }
    int getBalance(){
        return number;
    }
    void withdraw(int num){
        number -= num;
    }


    public static void main(String[] args) {
        Account account = new Account("유동연","1",10000);
        System.out.println("5000원 입금");
        account.deposit(5000);
        System.out.println(account.getBalance());
        System.out.println("5000원 출금");
        account.withdraw(5000);
        System.out.println(account.getBalance());
    }
}
