package Examen2;
public class ContenedorVinculacion{

	//Definiendo contenedor de clase Alumno
	public Vinculacion VinculacionContenedor[] = new Vinculacion[100];
	//metodos de la clase contenedor 
	public void AgregarViculacion(Vinculacion vinculacion,int posicion){
		if(VinculacionContenedor[posicion]==null){
			VinculacionContenedor[posicion]=vinculacion;
		}
	};
	public void EliminarVinculacion(int posicion){
		VinculacionContenedor[posicion]=null;
	};
        
	public void EnlistarVinculacion(){
		System.out.println("");
		for(int x=0;x<VinculacionContenedor.length;x++){
			if(VinculacionContenedor[x]!=null){	
			System.out.println(x+"\t\t"+VinculacionContenedor[x].getIdentificadorVinculacion());
			}
		}
	};

}

