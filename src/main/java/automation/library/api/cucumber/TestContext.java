package automation.library.api.cucumber;

import automation.library.api.endpoint.CTBVTEndPoint;
import automation.library.api.endpoint.CatalogVersionEndPoint;
import automation.library.api.endpoint.CatalogsEndPoint;
import automation.library.api.endpoint.CatalogsListEndPoint;

public class TestContext {

	private String BASE_URL_BVT = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/basesites?fields=DEFAULT";

	private String CATALOGS_LIST_URL = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs?fields=DEFAULTs";
	
	private String CATALOG_URL = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog?fields=DEFAULT";
	
	private String CATALOG_VERSION = "https://accstorefront.c0onq03u1z-canadiant2-d1-public.model-t.cc.commerce.ondemand.com/rest/v2/canadiantire/catalogs/ctcCanadianTireProductCatalog/Staged?fields=DEFAULT";
	
	private CTBVTEndPoint ctbvtEndPoint;
	
	private CatalogsListEndPoint catalogsListEndPoint;
	
	private CatalogsEndPoint catalogsEndPoint;
	
	private CatalogVersionEndPoint catalogVersionEndPoint;

	public TestContext() {

		ctbvtEndPoint = new CTBVTEndPoint(BASE_URL_BVT);
		catalogsListEndPoint = new CatalogsListEndPoint(CATALOGS_LIST_URL);
		catalogsEndPoint = new CatalogsEndPoint(CATALOG_URL);
		catalogVersionEndPoint = new CatalogVersionEndPoint(CATALOG_VERSION);

	}

	public CTBVTEndPoint getCTBVTEndPoint() {
		return ctbvtEndPoint;
	}
	
	public CatalogsListEndPoint getCatalogsListEndPoint() {
		return catalogsListEndPoint;
	}
	
	public CatalogsEndPoint getCatalogEndPoint() {
		return catalogsEndPoint;
	}
	
	public CatalogVersionEndPoint getCatalogVersionEndPoint() {
		return catalogVersionEndPoint;
	}

}
