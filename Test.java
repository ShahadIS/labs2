import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        LinkedPositionalList<Integer>l= new LinkedPositionalList<>();
        Posotion<Integer>p1=  l.addFirst(11);
        Posotion<Integer>p2=  l.addLast(15);
        Posotion<Integer>p3=  l.addAfter(p1,12);
        Posotion<Integer>p4=  l.addBefore(p2,14);
//        System.out.println(p1.getElement());
//        System.out.println(p2.getElement());
//        System.out.println(p3.getElement());
//        System.out.println(p4.getElement());
        
        Iterable<Posotion<Integer>>pos=l.Posotions();
        Iterator<Posotion<Integer>>Positer=pos.iterator();
        while (Positer.hasNext())
            System.out.println(Positer.next().getElement());



    }
}


