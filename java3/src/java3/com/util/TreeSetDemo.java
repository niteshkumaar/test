package java3.com.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add("Nitesh");
		set.add("Bobby");
		set.add(11);
		set.add(5);

		set.add(new Object());

		System.out.println(set);

	}

}
