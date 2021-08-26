package ch14.comparator;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		/*
		 * TreeSet 에서 Comparator 사용시 
		 * TreeSet 객체 생성시 Comparator가 구현된 객체를 넣어줘야 한다.
		 * ==> public class Member implements Comparator<Member>
		 */
		treeSet = new TreeSet<>(new Member());
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
