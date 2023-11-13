package EngenhariadeSoftware.manager;
import EngenhariadeSoftware.manager.calculos.CalcularDistancia;
import EngenhariadeSoftware.manager.calculos.CalcularPeso;
import EngenhariadeSoftware.manager.calculos.CalcularVolume;
import EngenhariadeSoftware.manager.calculos.FreteFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner =  new Scanner(System.in);

        System.out.println("Olá, tudo bem? Sou o calculador de frete \n");
        System.out.println("Eu calculo o preço do seu frete com base em 3 custos\n");
        System.out.println("Custo da distância, peso e volume do produto\n");
        System.out.println("Vamos começar?\n");
        
        //Distância
        System.out.println("Informe a distancia do destinatário: \n");
        double scDistancia = myScanner.nextDouble();
        CalcularDistancia distancia_frete = new CalcularDistancia();
        distancia_frete.custoTotalDistancia(scDistancia);

        //Peso
        System.out.println("Informe o peso do destinatário: \n");
        double scPeso = myScanner.nextDouble();
        CalcularPeso peso_frete = new CalcularPeso();
        peso_frete.custoTotalPeso(scPeso);

        //Volume 
        System.out.println("Informe a altura do destinatário: \n");
        double scVolumeAlt = myScanner.nextDouble();
        System.out.println("Informe a largura do destinatário: \n");
        double scVolumeLarg = myScanner.nextDouble();
        System.out.println("Informe a comprimento do destinatário: \n");
        double scVolumeComp = myScanner.nextDouble();
        CalcularVolume volume_frete = new CalcularVolume();
        volume_frete.calcularVolume(scVolumeAlt, scVolumeLarg, scVolumeComp);


        //frete final
        FreteFinal fretefinal = new FreteFinal();
        fretefinal.custoFinalFrete(distancia_frete, peso_frete, volume_frete);

        myScanner.close();

    }

}