package gabi;

public class Ejercicio1 {                      //NOMBRE DE LA CLASE
public static void main(String[] args) {        //METODO PUBLICO ESTATICO (NO DEVUELVE NADA)
	int numeroInicio=6;                    //DECLARO LAS VARIABLES
	int numeroFin=17;
	
	int contador=numeroInicio;            //INICIALIZO CONTADOR
	
	while(contador<=numeroFin) {          //MIENTRAS
		System.out.println(contador);     //IMPRIME
		contador=contador+1;              //INCREMENTA
		
	}
	
	int numero=8;
	if(numero%2==0) {                              //RESTO DE LA DIVISION=0 ENTONCES EL NUMERO ES PAR
		System.out.println("el numero es par");
	}
	
	else {                                          //DE LO CONTRARIO
		System.out.println("el numero es impar");
	}
	
	}
}

