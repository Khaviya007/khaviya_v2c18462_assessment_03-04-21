package runthread1;
public class Testcls {
	public static void main(String[] args) {
		Runnable R=()->{
			System.out.println("Runnable child");
		};
		Thread T1=new Thread(R);
		Thread T2=new Thread(R);
		T1.start();
		System.out.println("thread1 running");
		T2.start();
		System.out.println("thread2 running");
		try {
			T1.sleep(500);
			T2.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
System.out.println("Runnable thread");
	}

}
