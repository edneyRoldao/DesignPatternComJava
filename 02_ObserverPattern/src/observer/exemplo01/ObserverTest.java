package observer.exemplo01;

import java.util.ArrayList;

/**
 * Classe de Teste do Pattern
 * 
 * @author Edney Roldão
 *
 */
public class ObserverTest {

	public static void main(String[] args) {
		
		/**
		 * Criando o objeto onde as atualizações serão observadas.
		 * Nesse cenário, vamos registrar uma partida de futebol.
		 */
		Subject objetoObservado = new CommentaryObject(new ArrayList<Observer>(), "Semifinal do paulista: Corinthians vs Aldax");
		
		/**
		 * Registro de usuário(Observer) que vai receber as atualizações do jogo.
		 */
		Observer objetoObservador = new SMSUsers(objetoObservado, "Andre Galvao [Transamerica e Band]");

		// Perceba que o próprio Observer se registra na coleção de observers dentro do objetoObservado
		objetoObservador.subscribe();
		
		System.out.println();
		Observer objetoObservador2 = new SMSUsers(objetoObservado, "Jose Caliu [Transamerica]");
		objetoObservador2.subscribe();
		
		/**
		 * Criando o objeto que vai receber as informações do jogo em tempo real
		 */
		Commentary novoComentario = (Commentary) objetoObservado;
		
		/**
		 * Adicionando o primeira e segunda atualização do jogo.
		 * Andre Galvao e jose Caliu vão receber esses mensagens.
		 */
		novoComentario.setDesc("O juiz apita o inicio do jogo.");
		novoComentario.setDesc("Com 1 minuto o timao ja marca o primeiro. [ corinthians (1)  - aldax (0) ]");
		System.out.println();
		
		/**
		 * O objetoObservador2 está cancelando seu registro junto ao objetoObservado.
		 * A partir de agora, ele nao vai mais ser informado com as novas noticias.
		 */
		objetoObservador2.unSubscribe();
		System.out.println();

		// O usuário José Caliu não vai receber essas atualizações
		novoComentario.setDesc("termina o primerio tempo");
		novoComentario.setDesc("O atual campeao do Brasil ganha por 3 a 0");
		System.out.println();

		/**
		 * Criando um novo observer e registrando o mesmo.
		 */
		Observer objetoObservador3 = new SMSUsers(objetoObservado, "Craque Neto [Band]");
		objetoObservador3.subscribe();
		System.out.println();
		
		/**
		 * Agora o Andre Galvao continua sendo notificado das atualizações juntamento com o Craque Neto da Band.
		 */
		novoComentario.setDesc("Final da partida");
		novoComentario.setDesc("Corinthians confirma o favoritismo e vence o jogo por 8 a 0");
		
	}
	
}
