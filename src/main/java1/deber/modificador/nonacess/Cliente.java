package deber.modificador.nonacess;

// 1 Final class no se puede heredar de una clase final 
public class Cliente extends BaseDeDatos {

	
	public void registrarCliente() {
		// 3 atributos final no se les puede volver a reasignar
		nombre = "Jose";

	}

}
