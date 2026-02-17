package semana2;

public class Ejercicio1 {
    public static void main (String [] args){
       //Forma1 -> Definiendo directamente los valores
        int[] a ={4,8,9,6,1,2,10};
      
        for (int i = 0; i < a.length;i++){
        System.out.println("a["+i+"]="+a[1]);
        }
        
        int pares = 0;
        int impares=0;
        for (int i = 0; i < a.length;i++){
            if (a[i]%2==0){
                pares +=a[i];
            }else{
                    impares +=a[i];
                }
        }
           
            System.out.println("los numeros pares son"+pares);
            System.out.println ("los numeros impares son"+impares);
    }
    
}

