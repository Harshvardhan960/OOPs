package Abstract;

public class Main
{
    public static void main(String[] args) {

        //Create object of RegularCustomer
        Customer regularCustomer = new RegularCustomer("Regular Customer");
        System.out.println(regularCustomer.CalculatePayment(100));
        System.out.println(regularCustomer.CalculateRewardsPoints(100));
        System.out.println(regularCustomer.getCustomerName());

        Customer goldCustomer = new GoldCustomer("Gold Customer");
        System.out.println(goldCustomer.CalculatePayment(100));
        System.out.println(goldCustomer.CalculateRewardsPoints(100));
        System.out.println(goldCustomer.getCustomerName());
    }
}
