
/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Este es un ejemplo de clase que representa un dragón.
 * Contiene atributos como edad, nombre, color y capacidad de vuelo,
 * así como métodos para establecer y obtener estos atributos.
 */
package dragoncomentado;

/**
 *
 *Clase que representa un dragón con atributos como edad, nombre, color y capacidad de vuelo.
 * 
 *@version 1.0
 * @author LUIS
 */
public class DragonComentado {
    

   /**
    * Atributos de la clase: edad, nombre, color, si vuela o no.
    */
    private int edad;
    private String nombre;
    private String color;
    private boolean vuela;
    
    

    /**
     * Constructor de la clase, inicializa la edad en 0 y la capacidad de vuelo
     * en falso.
     */
    public DragonComentado()
    {
       edad= 0;
       vuela=false;
       
    }
    /**
    *  Constructor para objetos de la clase DragonComentario
    * @param edad La edad del dragón
    * @param nombre El nombre del dragón
    * @param color El color del dragón
    * @param vuela Indica si el dragón puede volar o no
    */
    
    public DragonComentado(int edad, String nombre, String color, boolean vuela){
        this.edad=edad;
        this.nombre=nombre;
        this.color=color;
        this.vuela=vuela;
    }
    /**
     * Método reestableces la Edad.
     * @param edad La edad del dragón
     */
    public void setEdad(int edad){
        this.edad=edad;
    }
   /**
    * Método reestableces el Nombre.
    * @param nombre El nombre del dragón
    */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
   /**
    * Método reestableces el Color.
    * @param color El color del dragón
    */
    public void setColor(String color){
     this.color = color;
    
    }
    /**
     * Método reestableces si vuela o no.
     * @param vuela Indica si el dragón puede volar o no
     */
    public void setVuela(boolean vuela){
        this.vuela=vuela;
    }
    
   /**
    * Método devuelve Edad.
    * @return La edad del dragón
    */
    public int getEdad(){
        return edad;
    }
    /**
     * Método devuelve Nombre.
     * @return El nombre del dragón
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Método devuelve Color.
     * @return El color del dragón
     */
    public String getColor(){
        return color;
    }
    /**
     * Método devuelve si vuela o no.
     * @return Indica si el dragón puede volar o no
     */   
    public boolean getVuela(){
        return vuela;
    }
    
    /**
     * Método que devuelve una descripción del dragón.
     * @return Una cadena que describe la edad, nombre, color y capacidad de vuelo del dragón.
     */   
    public  String toString(){
    
        return "Edad "+ edad+ " nombre "+ nombre + 
        " color " + color + " " + (vuela?"vuela":"no vuela");
    
    }
    /**
     * Método que devuelve lo que el dragón puede escupir según su color.
     * @return Una cadena que describe lo que el dragón puede escupir.
     */
    public  String  escupir(){
    
        switch( color.toLowerCase()){
           case "verde":
               return "Flores";
           case "violeta":
               return "vino";
           case "rojo":
               return "lava";
           case "azul":
               return "agua";
           case "naranja":
               return "petardos";
           default :
               return "kk";
        
        }
    }
}
    