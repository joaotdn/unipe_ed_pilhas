package pilhas.testes;

public class PilhaSquencialTeste {
	String vetor[] = new String[100];
	int topo = -1;
	
	boolean isVazia() {
		return (topo == -1);
	}
	
	boolean isCheia() {
		return (topo == vetor.length);
	}
	
	String elementoTopo() {
		if(isVazia()) return null;
		return vetor[topo];
	}
	
	boolean push(String valor) {
		if(isCheia()) return false;
		topo++;
		vetor[topo] = valor;
		return true;
	}
	
	String pop() {
		if(isVazia()) return null;
		
		String old = vetor[topo];
		vetor[topo] = null;
		topo--;
		return old;
	}
	
	void exibir() {
		if(isVazia()) {
			System.out.println("Pilha vazia");
		} else {
			int i = (topo > 0) ? topo : 0;
			while(vetor[i] != null) {
				System.out.println(vetor[i]);
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		PilhaSquencialTeste pilha = new PilhaSquencialTeste();
		pilha.push("Aluno 1");
		pilha.push("Aluno 2");
		pilha.push("Aluno 3");
		pilha.push("Aluno 4");
		
		pilha.pop();
		pilha.exibir();
	}
}
