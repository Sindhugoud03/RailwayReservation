import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String username = "Sindhu goud";
        String password = "sindhu";
        String email = "sindhu@gmail.com";

        
        int train1Seats = 100,
         train2Seats = 100,
          train3Seats = 100, 
          train4Seats = 100, 
          train5Seats = 100;
        int bookedTrain = 0;

        while (true) {
            System.out.println("\n** Railway Reservation System **");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) { 
                System.out.print("Enter a new Username: ");
                username = sc.nextLine();
                System.out.print("Enter a new Password: ");
                password = sc.nextLine();
                System.out.print("Enter your Email: ");
                email = sc.nextLine();
                System.out.println("Registration successful!");

            } else if (choice == 2) { 
                System.out.print("Enter Username: ");
                String loginUsername = sc.nextLine();
                System.out.print("Enter Password: ");
                String loginPassword = sc.nextLine();

                if (loginUsername.equals(username) && loginPassword.equals(password)) {
                    System.out.println("Login successful!");

                    while (true) { 
                        System.out.println("\n** User Menu **");
                        System.out.println("1. Book a Train");
                        System.out.println("2. Cancel Booking");
                        System.out.println("3. Logout");
                        System.out.print("Choose an option: ");
                        int userChoice = sc.nextInt();
                        sc.nextLine(); 

                        if (userChoice == 1) { 
                            if (bookedTrain != 0) {
                                System.out.println("You have already booked Train " + bookedTrain + ". Cancel it first to book another.");
                                continue;
                            }

                            System.out.println("\nAvailable Trains:");
                            if (train1Seats > 0)
                             System.out.println("Train 1: " + train1Seats + " seats available");
                            if (train2Seats > 0)
                             System.out.println("Train 2: " + train2Seats + " seats available");
                            if (train3Seats > 0)
                             System.out.println("Train 3: " + train3Seats + " seats available");
                            if (train4Seats > 0)
                             System.out.println("Train 4: " + train4Seats + " seats available");
                            if (train5Seats > 0) 
                            System.out.println("Train 5: " + train5Seats + " seats available");

                            System.out.print("Enter Train number to book (1-5): ");
                            int trainChoice = sc.nextInt();

                            if (trainChoice == 1 && train1Seats > 0) {
                                train1Seats--;
                                bookedTrain = 1;
                                System.out.println("Train 1 booked successfully!");
                            } else if (trainChoice == 2 && train2Seats > 0) {
                                train2Seats--;
                                bookedTrain = 2;
                                System.out.println("Train 2 booked successfully!");
                            } else if (trainChoice == 3 && train3Seats > 0) {
                                train3Seats--;
                                bookedTrain = 3;
                                System.out.println("Train 3 booked successfully!");
                            } else if (trainChoice == 4 && train4Seats > 0) {
                                train4Seats--;
                                bookedTrain = 4;
                                System.out.println("Train 4 booked successfully!");
                            } else if (trainChoice == 5 && train5Seats > 0) {
                                train5Seats--;
                                bookedTrain = 5;
                                System.out.println("Train 5 booked successfully!");
                            } else {
                                System.out.println("No seats available in the selected train.");
                            }

                        } else if (userChoice == 2) {
                            if (bookedTrain == 0) {
                                System.out.println("You have no booking to cancel.");
                            } else {
                                if (bookedTrain == 1) train1Seats++;
                                if (bookedTrain == 2) train2Seats++;
                                if (bookedTrain == 3) train3Seats++;
                                if (bookedTrain == 4) train4Seats++;
                                if (bookedTrain == 5) train5Seats++;
                                System.out.println("Booking for Train " + bookedTrain + " cancelled successfully.");
                                bookedTrain = 0;
                            }

                        } else if (userChoice == 3) { 
                            System.out.println("Logged out successfully.");
                            break;
                        } else {
                            System.out.println("Invalid option. Try again.");
                        }
                    }
                } else {
                    System.out.println("Invalid username or password. Try again.");
                }

            } else if (choice == 3) { 
                System.out.print("Enter your registered email: ");
                String enteredEmail = sc.nextLine();
                if (enteredEmail.equals(email)) {
                    System.out.println("Your password is: " + password);
                } else {
                    System.out.println("Email not found.");
                }

            } else if (choice == 4) { 
                System.out.println("Thank you! Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}