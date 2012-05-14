package test;
import mysqs.Message;
public class TestMessage {
	public void test(){
		System.out.println("test Message class start");
//		Message m1 = new Message();
//		System.out.println(m1);
		Message m2 = new Message(123);
//		System.out.println(m2);
		m2.setContent("Hello");
		//System.out.println(m2);
		m2.start();
		for(int i=0; i <1000000;i++){
			System.out.println(m2.isLocked);
		}
		
		//System.out.println("end test");
	}
}
