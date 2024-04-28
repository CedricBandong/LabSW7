public class StudentCustomer extends Customer {

  public StudentCustomer(String name) {
    super(name);
  }

  @Override
  public double calculateDiscount(double amount) {
    return amount * 0.05;
  }
}
