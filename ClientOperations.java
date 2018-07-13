/**
 * 
 *  
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */


 /* Esta es la interfaz de rmi para las operaciones del cliente con el servidor de conexion, 
 todo me estoy guiando de el ejemplo de RMI de la profesora y con algunos ejemplos de 
 comunicacion de los sockets de internet
*/
public interface ClientOperations extends java.rmi.Remote {

    public boolean commit(Repo newRepo)
    throws java.rmi.RemoteException;

    public String fileList(String repoName) throws java.rmi.RemoteException;

    public Repo pullRepo(String repoName) throws java.rmi.RemoteException;

   // public Repo checkout(String repoName) throws java.rmi.RemoteException;


}