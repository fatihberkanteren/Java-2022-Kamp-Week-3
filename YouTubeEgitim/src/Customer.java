
public class Customer {

    private int id;

    

    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    

}
