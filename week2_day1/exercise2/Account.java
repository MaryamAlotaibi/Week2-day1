
public class Account {

private String id;
private String name;
private int balance=0;
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);


        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());


        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

       
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }

    private void transferTo(Account a2, int i) {
    }

    public Account (String id, String name){

}
public Account (String id, String name, int balance){

}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        return amount;
    }
   public int debit(int amount){
    return amount;
   }
   public int transferTo(int another, int Account, int amount){

       return another;
   }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

