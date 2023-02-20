package automation;


import com.ibm.pim.catalog.Catalog;
import com.ibm.pim.catalog.CatalogManager;
import com.ibm.pim.catalog.item.Item;
import com.ibm.pim.collection.PIMCollection;
import com.ibm.pim.context.Context;
import com.ibm.pim.context.PIMContextFactory;
import com.ibm.pim.extensionpoints.ReportGenerateFunction;
import com.ibm.pim.extensionpoints.ReportGenerateFunctionArguments;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunction;
import com.ibm.pim.extensionpoints.ScriptingSandboxFunctionArguments;
import com.ibm.pim.utils.Logger;

public class Get_Automation_Data implements ReportGenerateFunction, ScriptingSandboxFunction{ 

	Context ctx = PIMContextFactory.getCurrentContext();
	
@Override
public void reportGenerate(ReportGenerateFunctionArguments arg0) {
	// TODO Auto-generated method stub
	CatalogManager ctgMgr = ctx.getCatalogManager();
	Catalog ctg = ctgMgr.getCatalog("Automation_poc_Catalog");
	
	Logger logger = ctx.getLogger("ipm.log");
	logger.logInfo("Automation Testing ********");
	PIMCollection<Item> allItems=ctg.getItems();
	for(Item oitem: allItems)
	{
		logger.logInfo("Testing for item " +oitem.getPrimaryKey());
		System.out.println(oitem.getPrimaryKey());
		logger.logInfo(oitem.getPrimaryKey());
		System.out.println(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Desc"));	
		logger.logInfo(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Desc"));
		System.out.println(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Test"));	
		logger.logInfo(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Test"));
	}
}

@Override
public void scriptingSandbox(ScriptingSandboxFunctionArguments arg0) {
	// TODO Auto-generated method stub
	CatalogManager ctgMgr = ctx.getCatalogManager();
	Catalog ctg = ctgMgr.getCatalog("Automation_poc_Catalog");
	Logger logger = ctx.getLogger("ipm.log");
	logger.logInfo("WELCOME TO AUTOMATION DEPLOYMENT");
	logger.logInfo("Automation Testing ******** Ant build 23-11-2022 : 11:38 ****** ");
	
	PIMCollection<Item> allItems=ctg.getItems();
	for(Item oitem: allItems)
	{
		logger.logInfo("Testing for item " +oitem.getPrimaryKey());
		System.out.println(oitem.getPrimaryKey());
		logger.logInfo(oitem.getPrimaryKey());
		System.out.println(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Desc"));	
		logger.logInfo(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Desc"));
		System.out.println(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Test"));	
		logger.logInfo(oitem.getAttributeValue("Automation_poc/Automation_Attrib_Test"));
	}
	
}
}