public class customer {
  private int ID;
  private String name;
  private char gender;

  public customer (int ID, String name, int discount){

  }

    public customer() {

    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public class Account {
        private int id;
        private double balance = 0.0;
        customer Customer = new customer();

        public void Account(int id, double balance, customer Customer) {
        }

        public int getId() {
            return id;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public customer getCustomer() {
            return Customer;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "id=" + id +
                    ", balance=" + balance +
                    ", Customer=" + Customer +
                    '}';
        }
      public String getCustomerName(){
            return Customer.name;
      }
      public double deposit(double amount){
            return amount;
      }
        public double withdraw(double amount){
            if (balance>=amount)
                balance -= amount;
            else
                System.out.println("amount with exceeds the current balance! ");

            return amount;
        }
    }

}
