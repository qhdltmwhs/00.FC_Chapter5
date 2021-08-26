package ch14;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		/*
		 * TreeSet
		 * 같은 키값 존재할 수 없다.
		 * 담으려는 객체의 클래스내부에서 
		 * equal & hashCode 메서드를 재정의 되어 중복을 방지한다.
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
