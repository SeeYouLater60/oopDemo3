package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
		
		if (customer.getNationalityId() == "123456789") {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
