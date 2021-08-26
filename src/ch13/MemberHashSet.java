package ch13;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();
	}

	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = hashSet.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				return hashSet.remove(member);
			}
		}

		System.out.println(memberId + " 는 존재 하지 않습니다.");
		return false;

	}

	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
	}

}
