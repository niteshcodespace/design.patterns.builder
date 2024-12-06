package design.patterns.builder;

public class ItalianCook implements Cook {
	
	private Pizza pizza;// what cook have to do make pizza mexican 
	
	public ItalianCook() {
		this.pizza=new Pizza();
	}
	

	@Override
	public Pizza buildDough() {
		pizza.setDough("Italian Dough");
		return this.pizza;
	}

	@Override
	public Pizza setupBase() {
		pizza.setBase("Italian Base Size ");
		return this.pizza;
	}

	@Override
	public Pizza spreadSauce() {
		pizza.setSauce("Italian Chilli sauce");
		return this.pizza;
	}

	@Override
	public Pizza applyToppings() {
		pizza.setToppings("Italian Mozirella Cheess");
		return this.pizza;
	}

	@Override
	public Pizza doBaking() {
		pizza.setBase("Italian Base with speical Timing");
		return this.pizza;
	}

}
