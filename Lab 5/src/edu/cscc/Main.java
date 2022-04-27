package edu.cscc;

//Laura Rapp, 10/05/21
// Water holding tank simulation utilizing a Constructor, Getters, and .this references (current and maxCapacity).
// The holding tank can hold volumes of water that range from 0 (empty) up to a maximum.
// If more than the max capacity is added to the holding tank, an overflow valve causes the excess to be dumped into the sewer system.

public class Main {

    public static void main(String[] args)
    {
        HoldingTank tank = new HoldingTank (350, 1000);
        tank.print();
        tank.add (350);
        tank.drain(100);
        tank.print();
        tank.add (800);
        tank.drain (175);
        tank.print();
        tank.drain (1200);
        tank.add (900);
        tank.drain(25);
        tank.print();
    }
}





