import java.util.Scanner;

class banking {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.println("Welcome to Online Banking System");
        System.out.println("--------------------------------------");
        System.out.println("Pess 1 to create new account:");
        String choise = Input.next();
        switch (choise) {
            case "1": {
                System.out.println("Enter Your name:");
                String name = Input.next();
                System.out.println("Enter Your Initial Amount:");
                String amount = Input.next();
                myAccount.createAccount(6762867, name, Float.valueOf(amount));
                break;
            }
            default: {
                System.out.println("Invalid Choise");
            }

        }
    }
}

class Account {
    double acc_nuber;
    String name;
    float amount;
    float savedAmount;

    void createAccount(double acc_nuber, String newName, float init_amount) {
        Scanner Input = new Scanner(System.in);
        acc_nuber = acc_nuber;
        name = newName;
        amount = init_amount;

        System.out.println("Welcome to Online Banking System");
        System.out.println("..........................");
        System.out.println("Account Number:" + acc_nuber);
        System.out.println("Name:" + name);
        System.out.println("Amount:" + amount);
        while (true) {
            System.out.println("\n\n" + this.name + " welcome to Online Banking System");
            System.out.println("..................................");
            System.out.println("Press 1 to check balance");
            System.out.println("Press 2 to deposit");
            System.out.println("Press 3 to withdraw");
            System.out.println("Press 4 to display");
            System.out.println("Press 5 to exit");
            String choise = Input.next();
            switch (choise) {
                case "1": {
                    checkBalance();
                    break;
                }
                case "2": {
                    System.out.println("Enter the amount you want to deposit:");
                    float newAmount = Input.nextFloat();
                    deposit(newAmount);
                    break;
                }
                case "3": {
                    System.out.println("Enter the amount you want to withdraw:");
                    float outAmount = Input.nextFloat();
                    withdraw(outAmount);
                    break;
                }
                case "4": {
                    display();
                    break;
                }
                case "5": {
                    System.out.println("Thank you for using our service");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid Choise");
                }
            }
        }

    }

    void checkBalance() {
        System.out.println("Balance:" + amount);
    }

    void deposit(float newAmount) {
        if (newAmount > 0) {
            amount = amount + newAmount;
            System.out.println(
                    "You deposit " + newAmount + " to your Account successfuly and your new balance is " + amount);
        } else {
            System.out.println("Invalid balance");
        }
    }

    void withdraw(float outAmount) {
        if (outAmount <= amount) {
            amount = amount - outAmount;
            System.out.println(
                    "You withdraw " + outAmount + " from your account successfuly and your new balance is " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Your Account Details");
        System.out.println("Account Number: " + acc_nuber);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + amount);
    }
}