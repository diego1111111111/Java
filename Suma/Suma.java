import java.util.Scanner;
public class Suma{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Operacion operacion=new Operacion();
		System.out.println("\n\tIngresa el primer numero: ");
		int num1=scanner.nextInt();
		System.out.println("\n\tIngresa el segundo numero: ");
		int num2=scanner.nextInt();
		System.out.println("\n\tIngresa el tercer numero: ");
		int num3=scanner.nextInt();
		int resultado=operacion.sumar(num1,num2,num3);
		System.out.println("\n\tEl resultado de la suma es: "+resultado);
	}
}
