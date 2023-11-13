package EngenhariadeSoftware.manager.calculos;

public class FreteFinal {
    
    private double precoFinalFrete;

    public double getPrecoFinalFrete() {
        return precoFinalFrete;
    }

    public void setPrecoFinalFrete(double precoFinalFrete) {
        this.precoFinalFrete = precoFinalFrete;
    }

    public void custoFinalFrete(CalcularDistancia distanciaObj, CalcularPeso pesoObj, CalcularVolume volumeObj){

        double vrPrecoFinalFrete = distanciaObj.getCustoTotalKM() + pesoObj.getCustoTotalKG() + volumeObj.getCustoTotalM3();

        setPrecoFinalFrete(vrPrecoFinalFrete);

        System.out.println("\n O valor final do frete é: R$" + getPrecoFinalFrete());

    }

}
