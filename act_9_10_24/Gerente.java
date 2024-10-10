class Gerente extends Empleado implements Evaluable {
    private final double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
	public double calcularSalario() {
        return salarioBase + bono;
    }

    public void evaluarDesempeno() {
        System.out.println("Evaluando desempeño del gerente " + nombre + ".");
    }

    public String getDetalles() {
        return "Gerente: " + nombre + ", Salario total: " + calcularSalario();
    }
}
