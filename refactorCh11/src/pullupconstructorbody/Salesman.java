package pullupconstructorbody;


public class Salesman extends Employee {
	
	private int _grade;
	private double _pumpedInto;
	
	public Salesman(String name, String id, int grade, double pumpedInto){
		_name = name;
		_id = id;
		_grade = grade;
		_pumpedInto = pumpedInto;
		
		if(isPriviliged()){
			assignCar();
		}
	}
	@Override
	protected boolean isPriviliged(){
		return _grade > 10;
	}
}
