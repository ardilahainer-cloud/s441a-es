package Estudiante;

public class EjecutarEstudiante {
    public static void main(String[] args) {
        Estudiante objE = new Estudiante();
        Estudiante[]est=new Estudiante[4];
        est[0]= new Estudiante("luis",3,"Ingieneria Sistema",3.4,34);
        est[1]= new Estudiante("dory",2,"Ingieneria Sistema",3.9,18);
        est[2]= new Estudiante("jaime",5,"Trabajo social",3.5,12);
        est[3]= new Estudiante("adrian",3,"Ingieneria Industrial ",2.5,25);
        
        System.out.println(est[2]);
        System.out.println(est[0].getNombre()+ "   " +est[0].getPrograma());
        
        for (int i=0; i < est.length;i++){
            System.out.println(est[i].getNombre() + "---->"+ est[i].getPrograma());
        }

        double sumaNota=0.0;
        for (int i=0; i < est.length;i++){
          sumaNota +=  est[i].getNotaPromedio();

        }
        System.out.println(sumaNota / est.length);

        int[]edades = new int[est.length];
       
        for (int i = 0; i < edades.length; i++) {
            edades[i] = est[i].getEdad();
        }
 
        //Uso del método calcularEdadPromedio
        System.out.println(objE.calcularEdadPromedio(edades));

     double promedioFiltrado = Estudiante.filtrarEstudiantes(est);
    System.out.println("Promedio de estudiantes filtrados: " + promedioFiltrado);
 

        

    
    }
    
}
