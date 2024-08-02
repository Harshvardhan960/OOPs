package Abstract;

public class GoldCustomer extends Customer{

    GoldCustomer(String customerName) {
        super(customerName);
    }

    @Override
    double CalculatePayment(int price) {
        return 0.8 * price;
    }

    @Override
    double CalculateRewardsPoints(int price) {
        return 0.2 * price;
    }
}
