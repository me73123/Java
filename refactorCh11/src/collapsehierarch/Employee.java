package collapsehierarch;

public class Employee {
	/*
	 * 1. 將想要移除的class中程式碼用pull up、push down搬移到另一class
	 * 2. 刪除多餘的class
	 * 
	 */
	private String id;
	private int rate;
	private boolean hasSpecialSkill;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public int getRate(){
		return rate * 5;
	}
	
	public boolean hasSpecialSkill(){
		return hasSpecialSkill;
	}
	
}
