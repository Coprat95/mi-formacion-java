public class ClaseAbstracta {
    // Clase abstracta = plantilla con mochila y herramientas opcionales
    public static abstract class figuraGeometrica {

        abstract void  pintarFigura();

    }
    public static  class rectangulo extends  figuraGeometrica{

        @Override
         void pintarFigura(){
            System.out.println("Pintamos un rectángulo . ");
        }
    }

    public static void main(String[] args) {
        figuraGeometrica rectangulo = new rectangulo();
        rectangulo.pintarFigura();
    }
}
