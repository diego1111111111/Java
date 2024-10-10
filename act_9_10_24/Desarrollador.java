class Desarrollador extends Empleado implements Evaluable {
    private final String lenguajeProgramacion;

    public Desarrollador(String nombre, double salarioBase, String lenguajeProgramacion) {
        super(nombre, salarioBase);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
	public double calcularSalario() {
        return salarioBase; // Asumiendo que el salario base es lo único en Desarrollador
    }

    public void evaluarDesempeno() {
        System.out.println("Evaluando desempeño del desarrollador " + nombre + " en " + lenguajeProgramacion + ".");
    }

    public String getDetalles() {
        return "Desarrollador: " + nombre + ", Lenguaje: " + lenguajeProgramacion + ", Salario: " + calcularSalario();
    }
}
