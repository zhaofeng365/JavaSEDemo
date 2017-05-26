package com;

import java.util.HashSet;
import java.util.Set;

class Name {
	private String first;
	private String last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		System.out.println(o.getClass() == Name.class);
		if (o.getClass() == Name.class) {
			Name n = (Name) o;
			return n.first.equals(first) && n.last.equals(last);
		}
		return false;
	}

	// 根据 first 计算 Name 对象的 hashCode() 返回值
	public int hashCode() {
		return first.hashCode();
	}

	public String toString() {
		return "Name[first=" + first + ", last=" + last + "]";
	}
}

public class HashSetTest {
	public static void main(String[] args) {
		Set<Name> s = new HashSet<Name>();
		Name name = new Name("abc", "123");
		Name name1 = new Name("abc", "123");
		s.add(name);
		System.out.println(s.contains(name1));
	}
}