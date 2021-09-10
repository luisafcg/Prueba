package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Booking;
import pages.DashboardPO;

public class BusquedaVueloStep {

    DashboardPO dashboard = new DashboardPO();
    Booking booking = new Booking();

    @Given("^ingresa a la URL \"([^\"]*)\"$")
    public void ingresarURL(String url) {
        dashboard.navigateToPage(url);
    }

    @Given("^selecciona la opcion solo ida$")
    public void seleccionarOpcionIda() {
        dashboard.clicOpcionIda();

    }

    @Given("^selecciona el origen \"([^\"]*)\"$")
    public void ingresarDesde(String texto) {
        dashboard.ingresarOrigen(texto);

    }

    @Given("^selecciona el destino \"([^\"]*)\"$")
    public void ingresarHacia(String texto) {
        dashboard.ingresarDestino(texto);
    }

    @Given("^en el campo Cuando viajas ingresa la fecha actual \"([^\"]*)\"$")
    public void ingresarFecha(String texto) {
        dashboard.ingresarFecha(texto);
    }

    @Given("^en el campo Como viajas indica dos adultos$")
    public void seleccionaAdultos() {
        dashboard.clicOpcionIngresarPasajeros();
        dashboard.ingresarAdultos();
    }

    @Given("^en el campo Como viajas indica un niño$")
    public void seleccionaNino() {
        dashboard.clicOpcionIngresarPasajeros();
        dashboard.ingresarNino(); 
    }


    @Given("^en el campo Como viajas indica un bebe$")
    public void seleccionaBebe() {
        dashboard.clicOpcionIngresarPasajeros();
        dashboard.ingresarBebe();
    }

    
    @When("^da clic en el boton Buscar vuelos$")
    public void clicBotonBuscarVuelo() {
        dashboard.clicBotonBuscarVuelo();
    }

    @When("^visualiza el booking panel con la seccion de la tarifa$")
    public void validar() {
        booking.visualizacionSeccionTarifa();

    }



}
