package automation.library.dataProviders;

import java.util.Properties;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

public class APIDataReader {
	
	
	private Properties properties;

	public APIDataReader(){
        
       
   }
	
	public String getProductInformationAPI() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_Info");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}

	public String getCatalogAPI() {

		String catalogInfo = Property.getProperty(Constant.API_DATA, "catalog");
		if (catalogInfo != null)
			return catalogInfo;
		else
			throw new RuntimeException("Catalog not specified in the API Data file.");
	}
	
	public String getCatalogVersionAPI() {

		String catalogVersionInfo = Property.getProperty(Constant.API_DATA, "catalog_Version");
		if (catalogVersionInfo != null)
			return catalogVersionInfo;
		else
			throw new RuntimeException("Catalog version not specified in the API Data file.");
	}
	
	public String getCatalogsListAPI() {

		String catalogsListInfo = Property.getProperty(Constant.API_DATA, "catalogs_List");
		if (catalogsListInfo != null)
			return catalogsListInfo;
		else
			throw new RuntimeException("Catalogs List not specified in the API Data file.");
	}
	
	public String getBaseBVT() {

		String baseBVTInfo = Property.getProperty(Constant.API_DATA, "base_BVT");
		if (baseBVTInfo != null)
			return baseBVTInfo;
		else
			throw new RuntimeException("Catalogs List not specified in the API Data file.");
	}
	
	public String get_product_tc_1415() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1415");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1349() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1349");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1416() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1416");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1350() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1350");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1328() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1328");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1330() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1330");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1326() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1326");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1411() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1411");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1414() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1414");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1410() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1410");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}

	public String get_product_tc_1413() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1413");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_Code() {

		String getProduct = Property.getProperty(Constant.API_DATA, "produtCode");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1335() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1335");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1331() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1331");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1366() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1366");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1336() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1336");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1364() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1364");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1613() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1613");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1614() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1614");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1715() {
		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1715");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1717() {
		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1717");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1710() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1710");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1709() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1709");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String get_product_tc_1711() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1711");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	public String getAuthorizationUrl() {
		String url = Property.getProperty(Constant.API_DATA, "authorizationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
	}
	
	public String getProductInfoAuthorizationUser() {
		String url = Property.getProperty(Constant.API_DATA, "productInfoAuthorization");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
	}
	
	public String getProductInfoInvalidAuthorizationUser() {
		String url = Property.getProperty(Constant.API_DATA, "productInfoInvalidAuthorization");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
		
	}
	
	public String getInvalidToken() {
		String token = Property.getProperty(Constant.API_DATA, "invalidToken");
		if (token != null)
			return token;
		else
			throw new RuntimeException("token not specified in the apiData.properties file.");
	}

}
