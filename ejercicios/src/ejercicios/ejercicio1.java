package ejercicios;

public class ejercicio1 {
    public static void main(String[] args) {
        int cantidadAlumnos = 30;
        int cantidadBancos = 40;
        int bancosSobrantes = cantidadBancos - cantidadAlumnos;
        if(cantidadBancos>=cantidadAlumnos){
           System.out.println("Los bancos alcanzan.Sobran " + bancosSobrantes);
        }
        else{
             System.out.println("Faltan bancos");
        }
    }
}    