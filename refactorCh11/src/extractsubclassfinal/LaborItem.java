package extractsubclassfinal;

public class LaborItem extends JobItem {

	protected Employee _employee;

	protected LaborItem(int unitPrice, int quantity, boolean isLabor,
			Employee employee) {
		super(unitPrice, quantity, isLabor, employee);
	}
	
	LaborItem(int quantity, Employee employee){
		super(0, quantity, true, employee);
		_employee = employee;
	}

	public Employee getEmployee() {
		return _employee;
	}

	protected boolean isLabor() {
		return true;
	}
	
	public int getUnitPrice(){
		return _employee.getRate();
	}
}
