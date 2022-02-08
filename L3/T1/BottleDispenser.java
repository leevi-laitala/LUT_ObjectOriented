public class BottleDispenser {
    private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 5;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if (bottles > 1) {
            if (money > 0) {
                bottles -= 1;
                money -= 1;
                System.out.println("KACHUNK! A bottle came out of the dispenser!");
            } else {
                System.out.println("Add money first!");
            }
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
