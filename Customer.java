import java.util.Date;

public class Customer {
	public String name;
	public String address;
	public Date dob; 
	public int cardNumber;
	public int pin;
	
	public boolean veryifyPassword(String password) {
		return false;
	}
}
