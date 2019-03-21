public class testListe {

    private static liste maListe;

    public static void main(String[] args)
    {
        maListe = new liste();

        maListe.add( 1 );
        maListe.add( 5 );
        maListe.add( 12 );
        maListe.add( 6 );
        maListe.add( 50 );
        maListe.insertInFirstPlace( 456 );
        maListe.add( 64 );
        maListe.add( 50 );
        maListe.insertInFirstPlace( 128 );

        System.out.println( "La liste contient " + maListe.size() + " valeurs : " + maListe.toString() );

        maListe.remove( 50 );
        System.out.println( "La liste contient " + maListe.size() + " valeurs : " + maListe.toString() );
    }
}