package com.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.baselib.BaseLib;
import com.po.GmailLoginPo;

@Listeners(com.baselib.Listners.class)

public class GmailLoginScript extends BaseLib{
	
@Test
public void login() throws Throwable
{
	GmailLoginPo t1=new GmailLoginPo(driver);
	t1.getEleEmail().sendKeys("cbtcrowd508");
	t1.getNextButt().click();
	Thread.sleep(5000);
	t1.getPwd().sendKeys("PEAR@12");
	t1.getSignInButt().click();
	
}

}
