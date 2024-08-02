package Abstract;

public class RegularCustomer extends Customer{

    RegularCustomer(String customerName) {
        super(customerName);
    }

    @Override
    double CalculatePayment(int price) {
        return 0.9 * price;
    }

    @Override
    double CalculateRewardsPoints(int price) {
        return 0.1 * price;
    }
}
