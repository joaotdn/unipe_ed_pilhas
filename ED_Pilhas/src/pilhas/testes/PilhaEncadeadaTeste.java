package pilhas.testes;

public class PilhaEncadeadaTeste {
	ElementoTeste topo;
	int cont = 0;
	
	boolean isVazia() {
		return (topo == null);
	}
	
	String getTopo() {
		if(isVazia())
			return null;
		else
			return topo.dado;
	}
	
	String pop() {
		if(isVazia()) return null;
		
		String n = topo.dado;
		topo = topo.prox;
		cont--;
		return n;
	}
	
	boolean push(String valor) {
		if(valor == null)
			return false;
		
		ElementoTeste novo = new ElementoTeste();
		novo.dado = valor;
		novo.prox = topo;
		topo = novo;
		cont++;
		return true;
	}
	
	void exibir() {
		if(isVazia()) {
			System.out.println("Pilha vazia");
		} else {
			ElementoTeste aux = topo;
			while(aux != null) {
				System.out.println(aux.dado);
				aux = aux.prox;
			}
		}
	}
	
	public static void main(String[] args) {
		PilhaEncadeadaTeste pilha = new PilhaEncadeadaTeste();
		pilha.push("Aluno 1");
		pilha.push("Aluno 2");
		pilha.push("Aluno 3");
		pilha.push("Aluno 4");
		
		pilha.exibir();
	}
}
