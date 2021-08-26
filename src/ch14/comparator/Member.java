package ch14.comparator;

import java.util.Comparator;

public class Member implements Comparator<Member> {

	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member() {
		/*
		 * TreeSet 에서 Comparator 사용시 
		 * TreeSet에 담겨질 객체 클래스는  
		 * 반시드 기본 constructor가 존재 해야한다.
		 */
	}
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			if (this.memberId == ((Member) obj).getMemberId()) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int compare(Member member1, Member member2) {
		//return member1.memberId - member2.getMemberId(); // 오름차순
		return (member1.memberId - member2.getMemberId()) * (-1); // 내림차순
	}

}
