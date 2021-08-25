package br.com.zup;

public class exercicioComplementar2 {
    public static void main(String[] args) {
        float area = 354.58F;
        float litros = (area / 6);
        float latas = litros / 18;
        System.out.println("A quantidade de latas necessárias para pintar a área de " + area + " m2 será de " + latas + "latas");
        float galoes = litros /3.6F;
        System.out.println("A quantidade de galões necessários para pintar a área de " + area + " m2 será de " + galoes + "galões");
        float folga = (litros * 0.1F);
        float litrosNasLatas = ((folga + litros)/ 18);
        int ipart = Math.toIntExact((long) litrosNasLatas);
        float fpart = litrosNasLatas - ipart;
        System.out.println("Com essa quantidade de área a ser pintada a melhor compra seria de " + ipart + " Latas de tinta.");
        System.out.println("E como faltam " + fpart + " de litros de tinta para completar a área a ser pintada, sugerimos que compre mais um galão de tinta.");

    }
}
