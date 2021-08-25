package br.com.zup;

import java.util.Scanner;

public class exercicioComplementar1 {
    public static void main(String[] args) {
        Scanner obj_leitor = new Scanner(System.in);
        System.out.println("Por favor digite o peso dos peixes: ");
        float pescado = obj_leitor.nextFloat();

        float pesoMaximo = 50;
        float valorMulta = 4;

        float pesoExtra = (pescado - pesoMaximo);
        float multa = (pesoExtra * valorMulta);

        System.out.println("O peso total pescado foi de " + pescado + "Kg portanto o peso extra foi de " + pesoExtra + "Kg o que resulta em uma multa de R$" + multa + " a ser paga");
    }
}
