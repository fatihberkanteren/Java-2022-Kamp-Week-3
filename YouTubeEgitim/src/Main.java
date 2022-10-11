
public class Main {

    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();
        
        Customer customer = new Customer();
        customer.setId(1);
        
        Person person = new Person();
        person.setNationalIdentity("123456897");
       
        CustomerManager customerManager = new CustomerManager(customer,new MilitaryCreditManager());
        customerManager.Save();
        customerManager.Delete();
        customerManager.GiveCredit();

        Company company = new Company();
        company.setTaxNumber("123465");
        company.setCompanyName("Arçelik");
        company.setId(1000);
        
        CustomerManager customerManager2 = new CustomerManager(new Person(),new TeacherCreditManager());
        customerManager2.GiveCredit();

    }

}
