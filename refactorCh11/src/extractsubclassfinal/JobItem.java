package extractsubclassfinal;

public class JobItem {
	
	/*
	 * 1. 建立LaborItem類別,繼承JobItem
	 * 2. 修改對JobItem建構子呼叫(new LaborItem)
	 * 3. 新增建構式,將舊的建構式改為protected
	 * 4. 將外部呼叫改為呼叫新的建構式
	 * 5. 修改subclass建構式
	 * 6. 將JobItem的getEmployee()移至子類別,_employee需改為protected
	 * 7. 在subclass中初始化_employee
	 * 8. 在JobItem與LaborItem類別中新建isLabor(),父類別回傳false,子類別回傳true,即可刪除_isLabor欄位
	 * 9. 將getUnitPrice修正,JobItem與LaborItem類別中回傳_unitPrice與_employee.getRate()
	 * 10. 對JobItem提煉出subclass partItem,將JobItem宣告為抽象類別
	 */

	private int _unitPrice;
	private int _quantity;
	
	protected JobItem(int unitPrice, int quantity, boolean isLabor, Employee employee){
		_unitPrice = unitPrice;
		_quantity = quantity;
	}
	
	public JobItem(int unitPrice, int quantity){
		this(unitPrice, quantity, false, null);
	}
	
	public int getTotalPrice(){
		return getUnitPrice() * _quantity;
	}
	
	public int getUnitPrice(){
		return _unitPrice;
	}

	protected boolean isLabor() {
		return false;
	}
	
	public int getQuantity(){
		return _quantity;
	}
}

//	LaborItem(int quantity, Employee employee){
//		super(0, quantity, true, employee);
//	}

//	LaborItem(int quantity, Employee employee){
//		super(0, quantity, true);
//		_employee = employee;
//	}
