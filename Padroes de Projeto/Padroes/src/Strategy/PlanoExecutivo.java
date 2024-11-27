public class PlanoExecutivo implements PlanoServico {
    @Override
    public void exibirBeneficios() {
        System.out.println("Plano Executivo: Assento de classe executiva, refeições gourmet, acesso exclusivo à sala VIP e embarque prioritário.");
    }

    @Override
    public double calcularPreco(double precoBase) {
        return precoBase * 1.50;
    }
}
