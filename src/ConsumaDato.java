public class ConsumaDato extends Thread
{
    Semaforo vuoto;
    Semaforo pieno;
    int dato;

    public ConsumaDato(Semaforo s1, Semaforo s2)
    {
        pieno = s1;
        vuoto = s2;
    }

    public void run()
    {
        while(true)
        {
            pieno.P();
            dato = Prod.buffer;

            System.out.println("dato letto: "+ dato);
            vuoto.V();
        }
        
    }

    
}
