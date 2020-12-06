import java.util.Scanner;

public class linkedList2 {

    nope2 head;


    public  linkedList2 insert(linkedList2 list, int data)
    {
        nope2 baru = new nope2(data);
        baru.next = null;

         if (list.head == null) {
            list.head = baru;
        }
        else {
          nope2 tail = list.head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = baru;
        }
        int jumlah=list.count(list);
        for(int i =0 ; i < jumlah ; i ++ ){
            nope2 til = list.head;
            while (til.next!=null){
                if(til.data > til.next.data){
                    int sement2= til.data;
                    til.data=til.next.data;
                    til.next.data=sement2;
                }
                til=til.next;
            }
        }
        return list;
    }

    public int count(linkedList2 list){
        nope2 curr= list.head;
        int count=1;
        while(curr.next!=null){
             count+=1;
             curr=curr.next;
        }
//        System.out.println("jumlah node ada :"+count);
        return count;
    }

    public void jumlahkan(linkedList2 list){
        nope2 curr= list.head;
        int count=0;
        while(curr!=null){
            count+=curr.data;
            curr=curr.next;
        }
        System.out.println("jumlah total adalah :"+count);
    }

    public void balikArah(linkedList2 list){
        nope2 next,prev = null;
        nope2 current=list.head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head=prev;
        printList(list);
    }

    public void belah(linkedList2 list){
        int count=0;
        count(list);
        linkedList2 list2 = null;
        System.out.println("ingin dibelah di dibagian ke berapa?");
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        nope2 curr= list.head;
        while(curr.next!=null){
            if(count==b){
                list2 = new linkedList2();
                 nope2 curr2= curr;
//                list2.head=curr;
//                list2.count(list2);
                while(curr2.next!=null){
                    list2.insert(list2,curr2.next.data);
                    curr2=curr2.next;
                }
                curr.next=null;
                break;
            }
            count+=1;
            curr=curr.next;
        }
        printList(list);
        printList(list2);
    }

    public void gabungin(linkedList2 list1,linkedList2 list2){
        System.out.println("posisi 1.L1L2 atau 2.L2L1? ");
        Scanner sc = new Scanner(System.in);
        int pilihan= sc.nextInt();
        if(pilihan == 1){
            nope2 curr = list1.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next=list2.head;
            printList(list1);

        }else {
            nope2 curr2 = list2.head;
//            System.out.println(curr2);
            while (curr2.next != null){
                curr2=curr2.next;
            }
            curr2.next=list1.head;
            printList(list2);

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

