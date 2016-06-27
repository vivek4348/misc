import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestAddRemoveList2 {

	public static void main(String args[]) {
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");

		for (String str : list) {
			if (str.equals("B")) {
				list.remove(new String("B"));
			}
		}
		
		System.out.println(list);
		
	}
}