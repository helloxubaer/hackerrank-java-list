package com.zubaer.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
			// number of elements
			int N = sc.nextInt();
			List<Integer> L = new ArrayList<>();

			// add elements to List
			for(int i=0; i<N; i++) {
				L.add(sc.nextInt());
			}
			// number of query commands
			int Q = sc.nextInt();
			// iterate query number 
			for(int i = 0; i<Q; i++) {
				String command = sc.next();
				if(command.equals("Insert")) {
					int index = sc.nextInt();
					int value = sc.nextInt();
					L.add(index, value);
				}
				else {
					int index = sc.nextInt();
					L.remove(index);
				}
			}
			sc.close();
			
			// print modified items
			for(Integer item: L) {
				System.out.print(item+" ");
			}
			
	}
}
