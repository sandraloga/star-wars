
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void generateStarWarsName(String nombre,String apellido,String apellidoMadre,String ciudad)
    {
        final int ZERO = 0;
        final int DOS =2;
        final int TRES = 3;
        String subnombre = nombre.substring(0,3);
        String subapellido = apellido.substring(0,3);
        String subapellidoMadre = apellidoMadre.substring(0,2);
        String subciudad = ciudad.substring(0,3);

        System.out.println(subapellido+subnombre +" "+subapellidoMadre+subciudad);
    }
}
