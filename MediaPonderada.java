package teste;

import java.util.List;
class Objeto {
    double nota;
    double peso;
    Objeto(double nota, double peso) {
        this.nota = nota;
        this.peso = peso;
    }
    public double getNota() {
        return nota;
    }
    public double getPeso() {
        return peso;
    }
}
class Calculadora{
    public double mediaPonderada(List<Objeto> objetos){
        if (objetos == null || objetos.isEmpty()) {
            return 0.0;
        }
        double mediaPonderada = 0;
        double pesosAux = 0;
        double notasPonderadaAux = 0;

        for (Objeto objeto : objetos) {
            if (objeto.peso > 0) {
                pesosAux += objeto.peso;
                notasPonderadaAux += (objeto.nota * objeto.peso);
            } else {
                throw new IllegalArgumentException("todos os valores de peso precisam ser maior que zero.");
            }
        }
        mediaPonderada = notasPonderadaAux / pesosAux;
        return mediaPonderada;
    }
}
public class MediaPonderada {
    public static void main(String[] args) {
        List<Objeto> objetos = List.of(
                new Objeto(7.0, 6.0),
                new Objeto(10.0, 5.0),
                new Objeto(3.5, 10.0),
                new Objeto(5.0, 10.0)
        );

        try {
            double media = new Calculadora().mediaPonderada(objetos);
            System.out.println("Resultado da média ponderada: " + media);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}