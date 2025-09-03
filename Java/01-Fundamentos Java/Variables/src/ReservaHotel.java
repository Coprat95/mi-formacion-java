public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Detalle de una reserva de hotel ***");
        // Asignación valores iniciales  , habitación estandar
        var nombreCliente = "Juan Perez";
        System.out.println("nombreCliente = " + nombreCliente);
        var diasEstancia = 3;
        System.out.println("diasEstancia = " + diasEstancia);
        var TarifaDiaria = 45.00;
        System.out.println("TarifaDiaria = " + TarifaDiaria);
        var vistasMar = false;
        System.out.println("vistasMar = " + vistasMar);
        //Modificación de valores , habitación premium

        System.out.println("Modificación a habitación premium .");
        nombreCliente = "Juan Perez";
        System.out.println("nombreCliente = " + nombreCliente);
        diasEstancia = 3;
        System.out.println("diasEstancia = " + diasEstancia);
        TarifaDiaria = 70.00;
        System.out.println("TarifaDiaria = " + TarifaDiaria);
        vistasMar = true;
        System.out.println("vistasMar = " + vistasMar);

    }
}
