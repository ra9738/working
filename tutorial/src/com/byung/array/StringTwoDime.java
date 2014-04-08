package com.byung.array;

import java.util.Arrays;
import java.util.Comparator;

public class StringTwoDime 
{
	public static void main(String[] args) {
		String[][] addressArray = new String[][]{
				{"E", "abc st", "Sunshine", "FL"},
				{"A", "bbb st", "Sunrise", "FL"},
				{"N", "ebs st", "Cleaveland", "OH"},
				{"Q", "qqa st", "Dallas", "TX"},
				{"W", "gge st", "San Antonio", "TX"},
		};
		
		// sort array by City name or column 3
		Arrays.sort(addressArray, new ColumnComparator(1));
		
		for (int i = 0; i < addressArray.length; i++) {
			String[] row = addressArray[i];
			for (int j = 0; j < row.length; j++) {
				System.out.println(row[j] + " | ");
			}
			System.out.println("\n");
		}
	}
}

class ColumnComparator implements Comparator
{
	int columnToSort;
	public ColumnComparator(int columnToSort) {
		this.columnToSort = columnToSort;
	}
	public int compare(Object o1, Object o2) {
		String[] row1 = (String[]) o1;
		String[] row2 = (String[]) o2;
		
		return row1[columnToSort].compareTo(row2[columnToSort]);
	}
}
