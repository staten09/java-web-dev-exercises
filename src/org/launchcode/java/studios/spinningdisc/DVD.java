package org.launchcode.java.studios.spinningdisc;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, Integer capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void storeData(){
        System.out.println("Data is now stored");
    }

    @Override
    public void  pause(){
        System.out.println("DVD is paused");
    }

    @Override
    public void play(){
        System.out.println("DVD is playing");
    }

    @Override
     public void skip(){
        System.out.println("Skipping to next chapter");
    }

    @Override
    public void stop(){
        System.out.println("DVD is stopped");
    }
}
