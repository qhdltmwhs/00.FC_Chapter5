package ch14.comparator.utilize;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorUtilizeTest {

	public static void main(String[] args) {
		
		/*
		 * Comparator활용
		 * 보통의 경우 Comparable을 사용하면 되지만 Comparable이 이미 구현된 
		 * String 타입객체 같은경우 Comparator로 비교하는 방식을 다시 구현할 수 있다. 
		 */
		Set<String> set = new TreeSet<>();

		set.add("AAA");
		set.add("BBB");
		set.add("CCC");

		System.out.println(set);

		/*
		 * inferface Comparator를 구현한 클래스(MyCompare) 
		 * 객체(new MyCompare())를 TreeSet 선언시 인자로 넣는다. 
		 */
		set = new TreeSet<>(new MyCompare());

		set.add("AAA");
		set.add("BBB");
		set.add("CCC");

		System.out.println(set);

	}

}
