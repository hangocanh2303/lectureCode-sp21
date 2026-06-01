package fall2025;


import org.w3c.dom.Node;

import java.util.Objects;

public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

//	public static IntList of(int[] ints) {
//		if (ints == null || ints.length == 0) {
//			return null;
//		}
//		IntList result = new IntList(ints[ints.length - 1], null);
//		for (int i = ints.length - 2; i >= 0; i--) {
//			result = new IntList(ints[i], result);
//		}
//		return result;
//	}

	public static IntList of(int... ints) {

		if (ints == null || ints.length == 0) {
			return null;
		}

		IntList result = new IntList(ints[ints.length - 1], null);

		for (int i = ints.length - 2; i >= 0; i -= 1) {
			result = new IntList(ints[i], result);
		}

		return result;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof IntList intList)) return false;
        return first == intList.first && Objects.equals(rest, intList.rest);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.get(100));
	}

	public static IntList ejectND(IntList x, int y) {
		if (x == null) {
			return null;
		}
		if (x.first == y) {
			return ejectND(x.rest, y);
		}
		return new IntList(x.first, ejectND(x.rest, y));
	}

	public static IntList ejectD(IntList x, int y) {
		if (x == null) {
			return null;
		}
		x.rest = ejectD(x.rest, y);
		if (x.first == y) {
			return x.rest;
		}
		return x;
	}
} 