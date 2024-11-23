package ak;

//import java.io.DataInput;
//
//public class MagicMatric {
//
//	static int  input(int sr[][]) {
//		int total1r = 0;
//		
//		int coltotal=0;
//		
//		for (int i = 0;i<=2 ;i++)
//		{     total1r=0;
//			for (int j = 0; j<=2;j++) {
//			 		total1r += sr[i][j];
//			 		
//			}
//			
//			System.out.println(total1r);
//		 int arr[] =new int [total1r];
//		}
//		return total1r;
//	
//}
//	static void compareRow(int total1r) {
//		System.out.println(total1r);
//		
//	}
//
//	void display() {
//		
//
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[][] sr = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 1, 2 } };
//	int total=	MagicMatric.input(sr);
//		MagicMatric.compareRow(total);
//
//	}
//
//}
public class MagicMatricidendify {

	static int[] hori(int[][] sr) {
		int[] rowTotals = new int[sr.length];

		for (int i = 0; i < sr.length; i++) {
			int total1r = 0;
			for (int j = 0; j < sr[i].length; j++) {
				total1r += sr[i][j];
			}
			rowTotals[i] = total1r;
			// System.out.println("Total for row " + i + ": " + total1r);
		}

		return rowTotals;
	}

	static int[] verti(int[][] sr) {// for vertical column
		int[] rowTotals2 = new int[sr.length];

		int total2r = 0;
		for (int i = 0; i < sr.length; i++) {
			total2r = 0;
			for (int j = 0; j < sr[i].length; j++) {
				total2r += sr[j][i];
			}
			rowTotals2[i] = total2r;
			System.out.println("Total for row " + i + ": " + total2r);
		}

		return rowTotals2;
	}

	static int diagonalSum(int[][] sr) {
		int sum1 = 0;
		for (int i = 0; i < sr.length; i++) {

			sum1 += sr[i][sr.length - 1 - i];
		} // If the matrix size is odd, subtract the middle element which was added twice

		return sum1;

	}

	static int normalDig(int[][] sr) {
		int sum2 = 0;
		for (int i = 0; i < sr.length; i++) {
			for (int j = 0; j < sr[i].length; j++) {

				if (i == j) {
					sum2 += sr[i][j];
				}
			}
		}
		System.out.println("Sum: " + sum2);
		return sum2;
	}

	static void compareRow(int[] rowTotals, int[] rowTotals2, int sum1, int sum2) {
		for (int i = 0; i < rowTotals2.length; i++) {
			System.out.println("Row " + i + " total: " + rowTotals2[i]);
		}

		if (rowTotals[0] == rowTotals[1] && rowTotals[1] == rowTotals[2] && rowTotals2[0] == rowTotals2[1]
				&& rowTotals2[1] == rowTotals2[2] && sum1 == sum2) {
			System.out.println("are magical");
		}

		else {
			System.out.println("Not magical");
		}
	}

	public void display() {
		// You can add your display logic here
	}

	public static void main(String[] args) {
		int[][] sr = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		int[] totals = MagicMatric.hori(sr);
		int[] totals2 = MagicMatric.verti(sr);
		int sum1 = MagicMatric.diagonalSum(sr);
		int sum2 = MagicMatric.normalDig(sr);
		MagicMatric.compareRow(totals, totals2, sum1, sum2);

	}
}
