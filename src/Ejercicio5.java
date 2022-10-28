import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen,segundoExamen, examenFinal, notaFinal;

        System.out.println("Escribe la nota de participación: ");
        participacion = entrada.nextFloat();
        System.out.println("Escribe la nota del primer exámen trimestral: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Escribe la nota del segundo exámen trimestral: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Escribe la nota del examen final del tercer trimestre: ");
        examenFinal = entrada.nextFloat();

        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;

        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        System.out.println("\nLa nota final es: " + notaFinal);
    }
}
