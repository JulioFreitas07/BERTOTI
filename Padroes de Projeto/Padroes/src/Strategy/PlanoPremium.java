public class PlanoPremium implements PlanoServico {
    @Override
    public void exibirBeneficios() {
        System.out.println("Plano Premium: Inclui refeições, acesso à sala VIP e prioridade no embarque.");
    }

    @Override
    public double calcularPreco(double precoBase) {
        return precoBase * 1.30;
    }
}
