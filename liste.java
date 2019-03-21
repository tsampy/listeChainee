public class liste {

 // variables privées -----------------------------------------------------------------------------

    private maillon elements;

 // constructeurs ---------------------------------------------------------------------------------

    liste()
    {
        elements = null;
    }

    liste( int valeur )
    {
        elements = new maillon( valeur );
    }

    liste( maillon elements)
    {
        setElements(elements);
    }

 // méthodes --------------------------------------------------------------------------------------

    public void add( int valeur )
    {
        if ( elements == null )
            elements = new maillon( valeur );
        else elements.add( valeur );
    }

    public maillon getElements()
    {
        return elements;
    }

    public int getFirstValue()
    {
        return elements.getValue();
    }

    public maillon getLast()
    {
        maillon current = elements;

        if ( current != null )
            while (current.next() != null)
                current = current.next();

        return current;
    }

    public int getLastValue()
    {
        return elements.getLastValue();
    }

    public void insertInFirstPlace( int valeur )
    {
        maillon ancien = elements;
        elements = new maillon(valeur, ancien);
    }

    public boolean isEmpty()
    {
        return ( elements == null );
    }

    public void remove( int valeur )
    {
        if ( elements != null)
            if ( elements.getValue() == valeur )
                elements = elements.next();
            else elements.remove( valeur );
    }

    public void setElements(maillon elements)
    {
        this.elements = elements;
    }

    public int size()
    {
        return ( elements != null ? elements.size() : 0 );
    }

    public String toString()
    {
        return ( elements != null ? elements.toString() : "" );
    }
}