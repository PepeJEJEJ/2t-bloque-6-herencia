
public class Vivienda {
    private String nomProp;
    private int valor;
    private String direccion;
    private int nHabs;
    public Habitacion Habs[];//arraids
    public Vivienda(String nomProp, int valor,String direccion,int nHabs){
        this.nomProp=nomProp;
        this.valor=valor;
        this.direccion=direccion;
        this.nHabs=nHabs;
        Habs=new Habitacion[nHabs];//arraids
    }
    public int areatotal(){
        int total=0;
        for (int i = 0; i < Habs.length; i++) {
            total+=Habs[i].superficie();
        }
        return total;
    }
    public Habitacion[] getHabs() {
        return Habs;
    }
    public void setHabs(Habitacion[] habs) {
        Habs = habs;
    }
}
