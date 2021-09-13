package deber.modificador.nonacess;

public  final class BaseDeDatos extends Sistema{

	public final String nombre = "Nathan";

	
	// 2 No se puede reescribir metodos final
	public void registrarEnBaseDeDatos() {
		System.out.println("Cliente registrado");


}
