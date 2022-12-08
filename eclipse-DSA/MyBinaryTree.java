import java.util.Scanner;

public class MyBinaryTree {
	int treeSize;
	Scanner scanner;
	private static MyBinaryTree main;

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

	int nodeCountOfMyBinaryTreeNode(MyBinaryTreeNode<Integer> binaryTreeNode) {
		if (binaryTreeNode == null)
			return 0;
		int leftCount = nodeCountOfMyBinaryTreeNode(binaryTreeNode.left);
		int rightCount = nodeCountOfMyBinaryTreeNode(binaryTreeNode.right);
		return 1 + leftCount + rightCount;
	}
	int leavesCount(MyBinaryTreeNode<Integer> binaryTreeNode){
		if(binaryTreeNode == null) return 0;
		if(binaryTreeNode.left == null && binaryTreeNode.right == null) return 1;
		return leavesCount(binaryTreeNode.left) + leavesCount(binaryTreeNode.right);
	}
	
	MyBinaryTreeNode<Integer> removeLeaves(MyBinaryTreeNode<Integer> root){
		if(root == null) return null;
		if(root.left == null && root.right == null) return null;
			
			root.left=removeLeaves(root.left);
			root.right=removeLeaves(root.right);
			
	
		return root;
	}
	public static void main(String[] args) {
		main = new MyBinaryTree();
		MyBinaryTreeNode<Integer> takeInput = main.takeInputImproved(null, "");
		new MyBinaryTreeNode<Integer>(null).print(takeInput);
		System.out.println("Node count in " + takeInput + " is : " + main.treeSize);
		System.out.println(main.nodeCountOfMyBinaryTreeNode(takeInput));
		System.out.println(main.leavesCount(takeInput));
		MyBinaryTreeNode<Integer> r =main.removeLeaves(takeInput);
		new MyBinaryTreeNode<Integer>(null).print(r);
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
		return "MyBinaryTreeNode";
	}

}
