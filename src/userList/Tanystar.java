package userList;

public class Tanystar extends User{

    public Tanystar(int id, String name, String surname, double balance, String status) {
        super(id, name, surname, balance, status);
    }

    public Tanystar() {
        super();
    }

    @Override
    public double calculateB(double price, double balance) {
        double result = balance-price;
        return result;
    }

    public double calculate(double price, int quantity) {//Sale calc. for Tanystar
        double result = 0;
        if (quantity > 1) {
            result = (price*quantity) - (price*quantity*0.05);
            return result;
        }
        else {
            return price;
        }
    }
}
