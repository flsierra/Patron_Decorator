public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a su sistema de cafeteria de confianza");
        // Cafe Simple
        ICafe cafesimple = new CafeSimple();
        System.out.println("El costo del café simple es: $" + cafesimple.cost());
        // Café con leche
        ICafe cafeconLeche = new LecheDecorator(new CafeSimple());
        System.out.println("El costo del café con leche es: $"+cafeconLeche.cost());
        // Café con Azúcar
        ICafe cafeconAzucar = new AzucarDecorator(new CafeSimple());
        System.out.println("El costo del café con Azúcar es: $"+cafeconAzucar.cost());
        // Café con leche y azúcar
        ICafe cafeconLecheyAzucar = new LecheDecorator(new AzucarDecorator(new CafeSimple()));
        System.out.println("El costo del café con leche y azúcar es: $"+cafeconLecheyAzucar.cost());

    }
}