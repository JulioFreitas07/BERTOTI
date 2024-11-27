public class PlanoBasico implements PlanoServico {
    @Override
    public void exibirBeneficios() {
        System.out.println("Plano Básico: Serviço de bordo simples, sem refeições, sem prioridade de embarque.");
    }

    @Override
    public double calcularPreco(double precoBase) {
        return precoBase;
    }
}
