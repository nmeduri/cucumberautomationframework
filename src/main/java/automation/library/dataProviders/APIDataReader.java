package automation.library.dataProviders;

import java.util.Properties;

import javax.management.RuntimeErrorException;

import automation.library.common.Property;
import automation.library.cucumber.Constant;

/**
 * get api data from properties file
 * 
 */
public class APIDataReader {
	
	
	private Properties properties;

	public APIDataReader(){
        
       
   }
	
	/**
	 * gets Product Information API
	 * 
	 */
	
	public String getProductInformationAPI() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_Info");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	
	/**
	 * gets Password
	 * 
	 */

	public String getAuthenticatedUserPassword() {

		String authenticatedUserPassword = Property.getProperty(Constant.API_DATA, "authenticatedUserPassword");
		if (authenticatedUserPassword != null)
			return authenticatedUserPassword;
		else
			throw new RuntimeException("Password Data not specified in the API Data file.");
	}
	/**
	 * gets Catalog API
	 * 
	 */

	public String getCatalogAPI() {

		String catalogInfo = Property.getProperty(Constant.API_DATA, "catalog");
		if (catalogInfo != null)
			return catalogInfo;
		else
			throw new RuntimeException("Catalog not specified in the API Data file.");
	}
	
	/**
	 * gets Catalog Version API
	 * 
	 */
	
	public String getCatalogVersionAPI() {

		String catalogVersionInfo = Property.getProperty(Constant.API_DATA, "catalog_Version");
		if (catalogVersionInfo != null)
			return catalogVersionInfo;
		else
			throw new RuntimeException("Catalog version not specified in the API Data file.");
	}
	
	/**
	 * gets Catalogs List API
	 * 
	 */
	
	public String getCatalogsListAPI() {

		String catalogsListInfo = Property.getProperty(Constant.API_DATA, "catalogs_List");
		if (catalogsListInfo != null)
			return catalogsListInfo;
		else
			throw new RuntimeException("Catalogs List not specified in the API Data file.");
	}
	
	/**
	 * gets base url of bvt
	 * 
	 */
	
