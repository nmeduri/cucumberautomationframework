package automation.library.api.cucumber;

import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogVersionEndPoint;
import automation.library.api.endpoint.CatalogsEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;
import automation.library.api.endpoint.ProductInfoFREndPoint;
import automation.library.logdetail.Log;

public class TestContext {

	private String BASE_URL_BVT_D1 = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/basesites?fields=DEFAULT";

	private String CATALOGS_LIST_URL_D1 = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs?fields=DEFAULTs";

	private String CATALOG_URL_D1 = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog?fields=DEFAULT";

	private String CATALOG_VERSION_D1 = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog/Staged?fields=DEFAULT";

	private String PRODUCT_INFOR_FR_CA_D1 = "https://api.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/products/0882184?lang=fr_CA";
	
	private String PRODUCT_INFOR_EN_CA_D1 = "https://api.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/products/0603711?lang=en_CA";
	
	private String BASE_URL_BVT_D2 = "https://accstorefront.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/basesites?fields=DEFAULT";

	private String CATALOGS_LIST_URL_D2 = "https://accstorefront.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs?fields=DEFAULTs";

	private String CATALOG_URL_D2 = "https://accstorefront.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog?fields=DEFAULT";

	private String CATALOG_VERSION_D2 = "https://accstorefront.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog/Staged?fields=DEFAULT";

	private String PRODUCT_INFOR_FR_CA_D2 = "https://api.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/products/0603711?lang=fr_CA";
	
	private String PRODUCT_INFOR_EN_CA_D2 = "https://api.c0onq03u1z-canadiant2-d2-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/products/0603711?lang=en_CA";

	public TestContext() {
 
		String sEnvironment = System.getenv("environment");
		//String sEnvironment = "DEV";
		if (sEnvironment.equalsIgnoreCase("D1")) {
			new CTBVTEndPoint(BASE_URL_BVT_D1);
			new CatalogsListEndPoint(CATALOGS_LIST_URL_D1);
			new CatalogsEndPoint(CATALOG_URL_D1);
			new CatalogVersionEndPoint(CATALOG_VERSION_D1);
			new ProductInfoFREndPoint(PRODUCT_INFOR_FR_CA_D1);
			new ProductInfoFREndPoint(PRODUCT_INFOR_EN_CA_D1);
			Log.message("D1", true);
		} else if(sEnvironment.equalsIgnoreCase("D2")){
			Log.message("D2", true);
			new CTBVTEndPoint(BASE_URL_BVT_D2);
			new CatalogsListEndPoint(CATALOGS_LIST_URL_D2);
			new CatalogsEndPoint(CATALOG_URL_D2);
			new CatalogVersionEndPoint(CATALOG_VERSION_D2);
			new ProductInfoFREndPoint(PRODUCT_INFOR_FR_CA_D2);
			new ProductInfoFREndPoint(PRODUCT_INFOR_EN_CA_D2);
		}

	}
}
