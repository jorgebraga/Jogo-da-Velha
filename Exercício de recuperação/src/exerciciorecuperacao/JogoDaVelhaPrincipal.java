
package exerciciorecuperacao;

import java.util.Scanner;

/**
 *
 * @author Jorge Braga
 * RECUPERAÇÃO LPOO
 */
public class JogoDaVelhaPrincipal {

  
    public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		JogoDaVelha jogo = new JogoDaVelha();
		int player = 1;
		int vencedor = jogo.verificarVencedor();
		jogo.mostrar();
		while (vencedor == 0) {
			System.out.println("PLAYER " + player);
			System.out.print("Linha: ");
			int linha = teclado.nextInt();
			System.out.print("Coluna: ");
			int coluna = teclado.nextInt();
			if (!jogo.efetuarJogada(player, linha-1, coluna-1)) {
				System.out.println("Jogada inválida, tente outra vez...");
			} else {
				player = (player == 1) ? 2 : 1;
			}
			jogo.mostrar();
			vencedor = jogo.verificarVencedor();
		}
		switch (vencedor) {
		case 1 :
			System.out.println("Jogador 1 venceu!");
			break;
		case 2:
			System.out.println("Jogador 2 venceu!");
			break;
		case 3:
			System.out.println("Partida empatada!");
			break;
		}
	}
}