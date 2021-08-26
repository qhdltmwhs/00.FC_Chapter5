package ch11;

public class MemberArrayListTest {

	public static void main(String[] args) {

		/*
		 * ArrayList 구현하기
		 * index 존재하며, 키값이 중복되어 저장가능하다.
		 */
		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKang);
		memberArrayList.addMember(memberHong);

		memberArrayList.showAllMember();

		memberArrayList.removeMember(memberHong.getMemberId());
		System.out.println();

		memberArrayList.showAllMember();

	}

}
