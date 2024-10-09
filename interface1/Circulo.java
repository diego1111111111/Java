public class Circulo implements Figura{
	private double radio;
	public Circulo(double radio){
		this.radio=radio;
	}
	public void setRadio(double radio){
		this.radio=radio;
	}
	public double getRadio(){
		return radio;
	}

	@Override
	public double Perimetro(){
		return 2*Math.PI*radio;
	}
	@Override
	public double Area(){
		return Math.PI*radio*radio;
	}
}
