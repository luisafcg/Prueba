Feature: Este feature valida la busqueda de un vuelo

  Background:
    Given ingresa a la URL "https://www.avianca.com/co/es/"

    Scenario: 001 Validar busqueda de un vuelo
      Given selecciona la opcion solo ida
      And selecciona el origen "Bogota"
      And selecciona el destino "Buenos Aires"
      And en el campo Cuando viajas ingresa la fecha actual "Vie, 10 sep."
      And en el campo Como viajas indica dos adultos
      And en el campo Como viajas indica un niño
      And en el campo Como viajas indica un bebe
      When da clic en el boton Buscar vuelos
      Then visualiza el booking panel con la seccion de la tarifa
