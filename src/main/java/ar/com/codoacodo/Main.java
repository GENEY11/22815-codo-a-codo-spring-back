package ar.com.codoacodo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		
		Auto miPrimerAuto = new Auto();
		
		miPrimerAuto.mostrarInfo();
		//ejecuto metodo encender()
		miPrimerAuto.encender();
		
		miPrimerAuto.mostrarInfo();
	}

}
