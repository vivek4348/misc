
import java.util.ArrayList;
import java.util.List;

public class TestAddRemoveList1 {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");

		for (String str : list) {
			if (str.equals("B")) {
				list.remove(new String("B"));
			}
		}
	}
}