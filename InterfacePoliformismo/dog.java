package InterfacePoliformismo;

public class dog implements interfaceAnimais2 {

	@Override
	public void nome() {
		System.out.println("Seu nome é Teodora");
		
	}

	@Override
	public void emitirSons() {
		System.out.println("Som que o animal late: auauauau ");
		
	}

}
