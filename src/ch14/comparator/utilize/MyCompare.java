package ch14.comparator.utilize;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		/*
		 * String 타입객체는 이미 return s1.compareTo(s2);가
		 * 구현되있기에 compare 메서드를 구현하여 변경
		 * 이경우 compareTo로 구현된 오름차순 ==> compare로 내림차순
		 */
		return (s1.compareTo(s2)) * (-1);
	}

}
