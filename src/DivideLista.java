
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class DivideLista {
	
	/**
	 * 
	 * @param datos lista de entrada
	 * @param k     longitud de una de las listas solución
	 * @param a   lista solución 1 (salida)
	 * @param b   lista solución 2 (salida)
	 * @return  la diferencia entre las dos listas
	 * 
	 */

	public static int resolverVoraz(int []datos, int k, List<Integer> a, List<Integer> b) {

		//******Completar la implementación*******
		Arrays.sort(datos);
		k = k > datos.length/2? k-datos.length : k;
		for(int i = 0;i<datos.length;i++){
			if(i<k){
				a.add(datos[i]);
			}else{
				b.add(datos[i]);
			}

		}

		return Math.abs(sumaLista(a)-sumaLista(b));
	}

	public static int sumaLista(List<Integer> array){
		int suma = 0;
		for(int i = 0;i<array.size();i++){
			suma+=array.get(i);
		}
		return suma;
	}
	public static void main(String []args){
		int [] datos = {1,2,44,4,5,12};
		System.out.println(resolverVoraz(datos,4,new ArrayList<Integer>(),new ArrayList<Integer>()));
	}
}
