package simplepro;

public class Car2 extends Car1 {
	public void vechicleType() {
		System.out.println(" vehicle type:car" );
		}		
	public void execute() {
		super.vechicleType();		
	}
public static void main(String[] args) {
	Car2 name = new Car2();
	name.execute();
	
	}
}