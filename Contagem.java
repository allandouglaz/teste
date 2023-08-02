package teste;

public class Contagem {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        int cont =0;
        
       // Percorre de acordo com o tamanho do array
        for (int number: numbers) {
            cont++;
        }
        System.out.println(cont);
    }
}