import java.util.ArrayList;
import java.util.List;

public class Antenas {
	
	private Integer[] puntosKm; //Puntos kilometricos de las urbanizaciones ordenados crecientemente.
	private int cobertura;
		
	public Antenas(Integer[] urbanizaciones, int c) {
		puntosKm = urbanizaciones;
		cobertura=c;
		
	}
	//para todo i € (1,n) : Existe j € (1,k) : |pi-sj|<=C sentencia while
	public List<Integer> situarAntenas(){
		List<Integer> lista = new ArrayList<>();
		int antena = -1;
		for (int i = 0; i <= puntosKm.length - 1; i++) {
			if(antena < puntosKm[i]){
				antena = puntosKm[i] + cobertura;lista.add(antena);
				antena += cobertura;
			}
		}
		return lista;
	}
	
	
}
