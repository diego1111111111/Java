class Interno extends Empleado implements Evaluable {
    private final double bono;

    public Interno(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
        public double calcularSalario() {
        return salarioBase; // Asumiendo que el salario base es lo único en Desarrollador
    }

    public void evaluarDesempeno() {
        System.out.println("Evaluando desempeño del interno " + nombre + ".");
    }

    public String getDetalles() {
        return "Interno: " + nombre + ", bono: " + bono + ", Salario: " + calcularSalario();
    }
}
