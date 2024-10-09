class Estudiante extends Persona{
                private String carrera;
                public Estudiante(String nombre, int edad, String carrera){
                        super(nombre,edad);
                        this.carrera=carrera;
                }
                @Override
                public void presentarse(){
                        System.out.println("\n\tSoy "+nombre+" tengo "+edad+" años y estudio "+carrera+".");
                }
        } 
