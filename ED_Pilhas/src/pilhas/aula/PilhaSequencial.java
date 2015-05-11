package pilhas.aula;

public class PilhaSequencial {
	/**
	 *  - Um vetor de elementos
	 *  - Uma variavel para controlar o topo
	 */
	String elementos[] = new String[100];
	int topo = -1;
	
	boolean isVazia() {
		return (topo == -1);
	}
	
	boolean isCheia() {
		return (topo == elementos.length);
	}
	
	int quantidadeElementos() {
		return (topo + 1);
	}
	
	String elementoTopo() {
		if(isVazia())
			return null;
		else
			return elementos[topo];
	}
	
	//empilhar
	boolean push(String valor) {
		if(isCheia()) {
			return false;
		} else {
			topo++;
			elementos[topo] = valor;
			return true;
		}
	}
	
	//desempilhar
	String pop() {
		if(isVazia()) {
			return null;
		} else {
			String valor = elementos[topo];
			elementos[topo] = null;
			topo--;
			return valor;
		}
	}
	
	void exibir() {
		if(isVazia()) {
			System.out.println("A lista est‡ vazia");
		} else {
			for(int i = topo; i < topo + 1; i--) {
				System.out.println(elementos[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		PilhaSequencial pilha = new PilhaSequencial();
		pilha.push("Aluno 1");
		pilha.push("Aluno 2");
		pilha.push("Aluno 3");
		
		pilha.exibir();
	}
	
}
