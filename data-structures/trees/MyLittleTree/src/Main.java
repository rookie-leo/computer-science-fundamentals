import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(buildFromLevelOrder(Arrays.asList(8, 3, 10, 1, 6, 14, 4)));
        System.out.println(buildFromLevelOrder(Arrays.asList(8, 3, 10, 1, 6, 14, 4)));
        System.out.println(buildFromLevelOrder(List.of(8)));
        System.out.println(List.of());
    }

    /**
     * Constroi uma arvore binaria preenchida por niveis, da esquerda
     * para a direita, preservando a ordem e os valores da lista.
     * Lista vazia: retorna null. Duplicatas: preservadas em nos distintos.
     * Precondicao: lista nao nula, sem elementos null.
     * Nao altere a lista recebida. Cada chamada cria seus proprios nos.
     * <p>
     * Antes de implementar, registre sua estrategia, tempo e espaco.
     */
    private static Node buildFromLevelOrder(List<Integer> values) {
        if (values.isEmpty()) return new Node();

        Node root = new Node();
        Queue<Node> queue = new ArrayDeque<>();
        int i = 1;

        root.setValue(values.getFirst());

        queue.add(root);

        while (i < values.size() && !queue.isEmpty()) {
            Node actualNode = queue.remove();

            if (i < values.size()) {
                Node leftNode = new Node();
                leftNode.setValue(values.get(i));
                actualNode.setLeft(leftNode);
                queue.add(leftNode);
                i++;
            }

            if (i < values.size()) {
                Node rightNode = new Node();
                rightNode.setValue(values.get(i));
                actualNode.setRight(rightNode);
                queue.add(rightNode);
                i++;
            }
        }

        return root;
    }
}