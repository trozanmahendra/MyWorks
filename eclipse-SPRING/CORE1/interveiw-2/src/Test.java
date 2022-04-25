import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public boolean hasCycle(ListNode head) {
		Set<ListNode> mp = new HashSet<>();
		while (head != null) {
			if (mp.contains(head)) {
				return true;
			}
			mp.add(head);
			head = head.next;
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode ln = new ListNode();
		Test t = new Test();
		var res = t.hasCycle(ln);
		System.out.println(res);

	}

}
