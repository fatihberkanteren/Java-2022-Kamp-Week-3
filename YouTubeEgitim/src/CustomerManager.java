
public class CustomerManager {

    private ICreditManager creditManager;
    
    private Customer customer;
    public CustomerManager(Customer customer,ICreditManager creditManager){ //Cunstractor
        this.creditManager = creditManager;
        this.customer = customer;
    }
    public void Save() {
        System.out.println("Kaydedildi.");
    }
    public void Delete() {
        System.out.println("Silindi.");
    }
    
    public void GiveCredit(){
        creditManager.Calculate();
    }

    
}
 