package queue;
public class Main {

    public static void main(String[] args) {

        Cola cola = new Cola(4);
        cola.print();
        cola.pull();
        cola.push("Haberlas");
        cola.push("tractor");
        cola.push("23");
        cola.push("22");
        cola.push("11");
        cola.print();
    }
}
