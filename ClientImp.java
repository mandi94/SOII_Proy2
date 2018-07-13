/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */

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

    public boolean commit( Repo filesAndUpdates) throws java.rmi.RemoteException{

        List<Files> newFiles = filesAndUpdates.getFiles();
        String repoName= filesAndUpdates.getRepoName();
        byte[] buffer;


    }


}
