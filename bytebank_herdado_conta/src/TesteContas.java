
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(112,112);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp); 
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
