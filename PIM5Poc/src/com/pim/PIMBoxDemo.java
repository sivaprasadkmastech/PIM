package com.pim;

import com.ibm.pim.catalog.Catalog;
import com.ibm.pim.catalog.CatalogManager;
import com.ibm.pim.catalog.item.Item;
import com.ibm.pim.collection.PIMCollection;
import com.ibm.pim.context.Context;
import com.ibm.pim.context.PIMContextFactory;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunction;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunctionArguments;
import com.ibm.pim.utils.Logger;

public class PIMBoxDemo implements ScriptingSandboxFunction {

	Context ctx = PIMContextFactory.getCurrentContext();
	
	@Override
	public void scriptingSandbox(ScriptingSandboxFunctionArguments arg0) {
		// TODO Auto-generated method stub
		CatalogManager ctgMgr = ctx.getCatalogManager();
		Catalog ctg = ctgMgr.getCatalog("Product Information");
		Logger logger = ctx.getLogger("ipm.log");
		logger.logInfo("WELCOME TO AUTOMATION DEPLOYMENT ");
		logger.logInfo("Demo Testing Ant build on 26-09-2023 : 8:30 ****** ");
		
		PIMCollection<Item> allItems=ctg.getItems();
		for(Item oitem: allItems)
		{
			logger.logInfo("Testing for item " +oitem.getPrimaryKey());
			logger.logInfo(oitem.getPrimaryKey());
			//logger.logInfo(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Desc"));
			
		}

	}

}
