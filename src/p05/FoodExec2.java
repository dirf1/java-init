package p05;




public class FoodExec2 {
	
	
	

	public class FoodExec3{
	
	Food f3 = new Food(); 
	public String name3;
	public int price3;
	public String type3;
	}

	public class FoodExec4{
	
	Food f4 = new Food(); 
	public String name4;
	public int price4;
	public String type4;
	
	}
	
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
 		System.out.println((f.name) );
 		System.out.println((f.price) );
		System.out.println( ("구분:") + (f.type) );
		}
	}
	
	public static void main(String[] args) {
	Food f = new Food(); 
		f.name = "삼겹살";
	f.price = 15000;
	f.type = "한식";
		
		Food f2 = new Food(); 
		f2.name = "장어";
		f2.price = 50000;
		f2.type = "한식";
		
		Food f3 = new Food(); 
		f3.name = "백반";
		f3.price = 12000;
		f3.type = "한식";
		
		
//		printFood(foods)(f);
//		printFood(f2);
		
//		printFood(f3);
//	
		
		Food[] foods = new Food[5];
		foods[0] = f;
		foods[1] = f2;
		foods[2] = f3;
    	printFood(foods);	
		
 		}
	}
