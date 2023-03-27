package com.sophossolutions.task;

import com.sophossolutions.ui.LoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SetCredentials implements Task {
	
	//Crear atributos e inicializarlos
	
	//Paso 1, crear variables con tipo
	Target targ; 	//Tipo target
	String user;	//Tipo String
	String password; //Tipo String
	
	//Crear un metodo que recibe como parametro un string
	//Constructor
	
	//Recibe 2 parámetros tipo string:
	public SetCredentials(String user, String password) {
		
		//Llamarlos e inicializarlos
		 this.user = user;
		 this.password = password;
	}
	
	//Crear un metodo que recibe como parametro un target
	public SetCredentials(Target target) {
		//Se le asigna un target
		this.targ = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Enter.theValue(user).into(LoginPage.trxUser),
				Enter.theValue(password).into(LoginPage.txtPassword),
				Click.on(LoginPage.btnSubmit));
	}
	
	//Creamos aqui los constructores
	
	public static SetCredentials with() {
		
		//Le vamos a mandar la misma clase
		//Se le manda por parametro un SetCredentials que es el nombre de la clase como parámetro
		return Tasks.instrumented(SetCredentials.class, "hola");
	}
	
	//Le vamos a mandar la misma clase
	//Se le pone por parámetro un target
	public static SetCredentials form(String user, String password) {
		
		return Tasks.instrumented(SetCredentials.class, user, password);
	}
}
