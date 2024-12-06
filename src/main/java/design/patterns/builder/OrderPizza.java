package design.patterns.builder;

public class OrderPizza {

	public static void main(String[] args) {
		// ItalianPizza
		//Cook cook = new ItalianCook();
		Cook cook = new MexicianCook();
	    HeadChef chef = new HeadChef(cook);
	    chef.deliverPizza().getPizza();
	    

	}

}
