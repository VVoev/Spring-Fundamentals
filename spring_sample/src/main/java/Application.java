import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		
		Customer cust = customerService.findAll().get(0);
		System.out.println(customerService.findAll().get(0).getFirstname());
	}

}
