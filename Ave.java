/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenherenciapolimorfismo;

/**
 *
 * @author ithzamary.vilchis
 */
public class Ave extends Animal implements Acciones_basicas{
    
    int velocidadVuelo;
    String descripcion;

    @Override
    String haceSonido(String nombreAnimal) {
      
        return "Ave hace sonido y se llama" + nombreAnimal;
    }

    @Override
    int calculaEdadHumana(int edadAnimal) {
       return edadAnimal + 7;
    }

    @Override
    public String comer(String nombreAnimal) {
        return "Ave come y se llama " + nombreAnimal;
    }

    @Override
    public String dormir(String nombreAnimal) {
         return "Ave duerme y se llama " + nombreAnimal;
    }
    
    
    public int velocidadEnVuelo(int tiempoDeVuelo){
        //v=d/t
        // Si recorre 5km
        velocidadVuelo = 0;
        velocidadVuelo = 5/tiempoDeVuelo;
        
        return velocidadVuelo;
    }
    
}
