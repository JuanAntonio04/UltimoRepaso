package Clases;

/**
 * Esta clase se ha creado con el fin de realizar cuentas matematicas.
 * 
 * @author Juan Antonio
 * 
 * @since 24/02/2023
 * 
 * @version 1.0
 * 
 * @see <a href="https://www.youtube.com/">Información</a>
 *
 */
public class CuentasMatematicas {

	/**
	 * Atributos del Constructor
	 */
	private int numeroPrincipal, numeroSecundario;
	
	/**
	 * Constructor
	 * 
	 * @param numero1 : Un numero entero.
	 * @param numero2 : Otro numero entero.
	 * 
	 */
	public CuentasMatematicas(int numero1, int numero2) {
		
		this.numeroPrincipal=numero1;
		this.numeroSecundario=numero2;
		
	}
	
	/**
	 * Este metodo devuelve la suma de dos numeros enteros.
	 * 
	 * @param numero1 : Un numero entero.
	 * 
	 * @param numero2 : Un numero entero.
	 * 
	 * @return : La suma de los dos numeros enteros.
	 */
	public static int sumaNumerosEnteros(int numero1, int numero2) {
		
		return numero1 + numero2;
		
	}
	
	/**
	 * Este metodo devuelve la resta de dos numeros enteros.
	 * 
	 * @param numero1 : Un numero entero.
	 * 
	 * @param numero2 : Un numero entero.
	 * 
	 * @return : La resta de los dos numeros enteros.
	 */
	public static int restaNumerosEnteros(int numero1, int numero2) {
		
		return numero1 - numero2;
		
	}
	
	public int multiplicacionNumerosEnteros() {
		
		return this.numeroPrincipal * this.numeroSecundario;
		
	}
	
}
