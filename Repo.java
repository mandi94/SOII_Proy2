import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Date;

/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */

  

 public class Repo{

    private String repoName;        /* Repo  name its the the unique identifierfor repository */
    private List <Files> documents;       /* Collection of documents */
    private Date dateCreated;       /* Date asociate to repo*/
    private int version;            
    private String user;            /* Maybe necesary, the administrator name*/
    private Date lastModify;

    /* Maybe necesary use a stack of versions, diferents states the repository*/
    //private Deque<Integer> versionHistory;

    /**
	 * Constructs a Repository object.
	 * @param repoName 
	 */

    public Repo (String repoName){
        if(repoName==null) throw new IllegalArgumentException();

        this.repoName = repoName;
        this.documents= new ArrayList<Files>();
        this.dateCreated = new Date();
        this.lastModify = new Date();
        this.version=0;
    }



    /**
	 *  Return a especific file  in the repo
     * @param fileName the name of the file that we want
	 * @throws  list of Files
	 */
    public Files getFile(String fileName){
        if ( fileName == null) throw new IllegalArgumentException();

        for (Files f : this.documents) {
			if (f.getFileName().equals(fileName)) {
				return f;
			}
		}
        return null;
    }



    /**
	 *  Return true if the new file was add to repo 
     * @param file the file thar we want to add 
	 * @throws  booelan with the result
	 */
    public boolean  addFile(Files file){
        if ( file == null) throw new IllegalArgumentException("Indique un nombre valido");

        for (Files f : this.documents) {
			if (f.getFileName().equals(file.getFileName())) {
				this.documents.remove(f);
                this.documents.add(file);
                this.version+=1;
                this.lastModify= new Date();
                return true;
			}
		}
        this.documents.add(file);
        this.version +=1;
        return true;      
    }


    // IDK if necesary but 
    /**
    *  Return true if the file was remove to repo 
    * @param file the file thar we want to remove 
    * @throws  booelan with the result
    */
    public boolean  deleteFile(Files file){
        if ( file == null) throw new IllegalArgumentException();

        for (Files f : this.documents) {
			if (f.getFileName().equals(file.getFileName())) {
				documents.remove(f);
                this.lastModify= new Date();
                return true;
			}
		}
        
        return false;      
    }



    /*#####################################################################*/
    /*              GETERS          */


    /**
	 *  Return a list of files in the repo
	 * @throws  list of Files
	 */
    public List<Files> getFiles(){
        return this.documents;
    }

    /**
	 *  Return repo version
	 * @throws  number  of version
	 */

     public int getVersion(){
         return this.version;
     }


    /**
	 *  Return repo name
	 * @throws name of Repo
	 */

     public String getRepoName(){
         return this.repoName;
     }


    /**
	 *  Return repo name
	 * @throws name of Repo
	 */

     public Date getRepoDate(){
         return this.dateCreated;
     }

  

 }

