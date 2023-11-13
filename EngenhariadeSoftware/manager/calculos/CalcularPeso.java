package EngenhariadeSoftware.manager.calculos;

public class CalcularPeso {
    
    private double peso;
    private double precoKG = 5;
    private double custoTotalKG;
    public double getCustoTotalKG() {
        return custoTotalKG;
    }
    public void setCustoTotalKG(double custoTotalKG) {
        this.custoTotalKG = custoTotalKG;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecoKG() {
        return precoKG;
    }
    public void setPrecoKG(double precoKG) {
        this.precoKG = precoKG;
    }

    public void custoTotalPeso(double pPeso){

        setPeso(pPeso);

        double vrCustoTotalKG = getPeso() * getPrecoKG();
        
        setCustoTotalKG(vrCustoTotalKG);
    }

}
