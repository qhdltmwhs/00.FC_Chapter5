package ch13;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		/*
		 * HashSet
		 * 같은 키값 존재할 수 없다.
		 * 담으려는 객체의 클래스내부에서 
		 * equal & hashCode 메서드를 재정의 되어 중복을 방지한다.
		 */
		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		
		Member memberHong = new Member(1003, "홍길동");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.addMember(memberHong);

		memberHashSet.showAllMember();
		
		
		memberHashSet.removeMember(memberHong.getMemberId());
		System.out.println();

		memberHashSet.showAllMember();

	}

}
