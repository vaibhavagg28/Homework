package homework_3;

public class Carpet {

	public static void main(String[] args) {
	
			int length = 15;
	        int width = 25;
	        double pricePerSquareFoot = 2.99;
	        int area = length * width;
	        
	        double cost = area * pricePerSquareFoot;
	        
	        System.out.println("The cost of carpeting the room is $" + cost);
	}

}
