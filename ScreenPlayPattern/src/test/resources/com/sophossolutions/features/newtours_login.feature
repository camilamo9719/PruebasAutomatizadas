#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login de New Tours
  Como automatizadora quiero ponder loguearme dentro de la pagina NewTours

  @tag1
  Scenario: Loguearse en New Tours
    Given Debe estar en la pagina de New Tours "Login newTours"
    When Ingresar las credenciales "tomas123" "123456789"
    
    # Credenciales en Tabla
    # | user| password |
    # |andres.gonzalesf |Andy741 |
    Then Validar el mensaje del home de la pagina "Login Successfully"