package Abstract;

abstract class Customer
{
    private String customerName;

    Customer(String customerName)
    {
        this.customerName = customerName;
    }

    //This is Calculate abstract method
    abstract double CalculatePayment(int price);

    ///This method for Calculating rewards.
    abstract double CalculateRewardsPoints(int price);

    public String getCustomerName()
    {
        return customerName;
    }
}
