package com.company;

public class Order {
    private int userId;
    private String bookName;
    private int quantity;

    public Order(int userId, String bookName, int quantity) {
        this.userId = userId;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "bookName='" + bookName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
