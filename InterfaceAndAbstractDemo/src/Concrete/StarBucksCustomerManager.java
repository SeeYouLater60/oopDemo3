package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager  {
	
	 private ICustomerCheckService iCustomerCheckService;
	 
	public StarBucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		
		this.iCustomerCheckService = iCustomerCheckService;

		
		
		
		
	}
	@Override
	public void save(Customer customer) {
		if(iCustomerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db :"+customer.getFirsName());
		}else {
			System.out.println("Not a valid person");
		}
	
		
	}
	
}
