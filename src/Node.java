public class Node {
    Node kiri,kanan;
    int data;

    public Node() {
        this.kiri = null;
        this.kanan = null;
        this.data = 0;
    }

    public Node(int i) {
        this.kiri = null;
        this.kanan = null;
        this.data = i;
    }


    public Node getKiri() {
        return kiri;
    }

    public void setKiri(Node kiri) {
        this.kiri = kiri;
    }

    public Node getKanan() {
        return kanan;
    }

    public void setKanan(Node kanan) {
        this.kanan = kanan;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
