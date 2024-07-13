public class NotasCurso {

    public static void main(String[] args) {
        /*Ejercicio 3: Notas de un curso.
Crea un programa que calcula la calificación promedio que se necesita
obtener en las notas faltantes de un curso para aprobarlo,
considerando la cantidad de calificaciones totales, las calificaciones ya
obtenidas, el puntaje mínimo requerido para aprobar y la cantidad de
notas faltantes. Importante: el total de notas del curso será de 8 notas,
la calificación será de 0 a 100 y el promedio mínimo para aprobar el
curso es de 76*/

    double [] scoresObtained = {70,75,60,56,42};
    int missingScores = 8 - scoresObtained.length;
    int totalScores = 8;
    int averageScores = 76;
    int sumaScores = 0;

    for(double i:scoresObtained){
        sumaScores +=i;
    }
    double average = sumaScores / scoresObtained.length;
    double sumaToAprove = averageScores * totalScores - sumaScores;
    double promedioNecesario = sumaToAprove / missingScores;

        System.out.println("Promedio actual: " + average);
        System.out.println("Promedio necesario en las notas faltantes: " + promedioNecesario);

    }
}
