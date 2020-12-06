import java.util.Scanner;

public class merge {
    linkedList2 a,b;
    nope2 head1,head2,tail1,tail2;



    public  merge(linkedList2 c, linkedList2 d){
        this.a=c;
        this.b=d;
        System.out.println("posisi 1.L1L2 atau 2.L2L1? ");
        Scanner sc = new Scanner(System.in);
        int pilihan= sc.nextInt();
        if(pilihan == 1){
          a.gabungin(c,d);
        }else {
            b.gabungin(d,c);
        }
    }

    public  void printList(linkedList2 list)
    {
        nope2 current = list.head;

        System.out.print("LinkedList: ");

        while (current != null) {
            System.out.print(current.data + " ");

            // Go to next node
            current = current.next;
        }
    }
}
