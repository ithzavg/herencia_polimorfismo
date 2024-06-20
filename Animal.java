/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenherenciapolimorfismo;

/**
 *
 * @author ithzamary.vilchis
 */
abstract class Animal {
    
    private  String color;
    private  String tamanio;
    private  String peso;
    
    
    abstract String haceSonido( String nombreAnimal);
    abstract int calculaEdadHumana (int edadAnimal);
    
}
