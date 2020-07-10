package automation.library.api.stepDefination;

import automation.library.api.cucumber.TestContext;
import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogVersionEndPoint;
import automation.library.api.endpoint.CatalogsEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;
import automation.library.api.endpoint.ProductInfoENEndPoint;
import automation.library.api.endpoint.ProductInfoFREndPoint;


public class BaseStep {

	
	private CTBVTEndPoint ctbvtEndPoint;
	private CatalogsListEndPoint catalogsListEndPoint;
	private CatalogsEndPoint catalogEndPoint;
	private CatalogVersionEndPoint catalogVersionEndPoint;

	private ProductInfoFREndPoint productInfoFREndPoint;
	private ProductInfoENEndPoint productInfoENEndPoint;
	

	public BaseStep(TestContext testContext) {
		//ctbvtEndPoint = testContext.getCTBVTEndPoint();

	}
	
	public CTBVTEndPoint getCTBVTEndPoint() {
		return ctbvtEndPoint;
	}
	
	public CatalogsListEndPoint getCatalogsListEndPoint() {
		return catalogsListEndPoint;
	}
	
	public CatalogsEndPoint getCatalogEndPoint() {
		return catalogEndPoint;
	}
	
	public CatalogVersionEndPoint getCatalogVersionEndPoint() {
		return catalogVersionEndPoint;
	}
	
	public ProductInfoFREndPoint getProductInfoFREndPoint() {
		return productInfoFREndPoint;

	}
	
	public ProductInfoENEndPoint getProductInfoENEndPoint() {
		return productInfoENEndPoint;
	}

}
