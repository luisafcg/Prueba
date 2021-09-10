package pages;

public class DashboardPO extends BasePage {

    private String opcionIda = "radioSoloIda";
    private String campoDesde = "pbOrigen";
    private String campoHacia = "pbDestino";
    private String cuandoViajas = "pbFechaIda";
    private String pasajeros = "pbPasajeros";
    private String anadirAdultos ="//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]";
    private String anadirNino ="//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/i[1]";
    private String anadirBebe = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[3]/div[4]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[3]";
    private String btnBuscarVuelo = "//*[@id='ida_1_489197933']/div/form/div/div[2]/div/div/div[3]/fieldset/div/div[4]/button";

    public DashboardPO() {
        super(driver);
    }

    public void navigateToPage(String url) {
        navigateTo(url);
    }

    public void clicOpcionIda() {
        clicElementoPorId(opcionIda);
    }

    public void ingresarOrigen(String texto){
        ingresarValorPorName(campoDesde, texto);
        clicElementoPorName(campoDesde);
    }

    public void ingresarDestino(String texto){
        ingresarValorPorName(campoHacia, texto);
        clicElementoPorName(campoHacia);
    }

    public void ingresarFecha(String texto){
        clicElementoPorName(cuandoViajas);
        ingresarValorPorName(cuandoViajas, texto);
    }

    public void clicOpcionIngresarPasajeros(){
        clicElementoPorName(pasajeros);
    }

    public void ingresarAdultos(){
        clicElementoPorXpath(anadirAdultos);
    }

    public void ingresarNino(){
        clicElementoPorXpath(anadirNino);
    }

    public void ingresarBebe(){
        clicElementoPorXpath(anadirBebe);
    }

    public void clicBotonBuscarVuelo(){
        clicElementoPorXpath(btnBuscarVuelo);
    }

   

}
