public class Prod {
    protected static int buffer;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto);

        prod.start();
        cons.start();

        System.out.println("Main: termine Thread");
    }
}
