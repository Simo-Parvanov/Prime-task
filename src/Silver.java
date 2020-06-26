public class Silver extends BaseCard{
    private double discountRate;
    public Silver(String nameOwner, double turnover, double valueOfPurchase) {
        super(nameOwner, turnover, valueOfPurchase);
        this.setDiscountRate(discountRate);
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        if (this.getValueOfPurchase() < 0 || this.getTurnover() < 0){
            throw new IllegalArgumentException(String
                    .format("An incorrect value for turnover or purchase has been entered in class %s!",
                            this.getClass().getName()));
        }
        this.discountRate = discountRate;
        discountRate = 2;
        if (this.getTurnover() > 350) {
            discountRate = 3.5;
        }
        this.discountRate = discountRate;
    }

    @Override
    public double[] getTotalDiscount() {
        double[] result = new double[2];
        result[0] = (this.getValueOfPurchase() * this.discountRate) / 100;
        result[1] = this.getValueOfPurchase() - result[0];
        return result;
    }

    @Override
    public String print() {
        String s = "%";
        return String.format("Purchase value: $%.2f\n" +
                        "Discount rate: %.2f%s\n" +
                        "Discount: $%.2f\n" +
                        "Total: $%.2f",
                this.getValueOfPurchase(),
                this.discountRate,
                s,
                this.getTotalDiscount()[0],
                this.getTotalDiscount()[1]);
    }
}
