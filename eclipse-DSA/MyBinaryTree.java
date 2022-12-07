
import java.util.Scanner;

public class Main {
	int treeSize;
	Scanner scanner;

	MyBinaryTreeNode<Integer> takeInputImproved(MyBinaryTreeNode<Integer> rootBinaryTreeNode, String str) {
		if (rootBinaryTreeNode == null)
			System.out.println("Enter root data");
		else
			System.out.println("Enter the " + str + " child of " + rootBinaryTreeNode.data + "---->");

		scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		if (data == -1)
			return null;
		else
			treeSize++;

		rootBinaryTreeNode = new MyBinaryTreeNode<Integer>(data);
		MyBinaryTreeNode<Integer> leftchildBinaryTreeNode = takeInputImproved(rootBinaryTreeNode, "left");
		MyBinaryTreeNode<Integer> rightChildBinaryTreeNode = takeInputImproved(rootBinaryTreeNode, "right");
		rootBinaryTreeNode.left = leftchildBinaryTreeNode;
		rootBinaryTreeNode.right = rightChildBinaryTreeNode;

		return rootBinaryTreeNode;
	}

	@SuppressWarnings("resource")
	MyBinaryTreeNode<Integer> takeInput() {

		System.out.println("Enter root data");

		Scanner scanner = new Scanner(System.in);
		int data = scanner.nextInt();
		if (data == -1) {

			return null;
		}
		MyBinaryTreeNode<Integer> rootBinaryTreeNode = new MyBinaryTreeNode<Integer>(data);
		MyBinaryTreeNode<Integer> leftchildBinaryTreeNode = takeInput();
		MyBinaryTreeNode<Integer> rightChildBinaryTreeNode = takeInput();
		rootBinaryTreeNode.left = leftchildBinaryTreeNode;
		rootBinaryTreeNode.right = rightChildBinaryTreeNode;

		return rootBinaryTreeNode;
	}

	public static void main(String[] args) {
		Main main = new Main();
		MyBinaryTreeNode<Integer> takeInput = main.takeInputImproved(null, "");
		new MyBinaryTreeNode<Integer>(null).print(takeInput);
		System.out.println("Node count in " + takeInput + " is : " + main.treeSize);

	}

}

class MyBinaryTreeNode<T> {
	T data;
	MyBinaryTreeNode<T> left;
	MyBinaryTreeNode<T> right;

	public MyBinaryTreeNode(T data) {
		this.data = data;
	}

	void print(MyBinaryTreeNode<T> root) {
		if (root == null)
			return;
		System.out.print(root.data + " : ");
		if (root.left != null)
			System.out.print("L-" + root.left.data + "  ");
		if (root.right != null)
			System.out.print("R-" + root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyBinaryTreeNode";
	}

}
