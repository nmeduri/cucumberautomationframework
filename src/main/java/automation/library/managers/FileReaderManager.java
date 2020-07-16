package automation.library.managers;

import automation.library.dataProviders.APIDataReader;
import automation.library.dataProviders.ConfigFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static APIDataReader apiDataReader;
	
	private FileReaderManager() {
	}
	
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
	 
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
	 
	 public APIDataReader getAPIDataReader() {
		 return (apiDataReader == null) ? new APIDataReader() : apiDataReader;
	 }
	 
	 
}