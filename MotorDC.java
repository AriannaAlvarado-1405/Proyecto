package modulo1;
public class MotorDC extends Motor {

    private boolean tieneEscobillas;

    public MotorDC(String codigo, String tipoMotor, double potenciaNominal, double corrienteNominal,
                   String ubicacion, boolean tieneEscobillas) {
        super(codigo, tipoMotor, potenciaNominal, corrienteNominal, ubicacion);
        this.tieneEscobillas = tieneEscobillas;
    }

    public boolean getTieneEscobillas() {
        return tieneEscobillas;
    }

    public void setTieneEscobillas(boolean escobillas) {
        this.tieneEscobillas = escobillas;
    }


    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() +
                ", Tiene escobillas: " + tieneEscobillas;
    }
}