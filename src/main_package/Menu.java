package main_package;

import main_package.tools.Util;

import java.util.InputMismatchException;

public class Menu {

    public static void ui() {
        boolean menuRunner = true;
        while (menuRunner) {
            try {
                System.out.println("----------------------------------------");
                System.out.println("----------Travel Planner Menu-----------");
                System.out.println("----------------------------------------");
                System.out.println("Enter 1 to create a new travel plan");
                System.out.println("Enter 2 to view travel plans");
                System.out.println("Enter 3 to exit");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");

                int input = Util.scanInt();

                switch (input) {
                    case 1:
                        System.out.println("Inside case 1");
                        createTrip();
                        break;
                    case 2:
                        System.out.println("Inside case 2");
                        viewTrips();
                        break;
                    case 3:
                        System.out.println("Inside case 3");
                        System.out.println("Thank you for using the Travel Planner, see you next time");
                        menuRunner = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please enter a valid menu option");

                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an int!");
            }
        }

    }

    public static void createTrip() {
        boolean menuRunner = true;
        while (menuRunner)
            try {
                System.out.println("----------------------------------------");
                System.out.println("----------Travel Creator Menu-----------");
                System.out.println("----------------------------------------");
                System.out.println("Enter 1 to view destinations");
                System.out.println("Enter 2 plan a trip");
                System.out.println("Enter 3 to exit back to Travel Planner menu");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");

                int input = Util.scanInt();

                switch (input) {
                    case 1:
                        System.out.println("Inside case 2_1");
                        break;
                    case 2:
                        System.out.println("Inside case 2_2");
                        break;
                    case 3:
                        System.out.println("Inside case 2_3");
                        System.out.println("Going back to Travel Planner Menu");
                        menuRunner = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please enter a valid menu option");
                        }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an int!");

            }

    }
    public static void viewTrips() {
        boolean menuRunner = true;
        while (menuRunner)
            try {
                System.out.println("----------------------------------------");
                System.out.println("----------Travel Viewer Menu-----------");
                System.out.println("----------------------------------------");
                System.out.println("Enter 1 to view Trips");
                System.out.println("Enter 2 Edit a Trip");
                System.out.println("Enter 3 to exit back to Travel Planner menu");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");
                System.out.println("-----------------------------------------");

                int input = Util.scanInt();

                switch (input) {
                    case 1:
                        System.out.println("Inside case 3_1");
                        break;
                    case 2:
                        System.out.println("Inside case 3_2");
                        break;
                    case 3:
                        System.out.println("Inside case 3_3");
                        System.out.println("Going back to Travel Planner Menu");
                        menuRunner = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please enter a valid menu option");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter an int!");

            }

        }
}

