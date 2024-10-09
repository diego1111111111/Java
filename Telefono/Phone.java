class Phone{
        private int numero=252323;
        private String portador="Diego";
        public Phone(int numero, String portador){
                this.numero=numero;
                this.portador=portador;
        }
        public void llamar(int num2){
                System.out.println("\n\t"+ this.portador+" llamando a "+num2);
                System.out.println("\n\t"+this.numero+" llamando a"+num2);
        }
        public void msjRecibido(){
                System.out.println("\n\t¡Has recibido un mensaje!");
	}
}
