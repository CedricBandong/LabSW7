public class RegularCustomer extends Customer {

  public RegularCustomer(String name) {
    super(name);
  }

  @Override
  public double calculateDiscount(double amount) {
    return 0.0; // No discount for Regular
  }
}
