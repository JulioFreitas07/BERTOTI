package EngenhariadeSoftware.manager.calculos;


public class CalcularVolume {

    private double altura;
    private double largura;
    private double comprimento;
    private double precoM3 = 10;
    private double volumeTotal;
    private double custoTotalM3;

    public double getCustoTotalM3() {
        return custoTotalM3;
    }
    public void setCustoTotalM3(double custoTotalM3) {
        this.custoTotalM3 = custoTotalM3;
    }
    public double getVolumeTotal() {
        return volumeTotal;
    }
    public void setVolumeTotal(double volumeTotal) {
        this.volumeTotal = volumeTotal;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getPrecoM3() {
        return precoM3;
    }
    public void setPrecoM3(double precoM3) {
        this.precoM3 = precoM3;
    }


    public void calcularVolume(Double pAltura, Double pLargura, Double pComprimento){
        
        setAltura(pAltura);
        setComprimento(pComprimento);
        setLargura(pLargura);

        double cVolumeTotal = getAltura()*getComprimento()*getLargura(); 

        setVolumeTotal(cVolumeTotal);

        calcularPrecoVolume();

    }

    public void calcularPrecoVolume(){

        double rvCustoM3 = getVolumeTotal() * getPrecoM3();

        setCustoTotalM3(rvCustoM3);

    }

}