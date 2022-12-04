

import java.util.Arrays;
// Implementation of Stack data structure using array in java with dynamic size and various basic stack  operations like push, pop, isEmpty, peek.
class MyStack {
	int[] arr = new int[25];
	int index;
	int peek;
	int peekIndex;

	public MyStack() {
	}

	public MyStack(int[] arr) {
		this.arr = arr;

	}

	public void push(int i) {
//		Adding elements to the stack
		if (index > arr.length - 2) {
			arr[index] = i;
			int[] temp = new int[arr.length * 2];
			for (int j = 0; j < arr.length; j++) {
				temp[j] = arr[j];
			}
			peek = i;
			peekIndex = index;
			index++;
			arr = temp;
		} else {
			arr[index] = i;
			peek = i;
			peekIndex = index;
			index++;
		}

	}

	public int pop() {
		int temp = arr[peekIndex];
		arr[peekIndex] = 0;
		peek = arr[peekIndex - 1];
		peekIndex--;
//		index--;
		return temp;
	}

	public int peek() {
		return peek;
	}

	public int size() {
		return peekIndex + 1;
	}

	public int get(int index) {
		if (index > peekIndex)
			throw new RuntimeException(" StackIndexOutOfBounds for the given index : " + index);
		return arr[index];
	}

	public boolean isEmpty() {
		if (peekIndex == 0 && peek == 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		int[] disp = new int[peekIndex + 1];
		for (int i = 0; i < disp.length; i++) {
			disp[i] = arr[i];
		}
		return "MyStack =" + Arrays.toString(disp);
	}

}
public class MyStackMain {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		for (int i = 1; i <= 15; i++)
			myStack.push(i);
		System.out.println(myStack);
		System.out.println(myStack.peek() + "  peek");
		System.out.println(myStack.pop() + " pop");
		System.out.println(myStack.pop() + " pop");
		System.out.println(myStack.peek() + "  peek");
		System.out.println(myStack.isEmpty() + " isEmpty");
		System.out.println(myStack);
		System.out.println(myStack.size());
		System.out.println(myStack.get(11));
	}

}

