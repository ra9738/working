package com.byung.array;

import java.util.Arrays;
import java.util.Comparator;

public class sort {

	public static void main(String[] args) 
	{
		final String[][] data = new String[][]{
			new String[] {"5", "a"},
			new String[] {"3", "b"},
			new String[] {"6", "c"},
			new String[] {"1", "d"},
			new String[] {"2", "e"}
		};
		Arrays.sort(data, new Comparator<String[]>() {
			public int compare (final String[] entry1, final String[] entry2){
				return entry1[1].compareTo(entry2[1]);
			}
		});
		
        for (final String[] s : data) {
            System.out.println(s[0] + " " + s[1]);
        }
	}
}
