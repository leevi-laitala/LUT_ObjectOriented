public class BottleDispenser {
    private int m_bottles;
    private int m_money;

    private Bottle[] m_arrBottles;
    
    public BottleDispenser() {
        m_bottles = 50;
        m_money = 0;

        m_arrBottles = new Bottle[m_bottles];

        for (int i = 0; i < m_bottles; i++)
            m_arrBottles[i] = new Bottle();
    }
    
    public void addMoney() {
        m_money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if (m_bottles > 1) {
            if (m_money >= m_arrBottles[m_bottles - 1].getPrice()) {
                m_bottles -= 1;
                m_money -= m_arrBottles[m_bottles - 1].getPrice();
                System.out.println("KACHUNK! " + m_arrBottles[m_bottles - 1].getName() + " came out of the dispenser!");
            } else {
                System.out.println("Add money first!");
            }
        }
    }
    
    public void returnMoney() {
        m_money = 0;
        System.out.println("Klink klink. Money came out!");
    }
}
