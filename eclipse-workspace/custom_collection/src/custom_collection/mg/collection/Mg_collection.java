package custom_collection.mg.collection;

public class Mg_collection {

	private Object[] objArray = new Object[5];
	private int elementCount = 0;

	public void add(Object obj) {
		elementCount++;
		if (elementCount == objArray.length) {
			increaseCapacity();
		}
		objArray[elementCount] = obj;

	}

	private void increaseCapacity() {
		int newCapacity = (int) (objArray.length+0.5*objArray.length);
		Object[] nextArray = new Object[newCapacity];
		for (int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];
		}
		objArray = nextArray;

	}

	public static void main(String[] mg) {
		Mg_collection m = new Mg_collection();
		for (int i = 1; i <=10; i++) {
			m.add(i);
		}
		System.out.print("{");
		for (int j = 1; j < m.objArray.length; j++) {
			System.out.print(m.objArray[j] + ", ");
		}System.out.print("}");
	}
}
