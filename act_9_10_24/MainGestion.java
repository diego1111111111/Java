public class MainGestion {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fanny", 80000.0, 15000.0);
        Desarrollador desarrollador = new Desarrollador("Alejandro", 60000.00, "Java");
        Interno interno=new Interno("Alan", 3500.00,500.00);
        Consultor consultor=new Consultor("Cris",20000.00,45.2);

        gerente.evaluarDesempeno();
        System.out.println(gerente.getDetalles());

        desarrollador.evaluarDesempeno();
        System.out.println(desarrollador.getDetalles());
        interno.evaluarDesempeno();
        System.out.println(interno.getDetalles());
        consultor.evaluarDesempeno();
        System.out.println(consultor.getDetalles());
        
    }
}
