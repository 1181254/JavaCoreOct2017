interface Plan{
	void setDataAndPrice();
	void showPlan();
}

class Plan2G implements Plan{

	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 2;
		price = 200;
	}

	public void showPlan() {
		System.out.println("Plan 2G is available for \u20b9"+price+" and you will get "+data+"GB");
	}	
}

class Plan3G implements Plan{

	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 3;
		price = 300;
	}

	public void showPlan() {
		System.out.println("Plan 3G is available for \u20b9"+price+" and you will get "+data+"GB");
	}	
}

class Plan4G implements Plan{

	int data;
	int price;
	
	public void setDataAndPrice() {
		data = 5;
		price = 500;
	}

	public void showPlan() {
		System.out.println("Plan 4G is available for \u20b9"+price+" and you will get "+data+"GB");
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
		
		plan.setDataAndPrice();
		return plan;
	}
	
}


public class FactoryDemo {

	public static void main(String[] args) {
		
		/*Plan plan = new Plan2G();
		plan.setDataAndPrice();
		plan.showPlan();
		
		plan = new Plan3G();
		plan.setDataAndPrice();
		plan.showPlan();
		
		plan = new Plan4G();
		plan.setDataAndPrice();
		plan.showPlan();*/
		
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();
		

	}

}
