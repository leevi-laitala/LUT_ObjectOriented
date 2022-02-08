import java.util.Scanner;

class Mainclass {
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n*** BOTTLE DISPENSER ***\n1) Add money to the machine\n2) Buy a bottle\n3) Take money out\n4) List bottles in the dispenser\n0) End\nYour choice: ");
        
        String str = sc.nextLine();
        int opt = Integer.parseInt(str);
        
        return (opt < 0 || opt > 4) ? -1 : opt;
    }

    public static void main(String[] args) {
        BottleDispenser dispenser = new BottleDispenser();

        while (true) {
            int opt = menu();

            switch (opt) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    dispenser.addMoney();
                    break;
                case 2:
                    dispenser.buyBottle();
                    break;
                case 3:
                    dispenser.returnMoney();
                    break;
                case 4:
                    dispenser.listContents();
            }
        }
    }
}
