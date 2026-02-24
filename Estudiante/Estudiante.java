package Estudiante;

public class Estudiante {
    private String nombre;
    private int semestre;
    private String programa;
    private double notaPromedio;
    private int edad;



    public Estudiante (String nombre,int semestre,String programa,double notaPromedio,int edad){
        this.nombre=nombre;
        this.semestre=semestre;
        this.programa=programa;
        this.notaPromedio=notaPromedio;
        this.edad=edad;
    }

    public Estudiante(){

    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getSemestre() {
        return semestre;
    }



    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }



    public String getPrograma() {
        return programa;
    }



    public void setPrograma(String programa) {
        this.programa = programa;
    }



    public double getNotaPromedio() {
        return notaPromedio;
    }



    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }



    public int getEdad() {
        return edad;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }


    public double calcularEdadPromedio(int[] e){
        int suma = 0;
        for(int i = 0; i < e.length; i++){
            suma += e[i];
        }
        return suma / e.length;
    }


    
     public String toString(){
        return "Estudiante [nombre=" + nombre + ", semestre=" + semestre + ", programa=" + programa + ", notaPromedio="
                + notaPromedio + ", edad=" + edad + "]";
     }

     public static double filtrarEstudiantes(Estudiante[] est) {

    double suma = 0;

    int contador = 0;

    for (int i = 0; i < est.length; i++) {

        if (est[i].getSemestre() == 3 &&

            est[i].getPrograma().equalsIgnoreCase("Ingieneria Sistema")) {

            System.out.println("Nombre: " + est[i].getNombre() +

                               " | Programa: " + est[i].getPrograma() +

                               " | Promedio: " + est[i].getNotaPromedio());

            suma += est[i].getNotaPromedio();

            contador++;

        }

    }

    if (contador > 0) {

        return suma / contador;

    } else {

        System.out.println("No hay estudiantes que cumplan la condición.");

        return 0;

    }

}
 
    
        

    
    
}
