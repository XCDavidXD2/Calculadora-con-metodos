import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Programa();
    }
    public static void Programa(){
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("Introduce la operacion que quieres hacer:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = leer.nextInt();
        Operacion(opcion);
    }
    public static void Operacion(int opcion){
        Scanner leer = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String respuesta;
        String si = "S";
        String no = "N";
        switch (opcion){
            case 1:
                System.out.println("Introduce el primer numero: ");
                num1 = leer.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = leer.nextDouble();
                leer.nextLine();
                System.out.println("Respuesta: " + (num1 + num2));
                System.out.println("Desea realizar otra operacion? (S/N)");
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase(si)){
                    Programa();
                } else {
                    System.out.println("Saliendo del programa...");
                }
                break;
            case 2:
                System.out.println("Introduce el primer numero: ");
                num1 = leer.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = leer.nextDouble();
                leer.nextLine();
                System.out.println("Respuesta: " + (num1 - num2));
                System.out.println("Desea realizar otra operacion? (S/N)");
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase(si)){
                    Programa();
                }else {
                    System.out.println("Saliendo del programa...");
                }
                break;
            case 3:
                System.out.println("Introduce el primer numero: ");
                num1 = leer.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = leer.nextDouble();
                leer.nextLine();
                System.out.println("Respuesta: " + (num1 * num2));
                System.out.println("Desea realizar otra operacion? (S/N)");
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase(si)){
                    Programa();
                }else {
                    System.out.println("Saliendo del programa...");
                }
                break;
            case 4:
                System.out.println("Introduce el primer numero: ");
                num1 = leer.nextDouble();
                System.out.println("Introduce el segundo numero: ");
                num2 = leer.nextDouble();
                leer.nextLine();
                System.out.println("Respuesta: " + (num1 / num2));
                System.out.println("Desea realizar otra operacion? (S/N)");
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase(si)){
                    Programa();
                }else {
                    System.out.println("Saliendo del programa...");
                }
                break;
        }
    }
}