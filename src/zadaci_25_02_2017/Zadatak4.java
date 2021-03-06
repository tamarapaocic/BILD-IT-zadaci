package zadaci_25_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

import metode.DoubleUserInput;

public class Zadatak4 {

	public static void main(String[] args) {
		double[][] matrix = getMatrix();

		for (int col = 0; col < matrix[0].length; col++) {	
			System.out.println("Suma elemenata u koloni " + col + " je " + sumColumn(matrix, col));
		}
	}

	//metoda za unos elemenata u matricu
	public static double[][] getMatrix() {
		
		Scanner sc = new Scanner(System.in);
		final int ROWS = 3;
		final int COLUMNS = 4;
		double[][] m = new double[ROWS][COLUMNS];

		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[0].length; col++) {
				m[row][col] = DoubleUserInput.getDouble(sc,"Unesite broj: ");
			}
		}

		sc.close();

		System.out.println("");

		return m;
	}

	//metoda za sumu elemenata po kolonama
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];		
		}
		return sum;
	}
}