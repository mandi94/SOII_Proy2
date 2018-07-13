import java.nio.file.Paths;
import java.rmi.RemoteException;

/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */


 // Esta clase es la que utiliza todo la parte de rmi, de la interfaz de Client implements
public class ClientImp extends
            java.rmi.server.UnicastRemoteObject
        implements ClientOperations {   
    
    private Repo newRepo;
    private ServerOperations operatiosServerToServer;
    private int replicates;



    public ClientImp(ServerOperations newServerOperation) throws java.rmi.RemoteException{
        super();
        repoTemp= new Repo();
        this.operatiosServerToServer= newServerOperation;
    }

    /**
    * Commit Method 
    * @throws  Repo name 
    */
    

    /* El metodo commit que recibe un repositorio completo, implementamos como en git 
    que al actualizar se crea un nuevo repositorio y se actualiza la version de este 
    entonces cuando se hace commit enviamos un repositorio completo 
    */
    public boolean commit( Repo filesAndUpdates) throws RemoteException{

        List<Files> newFiles = filesAndUpdates.getFiles();
        String repoName= filesAndUpdates.getRepoName();
        byte[] buffer;

        if (filesAndUpdates!= null){
            File  newFile= new File(repoName);
            /*como es una operacion de cliente a servidor y esto se ejecuta en el servidor 
            */

        }
    }


    public Repo pullRepo( String repoName) throws RemoteException{
        //Falta implementar esto en el operaciones de servidor a servidor 
        return this.operatiosServerToServer.findRepo( repoName);

    }

    public String fileList(String repoName) throws RemoteException{
        // buscar como obtener un path en java
        Path path= Paths.get(repoName);
        String filesList = "";
        // verifico si el archivo exite o si lo encontro 
        if (Files.exist(path)){

            //tengo que leer el repo y agregar todos los nombres de los archivos a un string


        }else {
            // En el print \u001B[31m lo que hace es poner ese string en color rojo
            System.out.println("\u001B[31m"+repoName+"\u001B[31m no existe.");
            System.out.print("\u001B[0m"); // para volver al color original del terminal 
            return null;
        }


    }


}
