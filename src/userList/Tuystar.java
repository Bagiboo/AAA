package userList;

public class Tuystar extends User{
    private double cashback;

    public Tuystar(int id, String name, String surname, double balance, String status, double cashback) {
        super(id, name, surname, balance, status);
        this.cashback = cashback;
    }

    public Tuystar() {
        super();
    }

    @Override
    public double calculateB(double price, double balance) {//Cashback for Tuystar
        double bonus = price*0.06;
        double result = balance-price+bonus;
        return result;
    }

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }
}
