package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수연습2 {

	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int find = commands[i][2] - 1;

			// 1.num 배열에서 2번째~5번째(index : 1~4)까지 추출
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = start; j <= end; j++) {
				list.add(num[j]);
			}
			// 2.정렬
			Collections.sort(list);
			System.out.println(list);

			// 3.원하는 위치가 3번째 숫자를 추출
			System.out.println(list.get(find));
			answer[i] = list.get(find);
		}
		System.out.println(Arrays.toString(answer));
	}
}