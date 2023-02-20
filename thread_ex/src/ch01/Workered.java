package ch01;

public class Workered extends Thread{
	
	
	
	private String name;
	public Workered(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker :" +name+" : "+ i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}// end of run
}
