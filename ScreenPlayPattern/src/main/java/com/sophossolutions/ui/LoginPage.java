package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demo.guru99.com/test/newtours/")

public class LoginPage extends PageObject {
	public static Target trxUser = Target.the("Campo userName").locatedBy("//input[@name='userName']");
	public static Target txtPassword = Target.the("Campo password").locatedBy("//input[@type='password']");
	public static Target btnSubmit = Target.the("Campo button").locatedBy("//input[@type='submit']");
	
	
}
