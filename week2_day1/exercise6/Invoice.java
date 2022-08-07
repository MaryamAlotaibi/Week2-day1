public class Invoice {
    private int id;
    private customer=new Customer;
    private double amount;

 public Invoice(int id, Customer customer, double amount){

 }

    public int getId() {
        return id;
    }
    public double getCustomer() {
        double Customer;
        return Customer;
    }

    public void setCustomer() {
        this.setCustomer();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}


public class Customer extends Invoice{

    public Customer(int id, Customer customer, double amount) {
        super(id, customer, amount);

    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}
