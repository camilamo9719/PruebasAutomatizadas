package com.sophossolutions.stepdefinitions;

import org.hamcrest.Matchers;

import com.sophossolutions.exceptions.UnexpectedResult;
import com.sophossolutions.questions.TextOf;
import com.sophossolutions.task.SetCredentials;
import com.sophossolutions.ui.HomePage;
import com.sophossolutions.utils.Constants;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewToursLoginStepDefinitions {
	
	//Escenario para configurar el escenario
	//Si o si se deben definir
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	//No es necesario hacer clases, sino queda como una narrativa
	@Given("Debe estar en la pagina de New Tours {string}")
	public void debeEstarEnLaPaginaDeNewTours(String string) {
		// Para abrir la url se usa esto en proyectos
		// Para proyectos que usen varias url
		Open.url(Constants.getData(string));
		//OnStage.theActorCalled("Tomas").wasAbleTo(Open.browserOn(new LoginPage()));
		OnStage.theActorCalled("user").wasAbleTo(Open.url(Constants.getData(string)));
	}
	@When("Ingresar las credenciales {string} {string}")
	public void ingresarLasCredenciales(String string, String string2) {
		//Le vamos a mandar la clase
		//Retorna una instancia segun el constructor
		
		//Poner la siguiente funcion OnStage
		OnStage.theActorInTheSpotlight().wasAbleTo(SetCredentials.form(string, string2));
	}
	@Then("Validar el mensaje del home de la pagina {string}")
	public void validarElMensajeDelHomeDeLaPagina(String string) {
		//Llamar al actor en el escenario
		//Deberia
		//See that le pasamos la question
		//Se le manda el mapeo del mensaje mediante el textof.field()
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TextOf.field(HomePage.txtWelcome), Matchers.equalTo(string)).orComplainWith(UnexpectedResult.class, "El titulo del elemento no coincide con el esperado"));
	}
}
