package Entidade;

class Tres{
    private static int metodo( ) {
        int valor=0;
        try{
            valor = valor + 1;
            valor = valor + Integer.parseInt ("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch(NumberFormatException e) {
            valor = valor + Integer.parseInt ("W");
            System.out.println("Valor final del catch: " + valor);
        } finally{
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor) ;
        return valor;
    }
    public static void main (String[] args) {
        try{
            System.out.println(metodo()) ;
        } catch(Exception e) {
            System.err.println("Excepcion en metodo()" ) ;
            e.printStackTrace();
        }
    }
}
/*
    Dado el método metodoC de la clase C, indique:
        a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
        b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
        c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

class C {
    void metodoC() throws TuException{
        sentencia_c1
        try {
            sentencia_c2
            sentencia_c3
        } catch (MioException e){
            sentencia_c4
        } catch (TuException e){
            sentencia_c5
            throw (e)
        }
        finally{
        sentencia_c6
        }
    }
*/
