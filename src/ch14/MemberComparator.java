package ch14;

public class Member {


	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름

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
		if(obj instanceof Member) {
			if(this.memberId ==((Member) obj).getMemberId()) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}

}