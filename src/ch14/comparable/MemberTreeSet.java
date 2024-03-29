package ch14.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = treeSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				return treeSet.remove(member);
			}
		}

		System.out.println(memberId + " 는 존재 하지 않습니다.");
		return false;

	}

	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
	}

}
