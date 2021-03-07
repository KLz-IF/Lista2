pacote  Ex6 ;

import  java.util.Iterator ;
import  java.util.LinkedList ;

public  class  Ex4 {
    public  static  void  main ( String [] args ) {
        LinkedList l1 =  nova  LinkedList ();
        Inteiro x =  0 ;
        Inteiro y =  0 ;

        l1 . adicione ( 3 );
        l1 . add ( 38 );
        l1 . adicione ( 21 );
        l1 . add ( 59 );
        l1 . add ( 49 );
        l1 . adicione ( 13 );
        l1 . add ( 24 );
        l1 . add ( 36 );
        
        Iterador i = l1 . iterador ();
        while (i . hasNext ()) {
            y = ( inteiro ) i . Próximo();
            if (x < y) {
                x = y;
            }
        }
        Sistema . para fora . println (x);
    }
}
