import BD.ConectarBD;

public class Main {

	public static void main(String[] args) {
		ConectarBD BD1 = new ConectarBD();
		
		if(BD1.Conectar() == 1) {
			System.out.println("conectou");
		}else {
			System.out.println("aprende seu merda");
		}

	}

}
