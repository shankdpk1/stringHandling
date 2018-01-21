package abstractPackage;

public class Manager extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e= new Manager();
       e.name();
	}

	@Override
	void name() {
		System.out.println("value");
		
	}

	@Override
	void id() {
		// TODO Auto-generated method stub
		
	}



}
