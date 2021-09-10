package pages;

public class Booking extends BasePage{

    private String seccionTarifa = "dates-container";
    
    public Booking() {
        super(driver);
    }

    public void visualizacionSeccionTarifa(){
        validarVisualizacionElementoPorId(seccionTarifa);
    }


}
