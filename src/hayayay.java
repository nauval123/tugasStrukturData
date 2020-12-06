public class hayayay {
    public static void main(String[] args) {
    linkedList2 list = new linkedList2();
    linkedList2 list2 = new linkedList2();

        list2.insert(list2, 1);
//        System.out.println(list.getHead().getData());
        list2.insert(list2, 3);
        list2.insert(list2, 8);
        list2.insert(list2, 2);
        list2.insert(list2, 5);
        list2.insert(list2, 9);
        list2.insert(list2, 10);
        list2.insert(list2, 8);
//        list2.printList(list2);
//        list2.balikArah(list2);

//        list2.belah(list2);


        list.insert(list, 2);
////        System.out.println(list.getHead().getData());
        list.insert(list, 3);
        list.insert(list, 1);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);
        list.insert(list, 7);
        list.insert(list, 8);
        list.printList(list);
        list2.printList(list2);
        list.gabungin(list,list2);

//        System.out.println(list.count(list));
//        list.jumlahkan(list);
//        list.gabungin(list,list2);
//        list.belah(list);
//        list.printList(list);
//        list.balikArah(list);
//

    }
}
