class Estudiante implements Persona{
        private String nombre;
        private int edad;
        private String carrera;
        public  Estudiante(String nombre, int edad, String carrera){
                this.nombre=nombre;
                this.edad=edad;
                this.carrera=carrera;
        }
	@Override
	public void presentarse(){
		System.out.println("\n\tHola soy "+nombre+" tengo "+edad+"a años y estudio "+carrera+ ".");
	}
	@Override
	public int obtenerEdad(){
		return edad;
	}
}
