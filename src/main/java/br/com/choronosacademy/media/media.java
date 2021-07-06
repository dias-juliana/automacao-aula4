package br.com.choronosacademy.media;

public class media {

    public String resultadoMedia(double n1, double n2) {
        double media = (n1+n2)/2;

        if (media < 5){
            return "Reprovado";
        }  // else {return "Aprovado"} não há necessidade do else nesse caso
            return "Aprovado";

    }
}
