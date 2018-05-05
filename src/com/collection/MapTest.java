package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<Object,Object> map = new HashMap<Object, Object>();
		map.put("11",2000);
		
		 for (Map.Entry<Object, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		 
	}
	
}
