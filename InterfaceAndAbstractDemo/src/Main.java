import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setId(123);
		customer1.setFirsName("Tolga");
		customer1.setLastName("Yaradanakul");
		customer1.setNationalityId("123456789");
		customer1.setDateOfBirth(LocalDate.of(1997, 02, 21));
		
		BaseCustomerManager baseCustomerManager = new StarBucksCustomerManager (new CustomerCheckManager ());
		baseCustomerManager.save(customer1);
		
		
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager ();
		baseCustomerManager2.save(customer1);
	}
	
	

}
