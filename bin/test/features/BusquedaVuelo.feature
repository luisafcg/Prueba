Feature: Este feature valida la busqueda de un vuelo

  Background:
    Given ingresa a la URL "https://www.avianca.com/co/es/"


    @Automation
    Scenario: 001 Validar busqueda de un vuelo
      When selecciona la opcion solo ida