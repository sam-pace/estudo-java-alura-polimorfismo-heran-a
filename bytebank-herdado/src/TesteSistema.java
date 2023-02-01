
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		Admin adm = new Admin();
		adm.setSenha(222);
		Autenticavel cliente = new Cliente();
		cliente.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
		
	}

}
