public class Account
{
    protected String m_id;
    protected float m_funds;

    public Account(String id, float funds)
    {
        m_id = id;
        m_funds = funds;
    }

    public boolean withdraw(float amount)
    {
        if (m_funds >= amount)
        {
            m_funds -= amount;
            return true;
        }
        else return false;
    }

    public void deposit(float amount)
    {
        m_funds += amount;
    }

    public int getFunds()
    {
        return (int)m_funds;
    }
}

class CreditAccount extends Account
{
    private float m_credit;

    public CreditAccount(String id, float funds, float credit)
    {
        super(id, funds);
        m_id = id;
        m_funds = funds;
        m_credit = credit;
    }

    public boolean withdraw(float amount)
    {
        if (m_funds + m_credit >= amount)
        {
            m_funds -= amount;
            return true;
        } else return false;
    }

    public int getCredit()
    {
        return (int)m_credit;
    }
}
