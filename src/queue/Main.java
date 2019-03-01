package queue;
public class Main {

    public static void main(String[] args) {

        Cola cola = new Cola(4);
        cola.print();
        cola.pull();
        cola.push("Primer elemento");
        cola.push("Segundo");
        cola.push("tercer elemento");
        cola.push("4º");
        cola.push("ultimoo");
        cola.print();
        cola.pull();
        cola.print();

    }
}
