import java.util.ArrayList;

public class BottleDispenser {
    private int m_bottles;
    private int m_money;

    private ArrayList<Bottle> m_arrBottles;
    
    public BottleDispenser() {
        m_bottles = 5;
        m_money = 0;

        //m_arrBottles = new Bottle[m_bottles];
        m_arrBottles = new ArrayList<Bottle>();

        for (int i = 0; i < m_bottles; i++)
            m_arrBottles.add(new Bottle());
    }
    
    public void addMoney() {
        m_money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        int bnum = m_arrBottles.size();

        if (bnum > 1) {
            if (m_money >= m_arrBottles.get(bnum - 1).getPrice()) {
                bnum--;

                m_money -= m_arrBottles.get(bnum).getPrice();
                System.out.println("KACHUNK! " + m_arrBottles.get(bnum).getName() + " came out of the dispenser!");
                m_arrBottles.remove(bnum);
            } else {
                System.out.println("Add money first!");
            }
        }
    }
    
    public void returnMoney() {
        if (m_money > 0) {
            m_money = 0;
            System.out.println("Klink klink. Money came out!");
        }
    }

    public void listContents() {
        for (int i = 0; i < m_arrBottles.size(); i++) {
            Bottle cur = m_arrBottles.get(i);
          //System.out.println(String.format("%d. Name: %s\n        Size: %.1f      Price: %.1f", i + 1, cur.getName(), cur.getSize(), cur.getPrice()).replace(",", "."));
            System.out.println(String.format("%d. Name: %s\n        Size: %.1f      Price: %.1f", i + 1, cur.getName(), cur.getSize(), cur.getPrice()).replace(",", "."));
        }
    }
}
