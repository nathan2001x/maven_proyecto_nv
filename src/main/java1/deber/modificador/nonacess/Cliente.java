package deber.modificador.nonacess;

// 1 Final class no se puede heredar de una clase final 
public class Cliente extends BaseDeDatos {

	// 2 no se puede sobrescribir en metodos final
	public void registrarEnBaseDeDatos() {
		System.out.println("Cliente registrado");
		// 3 atributos final no se les puede volver a reasignar
		nombre = "Jose";

	}

}
