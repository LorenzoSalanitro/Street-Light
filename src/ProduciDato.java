public class ProduciDato extends Thread
{
   Semaforo vuoto;
   Semaforo pieno;
   int tanti = 5;
   final int attesa = 500;
   
   public ProduciDato(Semaforo s, Semaforo p)
   {
       vuoto = s;
       pieno = p;
   }

   public void run()
   {
       for(int i = 0; i < tanti; i++)
       {
           vuoto.P();
           Prod.buffer = i;

           System.out.println("dato scritto: " + i);

           pieno.V();
           try
           {
               Thread.sleep(attesa);
           }
           catch(Exception e)
           {

           }
       }

       System.out.println("termine scrittura dati");
   }
}
