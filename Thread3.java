public class Thread3 extends Thread
{
    public void run(){
        System.out.println("Hello All");
    }
	public static void main(String[] args) {
		Thread3 t1 = new Thread3();
		t1.start();
		Thread3 t2 = new Thread3();
		t2.start();
		Thread3 t3 = new Thread3();
		t3.start();
		Thread3 t4 = new Thread3();
		t4.start();
		Thread3 t5 = new Thread3();
		t5.start();
	}
}