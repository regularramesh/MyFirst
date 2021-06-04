
public class Check {
	
	public void controller() {
		System.out.println("Iam the controller class");
	}


	public static void main(String[] args) {
		Check ck=new Check();
		Check1 ch=new Check1();
		ck.controller();
		ch.student();
		ch.staff();
		ch.own();
	
	}

}
