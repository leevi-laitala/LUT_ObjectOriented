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
                    create();
                    break;
                case 2:
                    createCredit();
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
                    print();
                    break;
                default:
                    System.out.println("Invalid choice.");

            }
        }
    }

    private static Bank bank = new Bank();

    private static String getID(String msg)
    {
        System.out.print(msg + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine(); // Strip non-cumeric characters
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
        
        Account acc;
        if ((acc = bank.getAccount(id)) == null)
        {
            System.out.println("That account does not exist.");
            return;
        }

        acc.deposit(amount);
    }

    private static void withdraw()
    {
        String id = getID("Give an account number");
        int amount = getAmount("Amount of money to withdraw");
        
        Account acc;
        if ((acc = bank.getAccount(id)) == null)
        {
            System.out.println("That account does not exist.");
            return;
        }

        if (!acc.withdraw(amount))
        {
            System.out.println("Not enough funds.");
            return;
        }
    }

    private static void delete()
    {
        String id = getID("Give the account number of the account to delete");

        if (!bank.deleteAccount(id))
            System.out.println("That account does not exist.");
        else
            System.out.println("Account removed.");
    }

    private static void create()
    {
        String id = getID("Give an account number");
        int funds = getAmount("Amount of money to deposit");

        if (!bank.createAccount(id, funds))
            System.out.println("That account already exists.");
        else
            System.out.println("Account created.");
    }

    private static void createCredit()
    {
        String id = getID("Give an account number");
        int funds = getAmount("Amount of money to deposit");
        int credit = getAmount("Give a credit limit");

        if (!bank.createCreditAccount(id, funds, credit))
            System.out.println("That account already exists.");
        else
            System.out.println("Account created.");
    }

    private static void info()
    {
        String id = getID("Give the account number of the account to print information from");
        if (bank.getAccount(id) == null)
        {
            System.out.println("That account does not exist.");
            return;
        }

        bank.print(id);
    }

    private static void print()
    {
        System.out.println("All accounts:");
        bank.printAll();
    }
}
