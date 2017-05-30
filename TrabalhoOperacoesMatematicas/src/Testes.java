
public class Testes {
	static float num1 = 10;
	static float num2 = 2;
	public static void main(String[] args) {
		//Teste Soma
		Operacoes adicao = new Operacoes ();
		System.out.println(adicao.soma(num1, num2));	
		
		//Teste Subtração
		Operacoes sub = new Operacoes ();
		System.out.println(sub.subtracao(10, 5));
		
		//Teste Resto
		Operacoes rest = new Operacoes ();
		System.out.println(rest.resto(10, 3));

	}

}
