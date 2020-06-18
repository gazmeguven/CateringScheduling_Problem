package Entities;

public class Main {
    public static void main(String[] args) {


        Waiter waiter = new Waiter();       // Creates waiter thread object
        waiter.setName("Waiter");
        waiter.start();                     // Starts waiter threads


        Guest guest1 = new Guest(waiter);       // Creates guest thread objects
        guest1.setName("Guest-1");
        guest1.start();                         // Starts guest threads
        Guest guest2 = new Guest(waiter);
        guest2.setName("Guest-2");
        guest2.start();
        Guest guest3 = new Guest(waiter);
        guest3.setName("Guest-3");
        guest3.start();
        Guest guest4 = new Guest(waiter);
        guest4.setName("Guest-4");
        guest4.start();
        Guest guest5 = new Guest(waiter);
        guest5.setName("Guest-5");
        guest5.start();
        Guest guest6 = new Guest(waiter);
        guest6.setName("Guest-6");
        guest6.start();
        Guest guest7 = new Guest(waiter);
        guest7.setName("Guest-7");
        guest7.start();
        Guest guest8 = new Guest(waiter);
        guest8.setName("Guest-8");
        guest8.start();
        Guest guest9 = new Guest(waiter);
        guest9.setName("Guest-9");
        guest9.start();
        Guest guest10 = new Guest(waiter);
        guest10.setName("Guest-10");
        guest10.start();

    }

}