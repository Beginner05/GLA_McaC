package Lec7;

import java.util.*;

public class BoardPath {
	public static void main(String[] args) {

		int dice = 6;
		int dest = 5;
		int ans = sol(0, 4, 6);
		System.out.println(ans);

	}

	public static int sol(int cp, int dest, int dice) {
		if (cp == dest)
			return 1;
		if (cp > dest)
			return 0;
		int cnt = 0;
		for (int jump = 1; jump <= dice; jump++) {
			cnt += sol(cp + jump, dest, dice);
		}

		return cnt;

	}

}