public class Operacoes {
	
	float soma(float num1,float num2){
		return num1 + num2;
	}
	float subtracao(float num1, float num2){
		num2= -num2;
		return num1 + num2;
	}
	/*float multiplicacao( float num1, float num2){
		
	}*/
	float resto(float num1, float num2){
		float num3 = -num2;
		while (num3 <= num1){
			num3 =+ num2;
		}
		num3 = -num3;
		return num1 + num3;
	}

}
