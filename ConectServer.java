/**
 * 
 *
 * @version     1.0 May 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */

 public class ConectServer extends DuplicatesServers{

    
    private int port;
    private int clientPort=5600;
    private InetAddress ipMulticas;
    private String serverName;  
         
    public ConectServer(int controlPort , int servicePort, int replicationNumber,
        Server2ServerOperations serverToServerOP,String multicasDirectt){
        try {
            this.port = servicePort;
            ClientOperations newClientOperation =
                            new ClientImp(serverToServerOP);
    


            Naming.rebind("rmi://localhost:"+servicePort+"/CalculatorService", newClientOperation);

        } catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        
        if (args.length <5) {
            
            // Error 
            System.exit(1);
        }else{
            int controlPort= Integer.parseInt(args[0]);
            int servicePort= Integer.parseInt(args[1]);
            int replicationNumber= Integer.parseInt(args[2]);
            try {        
                // Crea un Registry en el puerto especificado
                LocateRegistry.createRegistry(servicePort);	    
            }
            catch (RemoteException re) {
                System.out.println();
                System.out.println("RemoteException");
                System.out.println(re);
            }
            catch (Exception e) {
                System.out.println();
                System.out.println("java.lang.Exception");
                System.out.println(e);
            }

            Server2ServerOperations serverToServerOperations= 
                new Server2ServerOperations(controlPort,"multicast",replicationNumber);

            
            
        }
    }

    




 }