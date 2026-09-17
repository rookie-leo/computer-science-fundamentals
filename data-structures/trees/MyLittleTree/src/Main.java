import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(buildFromLevelOrder(Arrays.asList(8, 3, 10, 1, 6, 14, 4)));
        buildFromLevelOrder(Arrays.asList(8, 3, 10, 1, 6, 14, 4));
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
        if (values.isEmpty()) return null;

        Node root = new Node();
        List<Node> nodes = new ArrayList<>();
//        root.setValue(values.getFirst());
        int i = 0;

        while (i < values.size()) {
            Node actualRoot = new Node();
            Node left = new Node();
            Node right = new Node();

            if (i == 0) {
                root.setValue(values.get(i));//8
                actualRoot.setValue(values.get(i));//8
                i++;
                left.setValue(values.get(i));//3
                i++;
                right.setValue(values.get(i));//10
                i++;

                actualRoot.setLeft(left);
                actualRoot.setRight(right);
                root.setLeft(actualRoot);
            }

            actualRoot.setValue(values.get(i));

            for (; i < values.size(); i++) {
                if (i % 2 == 0) {
                    left.setValue(values.get(i));
                    i++;
                } else {
                    right.setValue(values.get(i));
                    i++;
                }
            }

            actualRoot.setLeft(left);
            actualRoot.setRight(right);
            root.setLeft(actualRoot);
        }

        System.out.println(root);

        return root;
    }
}