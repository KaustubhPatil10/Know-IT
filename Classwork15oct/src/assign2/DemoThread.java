package assign2;

public class DemoThread {

		public static void main(String[] args) {
			
			MyThread1 t1=new MyThread1();
			MyThread1 t2=new MyThread1();
			MyThread1 t3=new MyThread1();
			//t2.setPriority(1);
			t1.start();
			t2.start();
			t3.start();
			
			Thread.currentThread().setName("BMW");
			System.out.println(Thread.currentThread().getName());
			


		}

	}

