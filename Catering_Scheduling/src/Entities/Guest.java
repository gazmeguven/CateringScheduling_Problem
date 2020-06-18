package Entities;

public class Guest extends Thread {

    private Waiter waiter;      // Calling waiter object

    public Guest(Waiter waiter) {      // Constructor method
        this.waiter = waiter;

    }

    @Override
    public void run() {     // Run method is for implementing runnable interface
        try {
            for (int i = 0; i < 90; i++) {      // Defining the mechanism between waiter and guests
                Borek borek = waiter.beat();
                System.out.println("Eating Borek By ..." + Thread.currentThread().getName() + " Food" + borek);   // Notification message with current thread's name and object
                Thread.sleep(500);      // Waits for 500ms
                Beverage beverage = waiter.drink();
                System.out.println("Drinking Beverage By ..." + Thread.currentThread().getName() + " Food" + beverage);    // Notification message with current thread's name and object
                Thread.sleep(500);     // Waits for 500ms
                Cake cake = waiter.eat();
                System.out.println("Eating Cake By ..." + Thread.currentThread().getName() + " Food" + cake);      // Notification message with current thread's name and object
                Thread.sleep(500);     // Waits for 500ms
            }
        }
        catch(Exception e) {
        }
    }
}