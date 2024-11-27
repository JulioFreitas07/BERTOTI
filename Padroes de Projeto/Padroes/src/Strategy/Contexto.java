public class Contexto {
    private PlanoServico planoServico;

    public void setPlanoServico(PlanoServico planoServico) {
        this.planoServico = planoServico;
    }

    public void exibirBeneficios() {
        planoServico.exibirBeneficios();
    }

    public double calcularPrecoFinal(double precoBase) {
        return planoServico.calcularPreco(precoBase);
    }
}
