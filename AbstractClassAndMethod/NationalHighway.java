package AbstractClassAndMethod;

public class NationalHighway extends Highway {
	@Override
	public void code() {
		System.out.println("over riding code in NationalHighway");
	}

	@Override
	public void system() {
		System.out.println("over riding system in NationalHighway");

	}

	@Override
	public void petrol() {
		System.out.println("over riding petrol in NationalHighway");

	}

	@Override
	public boolean highwayMan() {
		System.out.println("over riding highwayMan in NationalHighway");
		return false;

	}

	@Override
	public void tollCollection() {
		System.out.println("over riding tollCollection  in NationalHighway");

	}

	@Override
	public void running() {
		System.out.println("over riding running  in NationalHighway");
	}

	@Override
	public void travel() {
		System.out.println("over riding travel  in NationalHighway");
	}

	@Override
	public void walking() {
		System.out.println("over riding walking  in NationalHighway");
	}

}
