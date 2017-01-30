package com.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.baselib.BaseLib;
import com.po.GmailLoginPo;

public class GmailLoginScript extends BaseLib{
	
@Test
public void login() throws Throwable
{
	GmailLoginPo t1=new GmailLoginPo(driver);
	t1.setEmail("cbtcrowd508");
	t1.clickNextButt();
	Thread.sleep(5000);
	t1.setPwd("PEAR@123");
	t1.clickSignInButt();
	
}
@Test
public void testFail() throws Throwable{
	GmailLoginPo t2=new GmailLoginPo(driver);
	t2.setEmail("cbtcrowd508");
	t2.clickNextButt();
	Thread.sleep(5000);
	t2.setPwd("PEAR@122");
	t2.clickSignInButt();
}
}
