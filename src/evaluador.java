import java.util.Scanner;

public class evaluador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int calificacion1; //variables
            System.out.print("Ingresa calificación de la primera materia: ");
            calificacion1 = scanner.nextInt();

            int calificacion2;
            System.out.print("Ingresa calificación de la segunda materia: ");
            calificacion2 = scanner.nextInt();

            int calificacion3;
            System.out.print("Ingresa calificación de la tercera materia: ");
            calificacion3 = scanner.nextInt();

        evaluarCalificacion(calificacion1, "primera");
        evaluarCalificacion(calificacion2, "segunda");
        evaluarCalificacion(calificacion3, "tercera");
    }

    public static void evaluarCalificacion(int calificacion, String materia) { //asignacion puntajes
        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación inválida para la " + materia + " materia.");
        } else if (calificacion <= 3) {
            System.out.println("Calificación en la " + materia + " materia: No Aprobado");
        } else if (calificacion > 3 && calificacion <= 5) {
            System.out.println("Calificación en la " + materia + " materia: Insuficiente");
        } else if (calificacion >= 6 && calificacion <= 8) {
            System.out.println("Calificación en la " + materia + " materia: Aceptable");
        } else if(calificacion >= 9) {
            System.out.println("Calificación en la " + materia + " materia: Excelente");
        }
    }
}
