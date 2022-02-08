public class Bottle {
    private String m_name;
    private String m_manufacturer;
    private double m_totalEnergy;

    public Bottle() {
        m_name = "Pepsi Max";
        m_manufacturer = "Pepsi";
        m_totalEnergy = 0.3d;
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
}
