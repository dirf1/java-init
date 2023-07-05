package p07;

class Coffee {
	public String name;
	public int price;
	
	public String toString() {
		return "name :" + name + "price" + price;
	}
}

public class Overriding {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.name = "아아";
		c1.price = 2000;
		
		Coffee c2 = c1;
		Object obj = c1;
		
		System.out.println("주문 메뉴는 " + c1.name + " 가격은 " + c1.price);
		
		
	}
}
