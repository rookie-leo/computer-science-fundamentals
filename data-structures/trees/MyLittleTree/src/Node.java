/**
 * Implemente a representacao do no: valor, filho esquerdo e filho direito.
 * Os testes utilizam somente os metodos abaixo. Construtores e metodos
 * de alteracao ficam a sua escolha. Nao ha implementacao fornecida aqui.
 */
public class Node {

    private int value;
    private Node left;
    private Node right;

    public Node(){};

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return this.value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
