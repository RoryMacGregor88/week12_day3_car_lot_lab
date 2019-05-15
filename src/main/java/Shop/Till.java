package Shop;

public class Till {

    private double money;

    public Till() {
        this.money = 0.00;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addMoneyToTill(int money) {
        this.money += money;
    }


}
