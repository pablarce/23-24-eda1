class Ejemplo {
    public static void main(String[] args) {

        List nephews = new List();
        viewLine(nephews);
        System.out.println("Esta vacia? " + nephews.isEmpty());

        nephews.insertEnd("Juanito");
        nephews.insertEnd("Pepito");
        nephews.insertEnd("Anita");

        System.out.println("Esta vacia? " + nephews.isEmpty());

        viewLine(nephews);

        nephews.insertInBetween("Pedrito", 2);
        nephews.deleteInBetween(1);

        nephews.insertFront("Pedrito");
        nephews.insertEnd("Luisito");

        System.out.println("Tamaño: " + nephews.size());

        nephews.delete();
        System.out.println("Tamaño: " + nephews.size());

        viewLine(nephews);
    }

    static void viewLine(List filaDeSobrinos) {
        
        String[] larray = filaDeSobrinos.listAll();
        System.out.println("LA FILA" + "-".repeat(18));
        for (String sobrino : larray){
            System.out.println(sobrino);
        }
        System.out.println("-".repeat(25));
    }
}
 