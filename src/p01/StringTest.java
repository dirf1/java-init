package p01;

public class StringTest {

	public static void main(String[] args) {
		String str = "1234567890";
		String str3 = "789456123";
		char c = str.charAt(5); //엣은 위치의 엣이다
		System.out.println(c);
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2); //s1의 "1"을 s2가 그대로 갖다 써서 같은 장소라 인식하여 트루라고 뜨는데
		String s3 = new String("1"); //s3는 따로 저장을 했고 다른 라인에 끌고와야 하기 때문에 펄스라고 말하는 것
		System.out.println(s1 == s3); 
		String s4 = new String("1"); 
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

	
		int idx = str.indexOf("3");
		System.out.println(idx);
		int idx2= str.indexOf("6");
		System.out.println(idx2);
		String str2 = str.substring(idx);
		System.out.println(str2);
		str2 = str.substring(idx, idx2); //345
		System.out.println(str2);
		str2 = str.replace("1","one");
		System.out.println(str2); // one234567890
		
		
		String name = "IM";
		name = name.toUpperCase();//확장자를 대문자로
		System.out.println(name);
		name = name.toLowerCase();//확장자를 소문자로
		System.out.println(name);
	
	}
}
