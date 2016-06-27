import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestAddRemoveList3 {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String str = it.next();
			if (str.equals("B")) {
				it.remove();
			}
		}

		for (String str : list) {
			System.out.println(str);
		}
	}
}