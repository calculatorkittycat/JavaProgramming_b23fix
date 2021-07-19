package day_13_Scanner;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {
        int speedlimit = 60;

        System.out.println("Please enter your speed");
        int yourSpeed = new Scanner(System.in).nextInt();

        if (yourSpeed > 65)
            System.out.println(yourSpeed + "mph is too fast! your going to jail.");
        if (yourSpeed < 60 ) System.out.println("Aight den");


    }
}

/*
3. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!

            Enter current speed:
            45

            output:
 */
