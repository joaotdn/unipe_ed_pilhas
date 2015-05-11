package pilhas.aula;

public class PilhaEncadeada {
	Elemento topo;
	int n = 0;
	
	boolean isVazia() {
		return (topo == null);
	}
	
	void push(String dado) {
		Elemento novo = new Elemento();
		novo.dado = dado;
		novo.prox = topo;
		topo = novo;
		n++;
	}
	
	String pop() {
		if(isVazia())
			return null;
		String aux = topo.dado;
		topo = topo.prox;
		n--;
		return aux;
	}
	
	String getTopo() {
		if(isVazia())
			return null;
		return topo.dado;
	}
	
	void exibir() {
		if(isVazia()) {
			System.out.println("Pilha vazia");
		} else {
			Elemento aux = topo;
			int i = 0;
			while(i < n && aux != null) {
				System.out.println(aux.dado);
				aux = aux.prox;
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		PilhaEncadeada pilha = new PilhaEncadeada();
		pilha.push("Aluno 1");
		pilha.push("Aluno 2");
		pilha.push("Aluno 3");
		pilha.push("Aluno 4");
		
		pilha.exibir();
	}
	
}
