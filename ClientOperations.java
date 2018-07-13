/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */


public interface ClientOperations extends java.rmi.Remote {

    public boolean commit(Repo newRepo)
    throws java.rmi.RemoteException;

    public String fileList(String repoName) throws java.rmi.RemoteException;

    public Repo update(String repoName) throws java.rmi.RemoteException;

    public Repo checkout(String repoName) throws java.rmi.RemoteException;


}