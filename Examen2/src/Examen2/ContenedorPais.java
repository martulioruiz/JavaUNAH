
package Examen2;
public class ContenedorPais{

	//Definiendo contenedor de clase Alumno
	public Pais PaisContenedor[] = new Pais[100];
	//metodos de la clase contenedor 
	public void AgregarPais(Pais pais,int posicion){
		if(PaisContenedor[posicion]==null){
			PaisContenedor[posicion]=pais;
		}
	};
	public void EliminarPais(int posicion){
		PaisContenedor[posicion]=null;
	};
        
        public void EliminarPais(String palabra){
            for(int x=0;x<PaisContenedor.length;x++){
                if(PaisContenedor[x].getNombrePais()==palabra){
                    PaisContenedor[x]=null;
                }
            }
        }; 
        
	public void ModificarPais(){
		System.out.println("");
		for(int x=0;x<PaisContenedor.length;x++){
			if(PaisContenedor[x]!=null){	
			System.out.println(x+"\t\t"+PaisContenedor[x].getNombrePais());
			}
		}
	};
        public int ComprobarIdentificadorPais(int identificador){
                        int error=1;
			if(PaisContenedor[identificador]==null){	
                            error=0;
			}
                        return error;
        }

}
