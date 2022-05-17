package OverridingPractice;

public class FitnessClub extends FitnessOrganisation{
	//We are overiding methods of parentClass using concept of Overiding.
	
	@Override
	public void yogaStudio() {
		System.out.println("Breathing classes are available too");
	}
	@Override
 public void weightLifting() {
		System.out.println("Trainers are available for weightLifting");
	}
}
