class Consultor extends Empleado implements Evaluable {
    private final double horas;

    public Consultor(String nombre, double salarioBase, double horas) {
        super(nombre, salarioBase);
        this.horas = horas;
    }
        public double calcularSalario() {
        return salarioBase*horas; // Asumiendo que el salario base es lo único en Desarrollador
    }

    public void evaluarDesempeno() {
        System.out.println("Evaluando desempeño del interno " + nombre + ".");
    }

    public String getDetalles() {
        return "Consultor: " + nombre + ", horas: " + horas + ", Salario: " + calcularSalario();
    }
}
