/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
 * @author Vicente Alarcón González 53205278E
 * @version 1.0
 */
public class VicenteAG_53205278E {
    static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;

/**
 * Constructor con tres parámetros
 * @param nombreCompleto nombre completo en mayúsculas
 * @param dni documento nacional de identidad con letra y sin espacios.
 */
public VicenteAG_53205278E(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
/**
 * calcula el salario bruto mesual en función del salario base por hora y las horas extras.
 * El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA.
 * @param horasExtra número de horas extra dedicadas redondeado a la baja
 * @return salarioFinal devuelve el salario bruto mensual en euros con dos decimales.
 */
public double getSalarioEsteMes(int horasExtra) {
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
VicenteAG_53205278E emp = new VicenteAG_53205278E("VICENTE ALARCON",
"53205278E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes sera de " + emp.getSalarioEsteMes(horasExtra)
+ " euros, al hacer " + horasExtra + " horas extra.");
}
    
}

