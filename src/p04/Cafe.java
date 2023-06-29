package p04;

public class Cafe {
	public static String getCoffee(String order, int price) //괄호가 비어있다는 것은 아무것도 안 받겠다는 얘기
	{
		
		int coffeePrice =5000;
		if(coffeePrice>price) {
			return (coffeePrice-price)+"원이 부족합니다";
		}
			String str = "";
			if(coffeePrice<price){
			str = (price-coffeePrice)+"원이 남습니다";
		
		}
		return " 주문하신 " + price + " 원의 " + order + " 가 준비됐습니다." +str;
	}
	public static void main(String[] args) {
//		String coffee = getCoffee("아아", 2000);
//		System.out.println(coffee);
//		String coffee = getCoffee("아아", 5000);
//		System.out.println(coffee);
		String coffee = getCoffee("아아", 10000);
		System.out.println(coffee);
	}
}
