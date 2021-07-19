package OfficeHours03_06_2021;

import java.util.Scanner;

public class Unit1Task {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Do you want to start the car");
        boolean isStart=input.nextBoolean(); //true -- false
        int distance = 0;
        int speed = 60;
        int maxSpeed = 80;
        int minSpeed = 40;
        double unitPriceForFuel= 3.0;
        double averageFuelConsumption = 3.2;

        if (isStart) {
            input.nextLine();
            System.out.println("Which city do you want to go to?\n\tList of Cities\n\t\tAustin\n\t\tDallas\n\t\tSan Antonio");
            String destination = input.nextLine();

            switch (destination) {
                case "San Antonio":
                    distance = 250;
                    break;
                case "Dallas":
                    distance = 300;
                    break;
                case "Austin":
                    distance = 200;
                    break;
                default:
                    distance = 0;
                    break;

            }

            if (distance > 0) {
                speed = 60;
                System.out.println(destination);
                System.out.println("To increase speed press 0\nTo decrease press 1");
                int speedRegulator = input.nextInt();

                switch (speedRegulator) {
                    case 0:
                        System.out.println("How much would you like to increase the speed?");
                        int speedInc = input.nextInt();

                        if (speed + speedInc > maxSpeed) {
                            System.out.println("Not allowed. Your speed is " + speed);
                        } else {
                            //speed=speed+speedInc;
                            speed += speedInc;
                            System.out.println("Your speed is increased to " + speed);
                        }


                        break;
                    case 1:

                        System.out.println("How much would you like to decrease the speed?");
                        int speedDec = input.nextInt();

                        if (speed - speedDec < minSpeed) {
                            System.out.println("Not allowed. Your speed is " + speed);
                        } else {

                            speed -= speedDec;
                            System.out.println("Your speed is decreased" + speed);
                        }

                        break;
                    default:

                        System.out.println("Your Speed has not been changed!" + speed);

                        break;

                }

                System.out.println("=========Result=========");

                double estimatedTime = (double)distance / speed;
                System.out.println("estimatedTime = " + estimatedTime);

                double totalFuelConsumption = averageFuelConsumption * estimatedTime;
                System.out.println("totalFuelConsumption = " + totalFuelConsumption);

                double totalPrice = totalFuelConsumption * unitPriceForFuel;
                System.out.println("totalPrice = " + totalPrice);


            } else
            {
                System.out.println("This location is not defined");
            }
        }else
        {
            System.out.println("See you later");
        }


    }
}
