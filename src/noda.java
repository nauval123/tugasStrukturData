public class noda {
  private int data;
  private noda next;

    public noda(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public noda getNext() {
        return next;
    }

    public void setNext(noda next) {
        this.next = next;
    }
}
