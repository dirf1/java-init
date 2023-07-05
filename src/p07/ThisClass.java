package p07;


public class ThisClass {

	String name = "경동대";
	String addr = " 양주시 고읍동";
	
	public void printName() {
		String name = "민국대";
		String addr = " 어딘가";
		System.out.println(name + addr);
		System.out.println(this.name + this.addr);
	}
	
	public static void main(String[] args) {
		
		ThisClass tc = new ThisClass();
		tc.printName();
	}
}
