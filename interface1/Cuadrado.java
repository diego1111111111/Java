public class Cuadrado implements Figura{
        private double lado;
        public Cuadrado(double lado){
                this.lado=lado;
        }
        public void setLado(double lado){
                this.lado=lado;
        }
        public double getLado(){
                return lado;
        }

        @Override
        public double Perimetro(){
                return 4*lado;
        }
	@Override
	public double Area(){
                return lado*lado;
        }
}
