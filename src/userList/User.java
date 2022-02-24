package userList;

import com.company.Order;

import java.util.ArrayList;

public abstract class User {
    private int id;
    private String name;
    private String surname;
    private double cardBalance;
    private ArrayList<Order> orderHistory;
    private String status; //Status type(Tuys,Tutynushy,Tanys)

    protected User(int id, String name, String surname, double cardBalance, String status) {//constructor criteries
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cardBalance = cardBalance;
        this.status = status;
        orderHistory = new ArrayList<Order>();
    }

    public User() {//

    }

    public int getId() {
        return id;
    }//For Id

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }//For Name

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getCardBalance() {
        return cardBalance;
    }//User's card balance value

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public ArrayList<Order> getOrderHistory() {
        return orderHistory;
    } //User's buy history

    public void setOrderHistory(ArrayList<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract double calculateB(double price, double balance);//Card balance changing after purchase

    public void addOrderToUser(Order order) {//Fills User's buy history
        if (!orderHistory.contains(order)) {
            orderHistory.add(order);
        }
    }

    public void printHistory() {//Displays buy history
        for (int i=0; i<orderHistory.size(); i++) {
            System.out.println((i+1) + ": " + orderHistory.get(i).toString());
        }
    }

    @Override
    public String toString() {//Displays User information
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + cardBalance +
                ", status='" + status + '\'' +
                '}';
    }
}
