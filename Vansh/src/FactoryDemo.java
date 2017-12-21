interface Plan{
	void setPriceAndData();
	void showPlan();
}

class Plan2G implements Plan{
	
	int data;
	int price;

	public void setPriceAndData() {
		data = 2;
		price = 200;
	}

	public void showPlan() {
		System.out.println(data+" GB data for 2G is available in \u20b9"+price);
	}
	
}

class Plan3G implements Plan{
	
	int data;
	int price;

	public void setPriceAndData() {
		data = 3;
		price = 300;
	}

	public void showPlan() {
		System.out.println(data+" GB data for 3G is available in \u20b9"+price);
	}
	
}

class Plan4G implements Plan{
	
	int data;
	int price;

	public void setPriceAndData() {
		data = 4;
		price = 400;
	}

	public void showPlan() {
		System.out.println(data+" GB data for 4G is available in \u20b9"+price);
	}
}

class PlanFactory{
	
	static Plan getPlan(int type){
		
		Plan plan = null;
		
		switch (type) {
		case 2:
			plan = new Plan2G();
			break;

		case 3:
			plan = new Plan3G();	
			break;
			
		case 4:
			plan = new Plan4G();
			break;
		}
		
		plan.setPriceAndData();
		return plan;
		
	}
}

public class FactoryDemo {

	public static void main(String[] args) {
	
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();
		
	}

}
