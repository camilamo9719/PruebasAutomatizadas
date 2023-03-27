package com.sophossolutions.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Se crea esta pagina para validar el mensaje exitoso
//Se crea el target aqui
public class HomePage extends PageObject {
	public static Target txtWelcome = Target.the("Texto de Bienvenida").locatedBy("//h3[contains(text(),\'Login\')]");
}
