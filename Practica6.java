import java.util.*;

public class Practica6 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int menores25=0;
    int sumamenores=0;
    int mayores25=0;
    int sumaMayores=0;
    int edad;
    for (int k=1;k<=100;k++){
        System.out.println("Ingrese su edad, persona No."+k);
        edad=scanner.nextInt();
        if (edad>=25){
            sumaMayores+=edad;
            mayores25+=1;
        }else{
            sumamenores+=edad;
            menores25+=1;
        }
    }
    int promMayores=sumaMayores/mayores25;
    int promMenores=sumamenores/menores25;
    System.out.println("El promedio de las personas mayores o iguales a 25 años es de "+promMayores);
    System.out.println("El promedio de las personas menores a 25 años es de "+promMenores);
}
}