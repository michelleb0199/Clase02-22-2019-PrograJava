
package mi.storewebapp.objects;


public class StoreUnit {
    private String m_strName;
    private int m_iPrice;
    private int m_iQuantity;

    public StoreUnit(String m_strName, int m_iPrice, int m_iQuantity) {
        setQuantity(m_iQuantity);
        setName(m_strName);
        setPrice(m_iPrice);
    }

    
    
    public String getName() {
        return m_strName;
    }

    private void setName(String p_strName) {
        m_strName = p_strName;
    }

    public int getPrice() {
        return m_iPrice;
    }

    private void setPrice(int p_iPrice) {
        m_iPrice = p_iPrice;
    }

    public int getQuantity() {
        return m_iQuantity;
    }

    private void setQuantity(int p_iQuantity) {
        m_iQuantity = p_iQuantity;
    }
    
    public int getCost()
    {
         int iPrice = getPrice();
         int iQuantity = getQuantity();
         int iCost = iPrice * iQuantity;
         
         return iCost;
    }
    
    
          
}
