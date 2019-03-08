package queue;

public class errores extends RuntimeException {

    public errores(){
        this("Está ");

    }
    public errores (String str){
        super(str+ " llena");
    }
}
