package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) {

		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				return arrayList.remove(member);
			}
		}
		System.out.println(memberId + " 는 존재 하지 않습니다.");
		return false;

	}
	
	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
	}
	
}
