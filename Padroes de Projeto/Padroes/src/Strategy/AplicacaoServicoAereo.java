public class AplicacaoServicoAereo {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        double precoBase = 1000.0;

        String planoEscolhido = "Basico";
        System.out.println("Plano escolhido: " + planoEscolhido);
        contexto.setPlanoServico(new PlanoBasico());
        contexto.exibirBeneficios();
        double precoFinalBasico = contexto.calcularPrecoFinal(precoBase);
        System.out.println("Preço final do voo (Plano Básico): R$ " + precoFinalBasico);
        System.out.println("-------------------------------------------------");

        planoEscolhido = "Premium";
        System.out.println("Plano escolhido: " + planoEscolhido);
        contexto.setPlanoServico(new PlanoPremium());
        contexto.exibirBeneficios();
        double precoFinalPremium = contexto.calcularPrecoFinal(precoBase);
        System.out.println("Preço final do voo (Plano Premium): R$ " + precoFinalPremium);
        System.out.println("-------------------------------------------------");

        planoEscolhido = "Executivo";
        System.out.println("Plano escolhido: " + planoEscolhido);
        contexto.setPlanoServico(new PlanoExecutivo());
        contexto.exibirBeneficios();
        double precoFinalExecutivo = contexto.calcularPrecoFinal(precoBase);
        System.out.println("Preço final do voo (Plano Executivo): R$ " + precoFinalExecutivo);
        System.out.println("-------------------------------------------------");
    }
}
