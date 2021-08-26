package ch14.comparator;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * TreeSet 같은 키값 존재할 수 없다.
		 * java.util.Comparator ==> 
		 * Comparable은 java.lang이며, Comparator는 java.util이다. 
		 * 비교대상이 대는 클래스 내부에 Comparator의 interfacef를 implement하여 
		 * compare 메서드를 구현해야한다.
		 * 또한, TreeSet 객체생성시 객체 constructor안에 Comparator의 interfacef를 implement한
		 * 객체를 명시 해줘야 한다. ex) TreeSet<Member> treeSet = new TreeSet<>(new Member()); 이때,
		 * 넣어줄 객체는 반시드 기본 constructor가 존재 해야한다.
		 * 구현하지않고 add 메서드 사용시 ==> Exception : cannot be cast to java.lang.Comparable
		 */
		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		Member memberHong = new Member(1003, "홍길동");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);

		memberTreeSet.showAllMember();
		
		
		memberTreeSet.removeMember(memberHong.getMemberId());
		System.out.println();

		memberTreeSet.showAllMember();

	}

}
