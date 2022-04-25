package lmdb_anony_inne_cls_04;

public class Test {

	public static void main(String[] args) {

//		Used Lambda-Expression more than a boss
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("CHILD LAMBDA-EXPRESSION THREAD************");
			}
		}).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("MAIN THREAD==================");
		}

//	Runnable r = new Runnable() {
//			public void run() {
//				System.out.println("CHILD THREAD------------------");}
//		};

//		using Anonymous inner class

		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("CHILD INNER-CLASS THREAD------------------");
				}
			}
		}).start();

////		Used Lambda-Expression like a boss

//		
//		Runnable r = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("CHILD LAMBDA-EXPRESSION THREAD********************");
//			}
//			;
//		};
//		new Thread(r).start();

	}

}
