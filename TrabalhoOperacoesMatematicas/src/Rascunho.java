//Obsoleto
import java.util.Scanner;
public class Rascunho {
	public static void main(String[] args) {
		int opcao;
		float num1;
		float num2;
		float resultado = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Programa: Operações Matemáticas");
		System.out.println("Opções:");
		System.out.println("0 - Sair");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Potenciação");
		System.out.print("ESCOLHA UMA OPÇÃO: ");
		opcao = input.nextInt();
		
		if (opcao == 1){ // +
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextFloat();
			System.out.print("Agora, digite o segundo número: ");
			num2 = input.nextFloat();
			resultado = num1 + num2;
			System.out.println(resultado);
		}
		if (opcao == 2){ // - 
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextFloat();
			System.out.print("Agora, digite o segundo número: ");
			num2 = input.nextFloat();
			float num3 = -num2;
			resultado = num1 + num3;
			System.out.println(resultado);
		}
		if (opcao == 3){ // * 
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextFloat();
			System.out.print("Agora, digite o segundo número: ");
			num2 = input.nextFloat();
			resultado = num1;
			while (num2 > 0){
				resultado = num1 + num1;
				num2 = num2;	
			}
			System.out.println(resultado);
		}
		if (opcao == 4){ // "/"	
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextFloat();
			System.out.print("Agora, digite o segundo número: ");
			num2 = input.nextFloat();
			float num3 = -num2;
			while (num1 > 0){
				num1 = num1 + num3;
				resultado = resultado + 1;
			}
			System.out.println(resultado);
		}
		if (opcao == 5){ // Potencia
			System.out.print("Digite o primeiro número: ");
			num1 = input.nextFloat();
			System.out.print("Agora, digite o segundo número: ");
			num2 = input.nextFloat();
			float subT = 0;
			float cont1 = -num2 + 1;
			while (cont1 < 0){
				float num3 = -num1;
				while (num3 < 0){
					subT = subT + num1;
					num3 = num3 + 1;
					System.out.println(subT);
				}
				//float sub2 = subT
				//resultado = sub2 * subT;
				//cont1 = cont1 + 1;
			}
			System.out.println(resultado);
		}
	}

}
