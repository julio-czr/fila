public class Main {
    public static void main(String[] args) {
       // Cria uma fila de inteiros com capacidade 5
       fila<Integer> fila = new fila<>(5);

       // Testa a adição de elementos
       fila.adicionar(10);
       fila.adicionar(20);
       fila.adicionar(30);
       fila.adicionar(40);
       fila.adicionar(50);


       System.out.println("Elementos na fila após adições:");
       for (int i = 0; i < fila.tamanho(); i++) {
           System.out.print(fila.remover() + " ");
       }
       System.out.println();

       // Tenta adicionar um elemento em uma fila cheia (deve lançar exceção)
       try {
           fila.adicionar(60);
       } catch (IllegalStateException e) {
           System.out.println("Exceção esperada ao adicionar em uma fila cheia: " + e.getMessage());
       }

       // Adiciona e remove mais elementos para testar o comportamento circular
       fila.adicionar(60);
       fila.adicionar(70);
       fila.remover();
       fila.adicionar(80);

       System.out.println("Elementos na fila após mais operações:");
       while (!fila.vazia()) {
           System.out.print(fila.remover() + " ");
       }
       System.out.println();

       // Testa a limpeza da fila
       fila.adicionar(90);
       fila.adicionar(100);
       fila.limpar();

       System.out.println("Fila após a limpeza (deve estar vazia):");
       try {
           System.out.println(fila.remover()); // Deve lançar exceção
       } catch (IllegalStateException e) {
           System.out.println("Exceção esperada ao remover de uma fila vazia: " + e.getMessage());
       }
    }
}
