package Tema_5_Propuestas_Profesora;

import java.util.*;

public class tres_en_raya {

	public static void main(String[] args) {
		int player1 = 1, player2 = -1, cont = 9, op;
		boolean winner = false;
		int[][] board = new int[3][3];

		do {
			viewBoard(board);
			cont--;
		} while (winner || cont != 0);

	}

	int[][] game(int[][] board,int cont) {
		if (cont%2==0) {
			System.out.println("Player 2");
			viewBoardPosition();
			System.out.println("Elige posicion");
		} else {
			System.out.println("Player 1");
			viewBoardPosition();
			System.out.println("Elige posicion");
		}
		return board;
	}

	static void viewBoard(int[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + board[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println();

	}
	
	static void viewBoardPosition() {
		int c = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("[" + c + "] ");
				c++;
			}
			System.out.println();
		}
		System.out.println();

	}

	static int opcion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige numero");
		int op = sc.nextInt();
		return op;

	}

}
