import java.util.HashSet;
import java.util.Set;

public class Cobertura {
	private Grafo grafo;
	public Cobertura(Grafo g) {
		grafo = g;
	}
	public Set<Integer> getConjuntoCobertura() {
		Set<Integer> cobertura = new HashSet<>();
		Grafo copiaGrafo = new Grafo(grafo);
		while (copiaGrafo.numAristas() > 0) {
			int nodoMaxGrado = -1;
			int maxGrado = -1;
			for (int nodo : copiaGrafo.nodosConectados()) {
				int grado = copiaGrafo.grado(nodo);
				if (grado > maxGrado) {
					maxGrado = grado;
					nodoMaxGrado = nodo;
				}
			}
			cobertura.add(nodoMaxGrado);
			for (int sucesor : copiaGrafo.sucesores(nodoMaxGrado)) {
				copiaGrafo.removeArista(nodoMaxGrado, sucesor);
			}
		}
		return cobertura;
	}
}