package design.patterns.builder;

public class MexicianCook implements Cook {
	
	private Pizza pizza;// what cook have to do make pizza mexican 
	
	public MexicianCook() {
		this.pizza=new Pizza();
	}
	

	@Override
	public Pizza buildDough() {
		pizza.setDough("Mexican Dough");
		return this.pizza;
	}

	@Override
	public Pizza setupBase() {
		pizza.setBase("Mexican Base Size ");
		return this.pizza;
	}

	@Override
	public Pizza spreadSauce() {
		pizza.setSauce("Mexican Chilli sauce");
		return this.pizza;
	}

	@Override
	public Pizza applyToppings() {
		pizza.setToppings("Mexican Mozirella Cheess");
		return this.pizza;
	}

	@Override
	public Pizza doBaking() {
		pizza.setBase("Mexican Base with speical Timing");
		return this.pizza;
	}

}
