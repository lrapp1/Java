package edu.cscc;
import java.lang.Math;

public class HoldingTank {
    private int current, maxCapacity; // number of gallons in water tank, and maximum number of gallons of water the tank can hold

    public HoldingTank (int current, int maxCapacity) //Constructor
    {
        this.current = current; //this references the correct object if there are duplicate variables, i.e. here this.current is set equal to the int provided in main (350)
        this.maxCapacity = maxCapacity;

        if (this.current > maxCapacity) {  // if current is > maxCapacity, it will be set to maxCapacity
            this.current = maxCapacity;
        }
    }

    public int getCurrent() //Getters
    {
        return current;
    }

    public int getMaxCapacity()
    {
        return maxCapacity;
    }

    public void add (int volume)
    {
        this.current += volume; // current = current + volume
        if (this.current > this.maxCapacity) { // if the result of current is > maxCapacity, the result = maxCapacity
            this.current = maxCapacity;
        }
    }

    public void drain (int volume)
    {
        this.current -= volume; // current = current - volume
        if (this.current < 0) { // if the result of current is < 0, current = zero
            this.current = 0;
        }
    }

    public void print ()
    {
        System.out.println ("The tank volume is " + this.current + " gallons");
    }
}
