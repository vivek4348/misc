import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMain2 {

	public static void main(String[] args) {
		List<Integer> a1 = Arrays.asList(1, 2, 3);
		List<Integer> a2 = Collections.unmodifiableList(a1);
		a2.set(0,10); // java.lang.UnsupportedOperationException
		System.out.println(a1);
		System.out.println(a2);
		
		Collection<Integer> myUmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(1, 2, 3));
		
		
	}
}
