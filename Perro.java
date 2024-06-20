/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenherenciapolimorfismo;

/**
 *
 * @author ithzamary.vilchis
 */
public class Perro extends Animal implements Acciones_basicas{
    
    String duenio;

    @Override
    String haceSonido(String nombreAnimal) {
        String descripcion = "El perro ladra y se llama" + nombreAnimal + "y su duenio es" + duenio;
        
        return descripcion;
    }

    @Override
    int calculaEdadHumana(int edadAnimal) {
      return 0;
    }

    @Override
    public String comer(String nombreAnimal) {
        return "";
    }

    @Override
    public String dormir(String nombreAnimal) {
      return "";
    }
    
}
