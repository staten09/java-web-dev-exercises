package org.launchcode.studio7;

import org.launchcode.java.studios.spinningdisc.CD;
import org.launchcode.java.studios.spinningdisc.DVD;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        CD myCD = new CD("Evermore",25, "Songs by Taylor Swift", "Compact Disc");
        DVD myDVD =  new DVD("Talladega Nights",258,"Will Farrell Movie", "Digital Video Disc");

        myCD.spinDisc();
        myDVD.spinDisc();

    }
}
