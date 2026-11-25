package controllers;

import java.util.List;
import models.Incidente;

public class IncidenteController {
    public List<Incidente> sort(List<Incidente> incidentes) {
        indices.sort(null);
        return incidente;
    }

    public int busquedaBinaria(List<Incidente> incidentes, Incidente objetivo) {
        
        int low = 0;
        int high = incidentes.size()-1;

        while (low<= high) {
            int mid = (high - low) / 2;
            int com = incidentes.get(mid).compareTo(objetivo);
            if(com == 0)
                return mid;
            if(com > 0)
                low = min + 1;
            if(com < 0)
                high = min -1;
        }
        
    }
}
