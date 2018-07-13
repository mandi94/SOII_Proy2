import java.io.*;
import java.util.Date;

/**
 * 
 *
 * @version     1.0 Jun 2018
 * @author      Amanda Camacho, 
 *               Benjamin Amos <benjamin.oxi@gmail.com>
 */

//Maybe serializable
 public class Files{


     private String fileName;
     private byte[] content;
     private Date date;
     private String path;


    /**
    * Constructs a File object.
    * @param file path 
    */

    public Files(String path){
        File newFile = new File(path);
        try {
            byte[] bFile = new byte[(int) newFile.length()];
            BufferedInputStream into= new BufferedInputStream(new FileInputStream(newFile));
            into.read(bFile,0,bFile.length);
            into.close();
            this.content=bFile;


        } catch(Exception e) {
            System.out.println("Archivo no encontrado.");
        }

        this.path = path;
        this.fileName= newFile.getName();
       
    }

    /*###############################################################################*/
    /*                  GETERS              */


    /**
    *  Return a file name 
    * @throws  file name 
    */
    public String getFileName(){
        return this.fileName;
    }

    /**
    *  Return a file Path 
    * @throws  file path 
    */
    public String getFilePath(){
        return this.path;
    }

    /**
    *  Return a file date 
    * @throws  file date 
    */
    public Date getDate(){
        return this.date;
    }


    /**
    *  Return a file content 
    * @throws  file content 
    */
    public byte[] getcontent(){
        return this.content;
    }

    /**
    *  Return a file date 
    * @throws  file date 
    */
    public String fileToString(){
        try{
            if (this.content!= null){
                String str = new String(content, "UTF_8");
                return (str);
            }
        }catch (UnsupportedEncodingException uee){
             System.out.println("Archivo: "+ uee.getMessage());
        }
        return null;
    }

}