import java.util.Scanner;

class Mainclass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("\n*** BANK SYSTEM ***\n1) Add a regular account\n2) Add a credit account\n3) Deposit money\n4) Withdraw money\n5) Remove an account\n6) Print account information\n7) Print all accounts\n0) Quit\nYour choice: ");
            int opt = Integer.parseInt(sc.nextLine());

            switch (opt)
            {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    deposit();
                    break;
                case 2:
                    credit();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    info();
                    break;
                case 7:
                    System.out.println("Prints every account");
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        }
    }

    private static String getID(String msg)
    {
        System.out.print(msg + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int getAmount(String msg)
    {
        System.out.print(msg + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    private static void deposit()
    {
        String id = getID("Give an account number");
        int amount = getAmount("Amount of money to deposit");
        System.out.println(String.format("Account number: %s\nAmount of money: %d", id, amount));
    }

    private static void withdraw()
    {
        String id = getID("Give an account number");
        int amount = getAmount("Amount of money to withdraw");
        System.out.println(String.format("Account number: %s\nAmount of money: %d", id, amount));
    }

    private static void delete()
    {
        String id = getID("Give the account number of the account to delete");
        System.out.println(String.format("Account number: %s", id));
    }

    private static void credit()
    {
        String id = getID("Give an account number");
        int amount = getAmount("Amount of money to deposit");
        int creditCap = getAmount("Give a credit limit");
        System.out.println(String.format("Account number: %s\nAmount of money: %d\nCredit: %d", id, amount, creditCap));
    }

    private static void info()
    {
        String id = getID("Give the account number of the account to print information from");
        System.out.println(String.format("Account number: %s", id));
    }
}
