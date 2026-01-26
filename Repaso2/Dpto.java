package Repaso2;

public class Dpto {
    protected String NombreD;
    private String Presupuesto;
    private String Sede;
    public Dpto (String NombreD, String Presupuesto, String Sede){
        this.NombreD=NombreD;
        this.Presupuesto=Presupuesto;
        this.Sede=Sede;
    }
    public String getNombreD() {
        return NombreD;
    }
    public void setNombreD(String nombreD) {
        NombreD = nombreD;
    }
    public String getPresupuesto() {
        return Presupuesto;
    }
    public void setPresupuesto(String presupuesto) {
        Presupuesto = presupuesto;
    }
    public String getSede() {
        return Sede;
    }
    public void setSede(String sede) {
        Sede = sede;
    }
    @Override
    public String toString() {
        System.out.println(NombreD+"a"+Presupuesto+"a"+Sede);
        return super.toString();
    }
}
