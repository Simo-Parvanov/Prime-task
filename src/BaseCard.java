public abstract class BaseCard implements Card {
    private String nameOwner;
    private double turnover;
    private double valueOfPurchase;

    public BaseCard(String nameOwner, double turnover, double valueOfPurchase) {
        this.nameOwner = nameOwner;
        this.turnover = turnover;
        this.valueOfPurchase = valueOfPurchase;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public double getValueOfPurchase() {
        return valueOfPurchase;
    }

    public void setValueOfPurchase(double valueOfPurchase) {
        this.valueOfPurchase = valueOfPurchase;
    }

}
