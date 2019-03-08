package queue;

public class Cola implements supercola {

    private Object[] cola;
    private int inicio;
    private int fin;

    public Cola (int longitud){

        cola = new Object[longitud];
        inicio = fin = -1;
    }
public boolean isEmpty(){
        return inicio == fin;

}
public boolean isFull(){
        return fin == cola.length-1;
}

public void push(Object elemento) throws errores{

    if (isFull())
        throw new errores();

    else {
        cola[++fin] = elemento;
    }



    }

public Object pull() {
        if (isEmpty()){

            System.out.println("La cola esta vacia pon cosas");
            return "Cola vacia"; //esto hay que ponerlo porque returnamos un objeto, hay que returnar siempre algo
        }
        else
            return cola[++inicio];
}
public void print(){
        if (isEmpty())
            System.out.println("La cola está vacia");
        else
            for (int i = 0; i <= fin; i++){
                System.out.println(cola[i]);
            }
            
}
    public static void main(String[] args) {

        System.out.println("blabla");
    }
}
