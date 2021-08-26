package br.com.zup;

public class exercicioComplementar2 {
    public static void main(String[] args) {
        float area = 354.58F;
        float litros = (area / 6);
        float latas = litros / 18;
        double latasArredondado = Math.ceil(latas);
        float valorLata = 80;

        System.out.println("1- A quantidade de latas necessárias para pintar a área de " + area + " m2 será de " + latas + " latas.");
        System.out.println("Ou seja, aredondando serão necessárias " + latasArredondado + " latas e será pago o valor de: R$ " + latasArredondado * valorLata + " no total");

        float galoes = litros /3.6F;
        float valorGalao = 25;
        double galoesArredondado = Math.ceil(galoes);

        System.out.println("2- A quantidade de galões necessários para pintar a área de " + area + " m2 será de " + galoes + " galões.)");
        System.out.println("Ou seja, aredondando serão necessários " + galoesArredondado + " galões e será pago o valor de: R$ " + galoesArredondado * valorGalao + " no total");

        float folga = (litros * 0.1F);
        float litrosNasLatas = ((folga + litros)/ 18);

        int ipart = Math.toIntExact((long) litrosNasLatas);
        float fpart = litrosNasLatas - ipart;
        double valorTotal = (ipart * valorLata) + valorGalao;
        System.out.println("3- Com essa quantidade de área a ser pintada a melhor compra seria de " + ipart + " Latas de tinta.");
        System.out.println("E como faltam " + fpart + " de litros de tinta para completar a área a ser pintada, sugerimos que compre mais um galão de tinta.");
        System.out.println("Para esta compra, você irá pagar R$" +(ipart * valorLata) + " referente a quantidade de latas de tinta e pagará R$" + (valorGalao) + "pelo galão de tinta");
        System.out.println("Portanto o valor total da compra será de R$" + valorTotal);
    }
}
