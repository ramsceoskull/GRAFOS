public class Main {
	public static void main(String[] args) throws Exception {
		int[][] matrix2 = new int[2][2];

		matrix2[0][0] = 1;
		matrix2[0][1] = 1;

		matrix2[1][0] = 1;
		matrix2[1][1] = 0;

		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] matrix3 = new int[3][3];

		matrix3[0][0] = 0;
		matrix3[0][1] = 1;
		matrix3[0][2] = 1;

		matrix3[1][0] = 1;
		matrix3[1][1] = 0;
		matrix3[1][2] = 1;

		matrix3[2][0] = 1;
		matrix3[2][1] = 1;
		matrix3[2][2] = 0;

		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3.length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] matrix4 = new int[4][4];

		matrix4[0][0] = 0;
		matrix4[0][1] = 1;
		matrix4[0][2] = 1;
		matrix4[0][3] = 0;

		matrix4[1][0] = 1;
		matrix4[1][1] = 0;
		matrix4[1][2] = 0;
		matrix4[1][3] = 1;

		matrix4[2][0] = 0;
		matrix4[2][1] = 1;
		matrix4[2][2] = 0;
		matrix4[2][3] = 1;

		matrix4[3][0] = 1;
		matrix4[3][1] = 0;
		matrix4[3][2] = 1;
		matrix4[3][3] = 0;

		for (int i = 0; i < matrix4.length; i++) {
			for (int j = 0; j < matrix4.length; j++) {
				System.out.print(matrix4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] matrix5 = new int[5][5];

		matrix5[0][0] = 0;
		matrix5[0][1] = 1;
		matrix5[0][2] = 0;
		matrix5[0][3] = 1;
		matrix5[0][4] = 0;

		matrix5[1][0] = 1;
		matrix5[1][1] = 0;
		matrix5[1][2] = 1;
		matrix5[1][3] = 0;
		matrix5[1][4] = 1;

		matrix5[2][0] = 0;
		matrix5[2][1] = 1;
		matrix5[2][2] = 0;
		matrix5[2][3] = 1;
		matrix5[2][4] = 1;

		matrix5[3][0] = 1;
		matrix5[3][1] = 0;
		matrix5[3][2] = 1;
		matrix5[3][3] = 1;
		matrix5[3][4] = 0;

		matrix5[4][0] = 0;
		matrix5[4][1] = 1;
		matrix5[4][2] = 1;
		matrix5[4][3] = 1;
		matrix5[4][4] = 0;

		for (int i = 0; i < matrix5.length; i++) {
			for (int j = 0; j < matrix5.length; j++) {
				System.out.print(matrix5[i][j] + " ");
			}
			System.out.println();
		}
	}
}
