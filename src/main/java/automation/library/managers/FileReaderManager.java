package automation.library.managers;

import automation.library.dataProviders.AEMDataReader;
import automation.library.dataProviders.APIDataReader;
import automation.library.dataProviders.ConfigFileReader;
import automation.library.dataProviders.DataReader;
/**
 * Class to get Instance of Reader File (Configuration File, API Data File, Data Reader File)
 */
public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static APIDataReader apiDataReader;
	private static DataReader dataReader;
	private static AEMDataReader aemDataReader;
	
	private FileReaderManager() {
	}
	
	/** Returns Instance of File Read Manager */
	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }
	 
	 /** Returns Instance of Configure Reader File */
	 public ConfigFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	 }
	 
	 /** Returns Instance of API Data Reader File */
	 public APIDataReader getAPIDataReader() {
		 return (apiDataReader == null) ? new APIDataReader() : apiDataReader;
	 }
	 
	 /** Returns Instance of Data Reader File */
	 public DataReader getDataReader() {
		 return (dataReader == null) ? new DataReader() : dataReader;
	 }
	 
	 /** Returns Instance of AEM Data Reader File */
	 public AEMDataReader getAEMDataReader() {
		 return (aemDataReader == null) ? new AEMDataReader() : aemDataReader;
	 }
	 
	 
}