	public String getBaseBVT() {

		String baseBVTInfo = Property.getProperty(Constant.API_DATA, "base_BVT");
		if (baseBVTInfo != null)
			return baseBVTInfo;
		else
			throw new RuntimeException("Catalogs List not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1415
	 * 
	 */
	
	public String get_product_tc_1415() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1415");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1349
	 * 
	 */
	
	public String get_product_tc_1349() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1349");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1416
	 * 
	 */
	
	public String get_product_tc_1416() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1416");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1350
	 * 
	 */
	
	public String get_product_tc_1350() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1350");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1328
	 * 
	 */
	
	public String get_product_tc_1328() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1328");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1330
	 * 
	 */
	
	public String get_product_tc_1330() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1330");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1326
	 * 
	 */
	
	public String get_product_tc_1326() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1326");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1411
	 * 
	 */
	
	public String get_product_tc_1411() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1411");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1414
	 * 
	 */
	
	public String get_product_tc_1414() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1414");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1410
	 * 
	 */
	
	public String get_product_tc_1410() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1410");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1413
	 * 
	 */

	public String get_product_tc_1413() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1413");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product code
	 * 
	 */
	
	public String get_product_Code() {

		String getProduct = Property.getProperty(Constant.API_DATA, "produtCode");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1335
	 * 
	 */
	
	public String get_product_tc_1335() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1335");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1331
	 * 
	 */
	
	public String get_product_tc_1331() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1331");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1336
	 * 
	 */
	
	public String get_product_tc_1366() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1366");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1336
	 * 
	 */
	              
	public String get_product_tc_1336() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1336");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1364
	 * 
	 */
	
	public String get_product_tc_1364() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1364");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1613
	 * 
	 */
	
	public String get_product_tc_1613() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1613");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1614
	 * 
	 */
	
	public String get_product_tc_1614() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1614");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1715
	 * 
	 */
	
	public String get_product_tc_1715() {
		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1715");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1717
	 * 
	 */
	
	public String get_product_tc_1717() {
		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1717");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1710
	 * 
	 */
	
	public String get_product_tc_1710() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1710");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1709
	 * 
	 */
	
	public String get_product_tc_1709() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1709");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1711
	 * 
	 */
	
	public String get_product_tc_1711() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1711");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1365
	 * 
	 */

	public String get_product_tc_1365() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1365");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1646
	 * 
	 */
	
	public String get_product_tc_1646() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1646");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets url of Authorization API
	 * 
	 */
	
	public String getAuthorizationUrl() {
		String url = Property.getProperty(Constant.API_DATA, "authorizationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
	}
	
	/**
	 * gets product Info 
	 * 
	 */
	
	public String getProductInfoAuthorizationUser() {
		String url = Property.getProperty(Constant.API_DATA, "productInfoAuthorization");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
	}
	
	/**
	 * gets product Info
	 * 
	 */
	
	public String getProductInfoInvalidAuthorizationUser() {
		String url = Property.getProperty(Constant.API_DATA, "productInfoInvalidAuthorization");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the apiData.properties file.");
		
	}
	
	/**
	 * gets Invalid Token
	 * 
	 */
	
	public String getInvalidToken() {
		String token = Property.getProperty(Constant.API_DATA, "invalidToken");
		if (token != null)
			return token;
		else
			throw new RuntimeException("token not specified in the apiData.properties file.");
	}
	
	/**
	 * gets product data of TC-1339
	 * 
	 */
	
	public String get_product_tc_1339() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1339");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1362
	 * 
	 */
	
	public String get_product_tc_1362() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1362");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1642
	 * 
	 */
	
	public String get_product_tc_1642() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1642");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1363
	 * 
	 */
	
	public String get_product_tc_1363() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1363");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets password
	 * 
	 */
	
	public String get_Password_Detail() {
		String getPassword = Property.getProperty(Constant.DATA_FILE, "passwordData");
		if(getPassword != null)
			return getPassword;
		else
			throw new RuntimeException("Password Data not specified in the Data file.");
	}
	
	/**
	 * gets Authenicated User
	 * 
	 */
	
	public String get_Authenticated_User() {
		String user = Property.getProperty(Constant.API_DATA, "authenticateduser");
		if(user != null)
			return user;
		else
			throw new RuntimeException("User Data not specified in the Data file.");
	}
	
	/**
	 * gets product data of TC-1945
	 * 
	 */
	
	public String get_product_tc_1945() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1945");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1946
	 * 
	 */
	public String get_product_tc_1946() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1946");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1947
	 * 
	 */
	
	public String get_product_tc_1947() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1947");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1948
	 * 
	 */
	
	
	public String get_product_tc_1948() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1948");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1949
	 * 
	 */
	
	public String get_product_tc_1949() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1949");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1941
	 * 
	 */

	public String get_product_tc_1941() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1941");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1942
	 * 
	 */
	
	public String get_product_tc_1942() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1942");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1943
	 * 
	 */
	
	public String get_product_tc_1943() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1943");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1953
	 * 
	 */
	
	public String get_product_tc_1953() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1953");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1954
	 * 
	 */
	
	public String get_product_tc_1954() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1954");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1955
	 * 
	 */

	public String get_product_tc_1955() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1955");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1956
	 * 
	 */
	
	public String get_product_tc_1956() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1956");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1957
	 * 
	 */
	public String get_product_tc_1957() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1957");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1959
	 * 
	 */
	
	public String get_product_tc_1959() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1959");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets Guest user Create Cart API
	 * 
	 */
	public String getCreteCart_GuestUser_API() {

		String productInfo = Property.getProperty(Constant.API_DATA, "guestUserCreateCart");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets Authenticated user Create Cart API
	 * 
	 */
	public String getCreateCart_RegisteredUser_API() {

		String productInfo = Property.getProperty(Constant.API_DATA, "registeredUserCreateCart");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets Add to Cart API
	 * 
	 */
	public String getAddToCartInformationAPI() {

		String productInfo = Property.getProperty(Constant.API_DATA, "AddToCart");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets Invalid Add to Cart API
	 * 
	 */
	public String getInvalidAddToCartInformationAPI() {

		String productInfo = Property.getProperty(Constant.API_DATA, "InvalidAddToCart");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2174
	 * 
	 */
	public String get_product_tc_2174() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2174");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2381
	 * 
	 */
	public String get_product_tc_2381() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2381");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2382
	 * 
	 */
	public String get_product_tc_2382() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2382");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3035
	 * 
	 */
	public String get_product_tc_3035() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3035");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2167
	 * 
	 */
	public String get_product_tc_2167() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2167");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2167_P2
	 * 
	 */
	public String get_product_tc_2167_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2167_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets 404 Add to Cart API
	 * 
	 */
	public String getAddToCartInformationAPI_404() {

		String productInfo = Property.getProperty(Constant.API_DATA, "AddToCart_404");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1944
	 * 
	 */

	public String get_product_tc_1944() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1944");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets PDP product API
	 * 
	 */
	public String get_pdp_product_API() {

		String productInfo = Property.getProperty(Constant.API_DATA, "pdpproductapi");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3061
	 * 
	 */	
	public String get_product_tc_3061() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3061");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets Variant product data of TC-3062
	 * 
	 */	
	public String get_product_tc_3062() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3062");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets PLP Product Information API
	 * 
	 */
	
	public String get_PLP_ProductInformationAPI() {

		String productInfo = Property.getProperty(Constant.API_DATA, "plpProductApi");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3098_P1
	 * 
	 */
	public String get_product_tc_3098_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3098_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3098_P2
	 * 
	 */
	public String get_product_tc_3098_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3098_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3098_P3
	 * 
	 */
	public String get_product_tc_3098_P3() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3098_P3");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3099_P1
	 * 
	 */
	public String get_product_tc_3099_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3099_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3099_P2
	 * 
	 */
	public String get_product_tc_3099_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3099_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3110
	 * 
	 */
	public String get_product_tc_3110() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3110");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3112
	 * 
	 */	
	public String get_product_tc_3112() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3112");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1334
	 * 
	 */

	public String get_product_tc_1334() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1334");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
<<<<<<< HEAD
=======
	 * gets product data of TC-1412
	 * 
	 */
	
	public String get_product_tc_1412() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1412");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets Add to Cart API
	 * 
	 */
	public String getAddToCartAnonymousUser() {

		String productInfo = Property.getProperty(Constant.API_DATA, "AddToCartAnonymousUser");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3965_P1
	 * 
	 */
	public String get_product_tc_3965_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3965_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3965_P2
	 * 
	 */
	public String get_product_tc_3965_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3965_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3970_P1
	 * 
	 */
	public String get_product_tc_3970_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3970_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3970_P2
	 * 
	 */
	public String get_product_tc_3970_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3970_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3969_P1
	 * 
	 */
	public String get_product_tc_3969_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3969_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3969_P2
	 * 
	 */
	public String get_product_tc_3969_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3969_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3967_P1
	 * 
	 */
	public String product_tc_3967_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3967_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3967_P2
	 * 
	 */
	public String product_tc_3967_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3967_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3968_P1
	 * 
	 */
	public String product_tc_3968_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3968_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3968_P2
	 * 
	 */
	public String product_tc_3968_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3968_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
>>>>>>> branch 'develop' of https://acn-ctc@dev.azure.com/acn-ctc/ODP%20Test%20Automation/_git/ODP%20Test%20Automation
	 * gets product data of TC-1357
	 * 
	 */
	              
	public String get_product_tc_1357() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1357");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3961
	 * 
	 */
	              
	public String get_product_tc_3961() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3961");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3962
	 * 
	 */
	              
	public String get_product_tc_3962() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3962");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3963_P1
	 * 
	 */
	              
	public String get_product_tc_3963_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3963_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3963_P2
	 * 
	 */
	              
	public String get_product_tc_3963_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3963_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3962_P3
	 * 
	 */
	              
	public String get_product_tc_3963_P3() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3963_P3");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3964_P1
	 * 
	 */
	              
	public String get_product_tc_3964_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3964_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3964_P2
	 * 
	 */
	              
	public String get_product_tc_3964_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3964_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3964_P3
	 * 
	 */
	              
	public String get_product_tc_3964_P3() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3964_P3");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3966_P1
	 * 
	 */
	public String product_tc_3966_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3966_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3966_P2
	 * 
	 */
	public String product_tc_3966_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3966_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3994
	 * 
	 */
	public String get_product_tc_3994() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3994");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets Add to Cart API
	 * 
	 */
	public String getAddToCartAPI_400Status() {

		String productInfo = Property.getProperty(Constant.API_DATA, "AddToCartAnonymousUser_400Status");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("AddToCartAnonymousUser_400Status Code not specified in the API Data file.");
	}
	
	/**
	 * gets product data of TC-1476
	 * 
	 */
	public String get_product_tc_1476() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_tc_1476");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1352
	 * 
	 */
	public String product_tc_1352() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_tc_1352");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3074
	 * 
	 */
	
	public String get_product_tc_3074() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3074");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4303
	 * 
	 */
	
	public String get_product_tc_4303() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4303");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4304
	 * 
	 */
	
	public String get_product_tc_4304() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4304");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4305
	 * 
	 */
	
	public String get_product_tc_4305() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4305");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3093
	 * 
	 */
	
	public String get_product_tc_3093() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3093");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3123
	 * 
	 */
	public String get_product_tc_3123() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3123");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1493
	 * 
	 */
	
	public String get_product_tc_1493() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1493");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1467
	 * 
	 */
	public String product_tc_1467() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_tc_1467");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1335_P
	 * 
	 */
	public String product_tc_1335_P() {

		String productInfo = Property.getProperty(Constant.API_DATA, "product_tc_1335_P");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1965
	 * 
	 */
	
	public String get_product_tc_1965() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1965");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-2169
	 * gets product data of TC-32169
	 * 
	 */
	public String get_product_tc_2169() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2169");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-1462
	 * 
	 */
	
	public String get_product_tc_1462() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_1462");

		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");

	}
	/**
	 * gets product data of TC-2171
	 * 
	 */
	
	public String get_product_tc_2171() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2171");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("Product Code not specified in the API Data file.");

	}
	/**
	 * gets product data of TC-2188
	 * 
	 */
	
	public String get_product_tc_2188() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_2188");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of product list api with 404 status code
	 * 
	 */
	
	public String get_Product_List_API_404() {

		String getProduct = Property.getProperty(Constant.API_DATA, "plpProductApi_404");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3092_P1
	 * 
	 */
	
	public String get_product_tc_3092_P1() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3092_P1");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code is not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3092_P1
	 * 
	 */
	
	public String get_product_tc_3092_P2() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3092_P2");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code is not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4152
	 * 
	 */
	
	public String get_product_tc_4152() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4152");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-5117
	 * 
	 */
	
	public String get_product_tc_5117() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_5117");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets CTR Store Locator API
	 * 
	 */
	
	public String get_CTR_Store_Locator_API() {

		String ctrStoreLocator = Property.getProperty(Constant.API_DATA, "ctrStoreLocator");
		if (ctrStoreLocator != null)
			return ctrStoreLocator;
		else
			throw new RuntimeException("ctrStoreLocator url not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-5670
	 * 
	 */
	
	public String get_product_tc_5670() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_5670");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product_tc_5670 code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4682
	 * 
	 */
	
	public String get_product_tc_4682() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4682");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-3120
	 * 
	 */
	
	public String get_product_tc_3120() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_3120");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4826
	 * 
	 */
	
	public String get_product_tc_4826() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4826");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4827
	 * 
	 */
	
	public String get_product_tc_4827() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4827");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-4829
	 * 
	 */
	
	public String get_product_tc_4829() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_4829");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-6250
	 * 
	 */
	
	public String get_product_tc_6250() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_6250");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-5663
	 * 
	 */
	
	public String get_product_tc_5663() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_5663");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets product data of TC-5664
	 * 
	 */
	
	public String get_product_tc_5664() {

		String getProduct = Property.getProperty(Constant.API_DATA, "product_tc_5664");
		if (getProduct != null)
			return getProduct;
		else
			throw new RuntimeException("product code not specified in the API Data file.");
	}
	/**
	 * gets Update Cart API with delivery Address and Postal code
	 * 
	 */
	public String get_Update_Cart_API_With_DeliveryAddress_PostalCode_Auth_User() {

		String productInfo = Property.getProperty(Constant.API_DATA, "updateCartApiWithDeliveryAddressPostalCodeAuthUser");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
	/**
	 * gets Update Cart API with delivery Address and Postal code
	 * 
	 */
	public String get_Update_Cart_API_With_DeliveryAddress_PostalCode_Guest_User() {

		String productInfo = Property.getProperty(Constant.API_DATA, "updateCartApiWithDeliveryAddressPostalCodeGuestUser");
		if (productInfo != null)
			return productInfo;
		else
			throw new RuntimeException("productInfo not specified in the API Data file.");
	}
}
