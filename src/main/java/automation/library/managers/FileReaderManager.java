package automation.library.managers;

import automation.library.dataProviders.APIDataReader;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static APIDataReader apiDataReader;
	private static DataReader dataReader;
	
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
	 
	 public DataReader getDataReader() {
		 return (dataReader == null) ? new DataReader() : dataReader;
	 }
	 
	 
}