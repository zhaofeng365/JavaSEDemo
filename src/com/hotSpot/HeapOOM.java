package com.hotSpot;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	static class OOMObject {
	}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		int index = 0;
		while (true) {
			list.add(new OOMObject());
			++index;
		}
	}

}
