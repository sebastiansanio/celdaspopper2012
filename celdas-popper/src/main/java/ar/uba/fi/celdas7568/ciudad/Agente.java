package ar.uba.fi.celdas7568.ciudad;

import java.util.List;

import ar.uba.fi.celdas7568.ciudad.heuristicas.HeuristicaDeDecision;

import com.google.common.collect.Lists;

public class Agente {
	
	private Personalidad personalidad;
	private HeuristicaDeDecision heuristicaDeDesicion;
	
	public List<Opinion> elegirZona(Ciudad ciudad){
		
		//Zona zonaElegida = null;
		
		//while(zonaElegida == null){
			
			List<Opinion> opiniones = Lists.newArrayList();
			
			for(Zona zona : ciudad){
				Opinion opinionSobreZona = heuristicaDeDesicion.evaluarZona(zona, personalidad);
				opiniones.add(opinionSobreZona);
			}
			
			//zonaElegida = heuristicaDeDesicion.evaluarOpiniones(opiniones, personalidad);
			
			/*if(zonaElegida == null){
				heuristicaDeDesicion.reconsiderarOpiniones(opiniones, personalidad);
			}
		}*/	
		
		return opiniones;		
	}
	
	public Personalidad getPersonalidad() {
		return personalidad;
	}

	public void setPersonalidad(Personalidad personalidad) {
		this.personalidad = personalidad;
	}

	public HeuristicaDeDecision getHeuristicaDeDesicion() {
		return heuristicaDeDesicion;
	}

	public void setHeuristicaDeDesicion(HeuristicaDeDecision heuristicaDeDesicion) {
		this.heuristicaDeDesicion = heuristicaDeDesicion;
	}
}
