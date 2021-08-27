package ch15;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		/*
		 * HashMap 같은 키값 존재할 수 없다.
		 * HashMap<K, V> key값과 value값이 한쌍(pair)로 이루어져 있다.
		 * key값은 Set으로, value값은 List로 구성되어있다.
		 * java.util.HashMap ==> 
		 */
		MemberHashMap memberHashMap = new MemberHashMap();

		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		Member memberHong = new Member(1003, "홍길동");

		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);

		memberHashMap.showAllMember();
		
		
		memberHashMap.removeMember(memberHong.getMemberId());
		System.out.println();

		memberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(2001, "모네");
		hashMap.put(2002, "모네");
		hashMap.put(2003, "모네");
		hashMap.put(2004, "모네");
		hashMap.put(2005, "모네");
		
		System.out.println(hashMap);

	}

}
