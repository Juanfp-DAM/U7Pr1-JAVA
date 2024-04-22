public class Profesor extends Persona{

    private String str;
    private int edad;
    //private String numeroDeTelefono; //No es necesario ya se pasará del padre
    private List <Prestamo> prestamos; //Habría de crear una clase Prestamo

    public Profesor(String numeroDeTelefono, String str, int edad, List<Prestamo> prestamos) {
        super(numeroDeTelefono);
        this.str = str;
        this.edad = edad;
        //this.numeroDeTelefono = numeroDeTelefono1; No es necesario, ya lo obtenemos de la clase Padre
        this.prestamos = prestamos;
    }






}
