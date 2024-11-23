package ak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroHAteusinglist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int r = sc.nextInt();
		System.out.println("Enter the col");
		int c = sc.nextInt();
		List<List<Integer>> max = new ArrayList<>();

		// int[][] max = new int[r][c];

		for (int i = 0; i < r; i++) {
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < c; j++) {
				// max[i][j] = sc.nextInt();
				row.add(sc.nextInt());
			}
			max.add(row);
		}
		System.out.println(r + " " + c);
		for (List<Integer> coll : max) {
			for (int ele : coll) {
				System.out.print(ele + " ");

			}
			System.out.println();

		}
	
			for (int i = 0; i < max.size(); i++) {
				
				List<Integer> row = new ArrayList<>();
				for (int j = 0; j <max.get(i).size(); j++) {
					if(max.get(i).get(j) == 0) 
					{
						max.get(i).remove(j);
					j--;
					}
				}
				if(max.get(i).isEmpty()) {
				max.remove(i);
				i--;
				}
				
			}
			System.out.println("updated matrix:");
			for (List<Integer> coll : max) {
				for (int ele : coll) {
					System.out.print(ele + " ");

				}
				System.out.println();

			}

		}
	}


