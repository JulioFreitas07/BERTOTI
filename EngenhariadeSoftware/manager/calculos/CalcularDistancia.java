package EngenhariadeSoftware.manager.calculos;

public class CalcularDistancia {
    
    private double distancia;
    private double precoKM = 2.5;
    private double custoTotalKM;
    public double getCustoTotalKM() {
        return custoTotalKM;
    }
    public void setCustoTotalKM(double custoTotalKM) {
        this.custoTotalKM = custoTotalKM;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getPrecoKM() {
        return precoKM;
    }
    public void setPrecoKM(double precoKM) {
        this.precoKM = precoKM;
    }

    public void custoTotalDistancia(double pDistancia){

        setDistancia(pDistancia);

        double vrCustoTotalKM = getPrecoKM() * getDistancia();

        setCustoTotalKM(vrCustoTotalKM);

    }

}
