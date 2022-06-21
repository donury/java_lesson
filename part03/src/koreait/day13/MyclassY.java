package koreait.day13;

//interfaceB의 구현체
public class MyclassY implements InterfaceB{

	@Override
	public String name(String name) {
		return "MyClassY : " +name;
	}

}
class MyClassZ implements InterfaceA, InterfaceB{

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return "MyClassz :" + name ;
	}

	@Override
	public void methodA() {
		System.out.println("MyClassZ methodA");
	}

	@Override
	public int methodB(int num) {
System.out.println("MyClassZ methodA");
	return 3333;
	}
	
}