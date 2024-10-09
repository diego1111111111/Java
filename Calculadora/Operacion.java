public class Operacion{
        private double num1;
        private double num2;
        public Operacion(double num1, double num2){
                this.num1=num1;
                this.num2=num2;
        }
        public double suma(double num1,double num2){
		return num1+num2;
	}
	public double resta(double num1, double num2){
		return num1-num2;
	}
	public double multiplicacion(double num1,double num2){
		return num1*num2;
	}
	public double division(double num1,double num2){
		return num1/num2;
	}
}
