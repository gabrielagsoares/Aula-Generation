package InterfacePoliformismo;

public class horse implements interfaceAnimais2 {

	@Override
	public void nome() {
		System.out.println("Seu nome é Chico");
		
	}

	@Override
	public void emitirSons() {
		System.out.println("Chico relincha: iiiihhh iiihh");
		
	}

}
