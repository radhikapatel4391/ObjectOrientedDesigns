public class Main {
    public static void main( String[] args ) {
        Composite firstRow  = new Row( 1 );
        Composite secondColumn = new Column( 2 );
        Composite thirdColumn  = new Column( 3 );
        Composite fourthRow = new Row( 4 );
        Composite fifthRow  = new Row( 5 );
        firstRow.add(secondColumn);
        firstRow.add(thirdColumn);
        thirdColumn.add(fourthRow);
        thirdColumn.add(fifthRow);
        
        firstRow.add(new Primitive(6));
        secondColumn.add(new Primitive(7));
        thirdColumn.add(new Primitive(8));
        fourthRow.add(new Primitive(9));
        fifthRow.add(new Primitive(10));
        firstRow.traverse();
        /*
         Row1
         	-6
         	-col2
         		-7
         	-col3
         		-8
         		-Row4
         			-9
         		-Row5
         			-10
         */
        
       
    }
}
/*
Compose objects into tree structures to represent whole-part hierarchies.
Composite lets clients treat individual objects and compositions of objects uniformly.
Recursive composition “Directories contain entries, each of which could be a directory.”
1-to-many “has a” up the “is a” hierarchy
 */