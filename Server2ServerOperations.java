import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */




 // Creo que debe ser un hilo para que pueda estar siempre activo escuchando 

public class Server2ServerOperations extends Thread{

    private InetAddress  ipMulticast;
    private MulticastSocket socketMulticast;
    private int port;
    private int replicationNumber;
    private int serverNumber=0; // Todavia no se si lo usaremos estatico o dinamico la cantidad de servidores 
                                // no he pensado la k-tolerancia a fallas y cuales soportaremos(las bizantinas
                                // son las que tenemos que ver si se puede ), entonces pongo esta 
                                // por siacaso lo hacemos dinamico

    //No se que mas se puede necesitar 

    public Server2ServerOperations(int port, String ipMulticast,int replicationNumber, int serverNumber){
        try{    
            // esto debera funcionar
            this.port =port;
            this.replicationNumber= replicationNumber;
            this.ipMulticast=InetAddress.getByName(ipMulticast);
            this.serverNumber=serverNumber;

            this.socketMulticast= new MulticastSocket(port);
            socketMulticast.joinGroup(this.ipMulticast);

        }catch(Exception e){
            System.out.println();
            System.out.println("java.lang.Exception");
            System.out.println(e);

        }
    }


    // Esta funcion debe replicar un repo en todos los servidores de respaldo 
    public boolean replicateServers(Repo repoToDuplicate){


        return true;
    }

    // este es como el clone    
    public Repo getRepo(Strin repoName){

    }

    


    public void run(){
        System.out.println(" iniciando el hilo de las operaciones de servidor y servidor ");
    }


}