package org.launchcode.java.studios.spinningdisc;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, Integer capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void storeData(){
        System.out.println("Data is now stored");
    }

    @Override
    public void  pause(){
        System.out.println("CD is paused");
    }

    @Override
    public void play(){
        System.out.println("CD is playing");
    }

    @Override
    public void skip(){
        System.out.println("Skipping to next song");
    }

    @Override
    public void stop(){
        System.out.println("CD is stopped");
    }
}
