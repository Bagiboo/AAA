package com.company;

import java.util.ArrayList;
import userList.*;
import exceptions.*;

public class SalesManagement {
    private ArrayList<Books> books;
    private ArrayList<User> users;
    private ArrayList<Order> orders;
    private Tutynushy o = new Tutynushy();
    private Tanystar p = new Tanystar();
    private Tuystar l = new Tuystar();

    public SalesManagement() {
        books = new ArrayList<Books>();
        users = new ArrayList<User>();
        orders = new ArrayList<Order>();
    }

    //add methods
    public void addUser(User user) throws NullPointerException, existE {//Adds User to array
        if (user == null) {
            throw new NullPointerException("No written elements");
        } else {
            for (int i = 0; i < users.size(); i++) {//checks for User existing
                if (users.get(i).getId() == user.getId()) {
                    throw new existE("User has already been added");
                }
            }
        }
        users.add(user);
        System.out.println("User has been added");
    }

    public void addBook(Books books) throws NullPointerException, existE {//Same like User's
        if (books == null) {
            throw new NullPointerException("No written elements");
        } else {
            for (int i = 0; i < this.books.size(); i++) {
                if (this.books.get(i).getId() == books.getId()) {
                    throw new existE("Product has already been added");
                }
            }
        }
        this.books.add(books);
        System.out.println("Product has been added");
    }

    public void addOrder(Order order) throws notFoundE, NullPointerException {
        if (order == null || order.getQuantity() == 0) {
            throw new NullPointerException("No written elements");
        }
        boolean a = false;
        boolean b = false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == order.getUserId()) {
                a = true;
                for (int j = 0; j < books.size(); j++) {
                    if (books.get(j).getName().equals(order.getBookName())) {
                        b = true;
                        int quantity = books.get(j).getQuantity();
                        if (quantity >= order.getQuantity()) {
                            if (users.get(i).getStatus().equals("Prime")) {
                                double price = p.calculate(books.get(j).getPrice(), order.getQuantity());
                                if (users.get(i).getCardBalance() >= price) {
                                    orders.add(order);
                                    users.get(i).setCardBalance(p.calculateB(price, users.get(i).getCardBalance()));
                                    users.get(i).addOrderToUser(order);
                                    decreaseQ(books.get(j), order.getQuantity());
                                    System.out.println("Thanks for buying");
                                } else {
                                    System.out.println("Sorry, but you need to increase your balance");
                                }
                            } else if (users.get(i).getStatus().equals("Loyal")) {
                                double price = books.get(j).getPrice() * order.getQuantity();
                                if (users.get(i).getCardBalance() >= price) {
                                    orders.add(order);
                                    users.get(i).setCardBalance(l.calculateB(price, users.get(i).getCardBalance()));
                                    users.get(i).addOrderToUser(order);
                                    decreaseQ(books.get(j), order.getQuantity());
                                    System.out.println("Thanks for buying");
                                } else {
                                    System.out.println("Sorry, but you need to increase your balance");
                                }
                            } else {
                                double price = books.get(j).getPrice() * order.getQuantity();
                                if (users.get(i).getCardBalance() >= books.get(j).getPrice() * order.getQuantity()) {
                                    orders.add(order);
                                    users.get(i).setCardBalance(o.calculateB(price, users.get(i).getCardBalance()));
                                    users.get(i).addOrderToUser(order);
                                    decreaseQ(books.get(j), order.getQuantity());
                                    System.out.println("Thanks for buying");
                                } else {
                                    System.out.println("Sorry, but you need to increase your balance");
                                }
                            }
                        }
                        else {
                            System.out.println("Sorry, but we don't have quantity that you want");
                        }
                    }
                }
            }
        }
        if (!a) {
            throw new notFoundE("Sorry, but there is no such user");
        }
        else if (!b) {
            throw new notFoundE("Sorry, but there is no such book");
        }
    }

    //quantity methods, decreases after buying
    public void decreaseQ(Books books, int quantity) {
        books.setQuantity(books.getQuantity() - quantity);
    }

    //printInfo methods
    public void printBookInfo() {//Inform about Products
        int cnt = 0;
        for (int i = 0; i < books.size(); i++) {
            cnt += books.get(i).getQuantity();
            System.out.println(books.get(i).toString());
        }
        System.out.println("Overall " + cnt + " books");
    }

    public void printUserInfo(){//Inform about Users
        int cnt = 0;
        for (int i = 0; i < users.size(); i++) {
            cnt += 1;
            System.out.println(users.get(i).toString());
        }
        System.out.println("Overall " + cnt + " users");
    }

    public void printUserHistory(int id){//History inform.
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                users.get(i).printHistory();
            }
        }
    }
}
