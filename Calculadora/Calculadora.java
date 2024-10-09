import java.util.Scanner;
public class Calculadora{
        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                boolean cerrar=false;
                while(cerrar==false){
                        System.out.println(">>Calculadora\n\n\t1)Suma\n\t2)Resta\n\t3)Multiplicacion\n\t4)Division\n\n\t0)Cerrar\n\n¬¬");
                int op=scanner.nextInt();
		if(op!=0){
                           System.out.println("\n\tIngrese el primer valor: ");
                double v1=scanner.nextDouble();
                System.out.println("\n\tIngrese el segundo valor: ");
                double v2=scanner.nextDouble();
                Operacion operacion=new Operacion(v1,v2);
                switch (op){
                        case 1:
                                System.out.println("\n\tEl resultado es: "+operacion.suma(v1,v2));
                        break;
                        case 2:
                                System.out.println("\n\tEl resultado es: "+operacion.resta(v1,v2));
                        break;
                        case 3: 
                                System.out.println("\n\tEl resultado es: "+operacion.multiplicacion(v1,v2));
                        break;
                        case 4:
                                System.out.println("\n\tEl resultado es: "+operacion.division(v1,v2));
                        break;
                }
                }else{
                        cerrar=true;
                }
                }
        }
}
