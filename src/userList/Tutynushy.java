package userList;

public class Tutynushy extends User{

    public Tutynushy(int id, String name, String surname, double balance, String status) {
        super(id, name, surname, balance, status);
    }

    public Tutynushy() {
        super();
    }

    @Override
    public double calculateB(double price, double balance) {//Nothing for Tutynushy
        double result = balance-price;
        return result;
    }
}
