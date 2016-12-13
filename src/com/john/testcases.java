package com.john;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;

import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class testcases extends UiAutomatorTestCase {

	public void testQQ() throws Exception{
		UiDevice device = UiDevice.getInstance();
		device.pressHome();
		UiObject qq = new UiObject(new UiSelector().text("QQ"));
		qq.clickAndWaitForNewWindow();
		device.pressBack();
		device.pressRecentApps();
		device.pressBack();
	}
	
	public void testQQ2() throws Exception{
		UiDevice device = UiDevice.getInstance();
		device.pressHome();
		UiObject qq = new UiObject(new UiSelector().text("QQ"));
		qq.clickAndWaitForNewWindow();
		device.pressBack();
		device.pressRecentApps();
		device.pressBack();
	}
	
}
