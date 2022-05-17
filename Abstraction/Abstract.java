package Abstraction;

public abstract class Abstract {
	// Method created without method body- 100% abstraction
	
	abstract void AccountDetails();
	
	//Method with body-Concreate method-0% abstraction
	
	public void AccountDetails(int accountNumber,double balance) {
		System.out.println("Account Details");
		
	}
	

	

}
