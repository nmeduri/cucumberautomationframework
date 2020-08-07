package automation.library.api.stepDefination;


import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogVersionEndPoint;
import automation.library.api.endpoint.CatalogsEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;
import automation.library.api.endpoint.HYB_API_EN_CA_End_Point;
import automation.library.api.endpoint.HYB_API_EN_End_Point;
import automation.library.api.endpoint.HYB_API_FR_CA_End_Point;
import automation.library.api.endpoint.HYB_API_Wishlist_End_Point;
import automation.library.api.endpoint.HYB_Api_Field_Default_End_Point;
import automation.library.api.endpoint.HYB_Api_Product_End_Point;
import automation.library.api.endpoint.ProductInfoENEndPoint;
import automation.library.api.endpoint.ProductInfoFREndPoint;
import io.restassured.response.Response;


public class BaseStep {

	public static Response response;
	public static String guid;
	public static String url;
	private CTBVTEndPoint ctbvtEndPoint;
	private CatalogsListEndPoint catalogsListEndPoint;
	private CatalogsEndPoint catalogEndPoint;
	private CatalogVersionEndPoint catalogVersionEndPoint;

	private ProductInfoFREndPoint productInfoFREndPoint;
	private ProductInfoENEndPoint productInfoENEndPoint;

	private HYB_API_EN_CA_End_Point apiEnCaEndPoint;
	private HYB_API_FR_CA_End_Point apiFrCaEndPoint;
	private HYB_API_EN_End_Point apiEnEndPoint;
	private HYB_Api_Field_Default_End_Point apiFieldDefault;
	private HYB_Api_Product_End_Point apiProduct;
	private HYB_API_Wishlist_End_Point wishlistAPI;


	
	
	public CTBVTEndPoint getCTBVTEndPoint() {
		ctbvtEndPoint = new CTBVTEndPoint();
		return ctbvtEndPoint;
	}
	
	public CatalogsListEndPoint getCatalogsListEndPoint() {
		catalogsListEndPoint = new CatalogsListEndPoint();
		return catalogsListEndPoint;
	}
	
	public CatalogsEndPoint getCatalogEndPoint() {
		catalogEndPoint = new CatalogsEndPoint();
		return catalogEndPoint;
	}
	
	public CatalogVersionEndPoint getCatalogVersionEndPoint() {
		catalogVersionEndPoint = new CatalogVersionEndPoint();
		return catalogVersionEndPoint;
	}

	public HYB_API_EN_CA_End_Point getHybApiENCA() {
		apiEnCaEndPoint = new HYB_API_EN_CA_End_Point();
		return apiEnCaEndPoint;
	}
	
	public HYB_API_FR_CA_End_Point getHybApiFRCA() {
		apiFrCaEndPoint = new HYB_API_FR_CA_End_Point();
		return apiFrCaEndPoint;
	}
	
	public HYB_API_EN_End_Point getHybApiEN() {
		apiEnEndPoint = new HYB_API_EN_End_Point();
		return apiEnEndPoint;
	}
	
	public HYB_Api_Field_Default_End_Point getApiFieldDefault() {
		apiFieldDefault = new HYB_Api_Field_Default_End_Point();
		return apiFieldDefault;
	}
	
	public HYB_Api_Product_End_Point getApiProduct() {
		apiProduct = new HYB_Api_Product_End_Point();
		return apiProduct;
	}
	
	public HYB_API_Wishlist_End_Point wishListAPI() {
		wishlistAPI = new HYB_API_Wishlist_End_Point();
		return wishlistAPI;
	}
	


}
