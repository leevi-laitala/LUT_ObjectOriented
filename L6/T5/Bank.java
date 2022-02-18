import java.util.HashMap;
import java.util.Map;

public class Bank
{
    public Bank() {}

    private HashMap<String, Account> m_mapAccounts = new HashMap<String, Account>();

    public boolean createAccount(String id, float funds)
    {
        if (m_mapAccounts.get(id) != null) return false;

        m_mapAccounts.put(id, new Account(id, funds));
        return true;
    }

    public boolean createCreditAccount(String id, float funds, float credit)
    {
        if (m_mapAccounts.get(id) != null) return false;

        m_mapAccounts.put(id, new CreditAccount(id, funds, credit));
        return true;
    }

    public boolean deleteAccount(String id)
    {
        if (m_mapAccounts.get(id) == null) return false;

        m_mapAccounts.remove(id);
        return true;
    }

    public Account getAccount(String id)
    {
        return m_mapAccounts.get(id);
    }

    public void print(String id)
    {
        System.out.println("Account number: " + id + " Amount of money: " + m_mapAccounts.get(id).getFunds() + ((m_mapAccounts.get(id).getCredit() != -1) ? (" Credit limit: " + m_mapAccounts.get(id).getCredit()) : ""));
    }

    public void printAll()
    {
        for (Map.Entry<String, Account> set : m_mapAccounts.entrySet())
            System.out.println("Account number: " + set.getKey() + " Amount of money: " + set.getValue().getFunds() + ((set.getValue().getCredit() != -1) ? (" Credit limit: " + set.getValue().getCredit()) : ""));
    }
}
