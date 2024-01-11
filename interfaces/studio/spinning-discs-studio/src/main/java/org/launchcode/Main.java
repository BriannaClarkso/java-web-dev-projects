package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
            CD myCD = new CD();
            DVD myDvd = new DVD("DVD Title");

            myCD.spinDisc();
            myDvd.spinDisc();
        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}