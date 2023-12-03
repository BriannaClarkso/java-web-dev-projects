package org.launchcode;

import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        area.calculateArea();
    }

    public Area(){

    }
    public void calculateArea() {

        Scanner input = new Scanner(System.in);
        try {
            boolean keepOnLooping = true;
            while (keepOnLooping) {
                Double myUSerRadius = input.nextDouble();
                if (myUSerRadius < 0) {
                    System.out.println("No negatives!");
                } else {
                    Double area = Circle.getArea(myUSerRadius);
                    System.out.println(area);
                    keepOnLooping = false;
                }
//                input.close();

            }
        } catch(Exception error) {
            System.out.println("It needs to be a number!");
        }
        input.close();
    }

}
