package practiceChatgpt.Inheritance;

public class CreditCard implements PaymentGateway{

	@Override
	public void processPayment(double amount) {
		System.out.println("Credit Card Payment of: " +amount  );
		
	}

}
