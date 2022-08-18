public class Thread4 implements Runnable
{
    public void run(){
        System.out.println("Hello India");
    }
	public static void main(String[] args) {
		Thread4 m1 = new Thread4();
		Thread t1 = new Thread(m1);
		t1.start();
		Thread4 m2 = new Thread4();
		Thread t2 = new Thread(m2);
		t2.start();
		Thread4 m3 = new Thread4();
		Thread t3 = new Thread(m3);
		t3.start();
		Thread4 m4 = new Thread4();
		Thread t4 = new Thread(m4);
		t4.start();
		Thread4 m5 = new Thread4();
		Thread t5 = new Thread(m5);
		t5.start();
	}
}