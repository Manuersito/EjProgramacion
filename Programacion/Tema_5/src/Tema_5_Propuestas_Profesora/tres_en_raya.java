package Tema_5_Propuestas_Profesora;

import java.util.*;

public class tres_en_raya {

	public static void main(String[] args) {
		int cont = 9;
		int winner = 0;
		int[][] board = new int[3][3];

		do {
			viewBoard(board);
			game(board, cont);
			winner = winner(board, winner);
			cont--;
		} while (winner != 3 && winner != -3 && cont != 0);
		viewBoard(board);
		if (winner == 3) {
			System.out.println("Ganador Player 1");
		} else {
			if (winner == -3) {
				System.out.println("Ganador Maquina");
			} else {
				System.out.println("Ha habido un empate");
			}
		}

	}

	static int[][] game(int[][] board, int cont) {
		if (cont % 2 == 0) {
			System.out.println("  🖥️");
			viewBoardPosition();
			position(board, cont);
		} else {
			System.out.println("  👨‍💻");
			viewBoardPosition();
			position(board, cont);
		}
		return board;
	}

	static int[][] position(int[][] board, int cont) {
		int op;

		if (cont % 2 == 0) {
			op = (int) (Math.random() * 9 + 1);
		} else {
			System.out.println("Elige posicion");
			op = opcion();
		}

		switch (op) {
		case 1:
			if (board[0][0] == 0) {
				if (cont % 2 == 0) {
					board[0][0] = -1;
				} else {
					board[0][0] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}

			}

			break;
		case 2:
			if (board[0][1] == 0) {
				if (cont % 2 == 0) {
					board[0][1] = -1;
				} else {
					board[0][1] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 3:
			if (board[0][2] == 0) {
				if (cont % 2 == 0) {
					board[0][2] = -1;
				} else {
					board[0][2] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 4:
			if (board[1][0] == 0) {
				if (cont % 2 == 0) {
					board[1][0] = -1;
				} else {
					board[1][0] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 5:
			if (board[1][1] == 0) {
				if (cont % 2 == 0) {
					board[1][1] = -1;
				} else {
					board[1][1] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 6:
			if (board[1][2] == 0) {
				if (cont % 2 == 0) {
					board[1][2] = -1;
				} else {
					board[1][2] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 7:
			if (board[2][0] == 0) {
				if (cont % 2 == 0) {
					board[2][0] = -1;
				} else {
					board[2][0] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 8:
			if (board[2][1] == 0) {
				if (cont % 2 == 0) {
					board[2][1] = -1;
				} else {
					board[2][1] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;
		case 9:
			if (board[2][2] == 0) {
				if (cont % 2 == 0) {
					board[2][2] = -1;
				} else {
					board[2][2] = 1;
				}
			} else {
				if (cont % 2 == 0) {
					return position(board, cont);
				} else {
					System.out.println();
					System.out.println("Posición ocupada. Inténtalo de nuevo.");
					System.out.println();
					return position(board, cont);
				}
			}
			break;

		}
		return board;
	}

	// Método para verificar si hay un ganador en el tablero
	static int winner(int[][] tablero, int winner) {
		// Verificar filas y columnas
		for (int i = 0; i < 3; i++) {
			// Verificar filas
			if (tablero[i][0] + tablero[i][1] + tablero[i][2] == 3) {
				winner = 3; // Hay un ganador (player 1) en la fila i
				break;
			} else if (tablero[i][0] + tablero[i][1] + tablero[i][2] == -3) {
				winner = -3; // Hay un ganador (player 2) en la fila i
				break;
			}

			// Verificar columnas
			if (tablero[0][i] + tablero[1][i] + tablero[2][i] == 3) {
				winner = 3; // Hay un ganador (player 1) en la columna i
				break;
			} else if (tablero[0][i] + tablero[1][i] + tablero[2][i] == -3) {
				winner = -3; // Hay un ganador (player 2) en la columna i
				break;
			}
		}

		// Verificar diagonales
		if (tablero[0][0] + tablero[1][1] + tablero[2][2] == 3 || tablero[0][2] + tablero[1][1] + tablero[2][0] == 3) {
			winner = 3; // Hay un ganador (player 1) en alguna diagonal
		} else if (tablero[0][0] + tablero[1][1] + tablero[2][2] == -3
				|| tablero[0][2] + tablero[1][1] + tablero[2][0] == -3) {
			winner = -3; // Hay un ganador (player 2) en alguna diagonal
		}

		return winner;

	}

	static void viewBoard(int[][] board) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == 1) {
					System.out.print("[" + "❌" + "] ");
				} else {
					if (board[i][j] == -1) {
						System.out.print("[" + "⭕" + "] ");
					} else {
						System.out.print("[" + "▫️" + "] ");
					}

				}
			}
			System.out.println();
		}
		System.out.println();

	}

	static void viewBoardPosition() {
		int c = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				String cadenaNumero = String.valueOf(c);
				String resultado = cadenaNumero + "\uFE0F\u20E3";
				System.out.print(resultado + " ");
				c++;
			}
			System.out.println();
		}
		System.out.println();

	}

	static int opcion() {
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();

		return op;
	}

}
