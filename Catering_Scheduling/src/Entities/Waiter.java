package Entities;

import java.util.ArrayList;
import java.util.List;

public class Waiter extends Thread {

    //Defining food objects
    private Borek borek;
    private Beverage beverage;
    private Cake cake;

    private static final int MAX_SIZE = 5;      // Defining trays' maximum size
    private final List<Borek> borek_tray = new ArrayList<>();       // Defining borek tray
    private final List<Beverage> beverage_tray = new ArrayList<>();     // Defining beverage tray
    private final List<Cake> cake_tray = new ArrayList<>();     // Defining cake tray

    // Critical Section
    @Override
    public void run() {     // Run method is for implementing runnable interface
        try {
            for (int i = 0; i < 30; i++) {
                fill();         // Fills the trays with food objects
            }
        } catch (Exception e) {

        }
    }

    private synchronized void fill() throws Exception {     // Defining fill method
        while (borek_tray.size() == MAX_SIZE) {     // If borek tray is full, wait beat method (Wait method is used to sleep the thread)
            wait();
        }
        Borek borek = new Borek(1);
        borek_tray.add(borek);                      // Borek is added to Borek Tray
        System.out.println("Borek Tray Filled...");     // Notification message
        notify();                                   // Notify method is used to awake the thread

        while (beverage_tray.size() == MAX_SIZE) {     // If beverage tray is full, wait drink method
            wait();
        }
        Beverage beverage= new Beverage(2);
        beverage_tray.add(beverage);              // Beverage is added to Beverage Tray
        System.out.println("Beverage Tray Filled...");   // Notification message
        notify();

        while (cake_tray.size() == MAX_SIZE) {     // If cake tray is full, wait eat method
            wait();
        }
        Cake cake = new Cake(3);
        cake_tray.add(cake);                    // Cake is added to Cake Tray
        System.out.println("Cake Tray Filled...");   // Notification message
        notify();
    }

    public synchronized Borek beat() throws Exception {         //Defining beat method
        notify();
        while (borek_tray.isEmpty()) {     // If borek tray is empty, wait fill method
            wait();
        }
        Borek borek = borek_tray.get(0);    // Gets borek tray's first element
        borek_tray.remove(borek);       // Borek is remove from Borek Tray
        return borek;           // Returns Borek object
    }

    public synchronized Beverage drink() throws Exception {     // Defining drink method
        notify();
        while (beverage_tray.isEmpty()) {     // If beverage tray is empty, wait fill method
            wait();
        }
        Beverage beverage = beverage_tray.get(0);   // Gets beverage tray's first element
        beverage_tray.remove(beverage);       // Beverage is remove from Beverage Tray
        return beverage;         // Returns Beverage object
    }

    public synchronized Cake eat() throws Exception {      // Defining eat method
        notify();
        while (cake_tray.isEmpty()) {     // If cake tray is empty, wait fill method
            wait();
        }
        Cake cake = cake_tray.get(0);    // Gets cake tray's first element
        cake_tray.remove(cake);          // Cake is remove from Cake Tray
        return cake;         // Returns Cake object
    }
}