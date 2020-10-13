package automation.library.common;
import java.io.*;

/*
 * This class contains the File's extension function
 * 
 * @author Shashank Bansal
 * @date 30/06/2020
 */

public class ExtensionFilter implements FilenameFilter {
  private String extension;
  public ExtensionFilter( String extension ) {
    this.extension = extension;             
  }
  
  public boolean accept(File dir, String name) {
    return (name.endsWith(extension));
  }
}