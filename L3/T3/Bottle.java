public class Bottle {
    private String m_name;
    private String m_manufacturer;
    private double m_totalEnergy;
    private float m_price;
    private float m_volume;

    public Bottle() {
        m_name = "Pepsi Max";
        m_manufacturer = "Pepsi";
        m_totalEnergy = 0.3d;
        m_price = 1.8f;
        m_volume = 0.5f;
    }

    //public Bottle(String name, String manuf, float totE) {
    //    m_name = name;
    //    m_manufacturer = manuf;
    //    m_totalEnergy = totE;
    //}

    public String getName() {
        return m_name;
    }

    public String getManufacturer() {
        return m_manufacturer;
    }

    public double getEnergy() {
        return m_totalEnergy;
    }

    public float getPrice() {
        return m_price;
    }
}
