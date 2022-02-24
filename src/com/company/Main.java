package com.company;

import java.util.Scanner;
import exceptions.*;
import userList.*;

public class Main {
    public static void main(String[] args) throws existE, notFoundE {
        Scanner input = new Scanner(System.in);
        SalesManagement system = new SalesManagement();

        //user fields:
        int userId;
        double userCardBalance, userCashback;
        String userName, userSurname, userStatus;

        //product fields:
        int bookId, bookQuantity;
        double bookPrice;
        String bookName;

        //order fields:
        int id, quantity;
        String name;

        int choice = -1;

        while (choice != 0) {
            System.out.println("You are WELCOME!!!");
            System.out.println("Type 1: If you want add user");
            System.out.println("Type 2: If you want add book");
            System.out.println("Type 3: If you want add order");
            System.out.println("Type 4: If you want to see all book information");
            System.out.println("Type 5: If you want to see all user information");
            System.out.println("Type 6: If you want to see user's history of order");
            System.out.println("Type 0: to exit");


            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int choice2 = -1;

                    while (choice2 != 0) {
                        System.out.println("Type 1: If you want to add Tutynushy:");
                        System.out.println("Type 2: If you want to add Tanys:");
                        System.out.println("Type 3: If you want to add Tuys:");
                        System.out.println("Type 0: to exit");

                        choice2 = input.nextInt();

                        switch (choice2) {
                            case 1:
                                System.out.println("Please, write id of the user:");
                                input.nextLine();
                                userId = input.nextInt();
                                System.out.println("And name:");
                                userName = input.next();
                                System.out.println("Surname:");
                                userSurname = input.next();
                                System.out.println("Also, card balance:");
                                userCardBalance = input.nextDouble();
                                userStatus = "Tutynushy";

                                Tutynushy newUser = new Tutynushy(userId, userName, userSurname, userCardBalance, userStatus);
                                system.addUser(newUser);
                                break;
                            case 2:
                                System.out.println("Please, write id of the user:");
                                input.nextLine();
                                userId = input.nextInt();
                                System.out.println("And name:");
                                userName = input.next();
                                System.out.println("Surname:");
                                userSurname = input.next();
                                System.out.println("Also, card balance:");
                                userCardBalance = input.nextDouble();
                                userStatus = "Tanys";

                                Tanystar newUserP = new Tanystar(userId, userName, userSurname, userCardBalance, userStatus);
                                system.addUser(newUserP);
                                break;
                            case 3:
                                System.out.println("Please, write id of the user:");
                                input.nextLine();
                                userId = input.nextInt();
                                System.out.println("And name:");
                                userName = input.next();
                                System.out.println("Surname:");
                                userSurname = input.next();
                                System.out.println("Also, card balance:");
                                userCardBalance = input.nextDouble();
                                userStatus = "Tyus";

                                Tuystar newUserL = new Tuystar(userId, userName, userSurname, userCardBalance, userStatus, 6);
                                system.addUser(newUserL);
                                break;
                            case 0:
                                System.out.println("Type 1: If you want add user");
                                System.out.println("Type 2: If you want add book");
                                System.out.println("Type 3: If you want add order");
                                System.out.println("Type 4: If you want to see all product information");
                                System.out.println("Type 5: If you want to see all user information");
                                System.out.println("Type 6: If you want to see user's history of order");
                                System.out.println("Type 0: to exit");

                                choice = input.nextInt();
                        }
                    }
                case 2:
                    System.out.println("Please, write id of the book:");
                    input.nextLine();
                    bookId = input.nextInt();
                    System.out.println("And name:");
                    bookName = input.next();
                    System.out.println("Quantity:");
                    bookQuantity = input.nextInt();
                    System.out.println("Also, price:");
                    bookPrice = input.nextDouble();

                    Books newBooks = new Books(bookId, bookName, bookQuantity, bookPrice);
                    system.addBook(newBooks);
                    break;
                case 3:
                    System.out.println("Please, write id of the user:");
                    input.nextLine();
                    id = input.nextInt();
                    System.out.println("And name of the book:");
                    name = input.next();
                    System.out.println("Also, quantity:");
                    quantity = input.nextInt();

                    Order newOrder = new Order(id, name, quantity);
                    system.addOrder(newOrder);
                    break;
                case 4:
                    system.printBookInfo();
                    break;
                case 5:
                    system.printUserInfo();
                    break;
                case 6:
                    System.out.println("Write id of the user, please:");
                    input.nextLine();
                    userId = input.nextInt();
                    system.printUserHistory(userId);
                    break;
            }
            /*
            //Jframe - using it for GUI window, adding components
            ImageIcon image = new ImageIcon("images.png");
            Border boder = BorderFactory.createLineBorder(Color.gray, 1);

            JLabel label = new JLabel();
            label.setText("WTW.Brighten your evening with wonderful movie");
            label.setIcon(image);
            label.setHorizontalTextPosition(JLabel.RIGHT);//set position of text
            label.setVerticalTextPosition(JLabel.CENTER);
            label.setForeground(Color.black);//color of text
            label.setFont(new Font("Boli", Font.BOLD, 10));// font
            label.setIconTextGap(5);//set the distance between text and image


            label.setOpaque(true);//vision
            label.setBorder(boder);
            label.setVerticalAlignment(JLabel.TOP);//set vert position of items
            label.setHorizontalAlignment(JLabel.CENTER);//same but hor.
            label.setBounds(0, 0, 700, 100);//set x y position on frame


            JFrame frame = new JFrame();
            frame.setTitle("Movie");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes app
            frame.setResizable(false);//stable shape
            frame.setSize(700, 700);//for shape
            frame.setVisible(true);
            frame.add(label);
            frame.setLayout(null);


            frame.getContentPane().setBackground(new Color(176, 91, 59));
            I wanted to make GUI but it's took too much time
            */
        }
    }
}