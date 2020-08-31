/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo1;
import java.util.Scanner; 
import javax.swing.JOptionPane;


/**
 *
 * @author Berny
 */
public class HolaMundo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { ///MOSTRAR EN PANTALLA
        //System.out.println("Hola Mundo");
        //System.out.println("Curso Java");
        
    ///TIPO DE VARIABLES / DATOS PRIMITIVOS
    /**
    VARIABLES ENTERAS:
    long --> 64bits(tamaño) de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
    int --> 32bits(tamaño) de -2,147,483,648 a 2,147,483,647
    short --> 16bits (tamaño) de -32,768 a 32,767
    byte --> 8bits (tamaño) de -128 a 127
    
    VARIABLES FLOTANTES/DECIMALES:
    float --> 32bits (tamaño) de 1.4e-045 a 3.4e+038
    double--> 64bits (tamaño) de 4.9e-324 a 1.8e+308
    
    **/
    /**
        byte entero = 12;
        //Ó -> entero = 12;
        
       ///Escribiendo "sout" + TAB, autocompleta el print.
        System.out.println("Numero entero tipo Byte: " +entero); ///Imprimiendo el "entero".
     
        short entero1 = 12456;
        System.out.println("Numero entero tipo Short: " +entero1);
        
        int entero2 = 1245656;
        System.out.println("Numero entero tipo Int: " +entero2);
        
        long entero3 = 12148468;
        System.out.println("Numero entero tipo Long: " +entero3);
        
        float decimal = 3.45f; ///Se debe colocar el "f" al final de la asignación. Caso contrario, se tomará como error.
        System.out.println("Numero decimal tipo Float: " +decimal);
        
        double decimal2 = 3.456484; ///No es necesario colocar nada detrás de la asignación cuando se trata de un Double.
        System.out.println("Numero decimal tipo Double: " +decimal2);
        
        char caracter = 'a';
        System.out.println("Caracter: " +caracter);
        
        boolean decision = true; ///True o False.
        
        System.out.println("La decision es: " +decision);
    **/
        
        /**TIPO DE DATOS NO PRIMITIVOS**/
    /**    
        ///Integer
        Integer numero = null; ///Para asignar null, se debe escribir el tipo de variable Integer, distinto a Int.
        System.out.println("El numero es: "+numero);
       
        ///CADENAS
        String palabra = "Hola que tal?";
        System.out.println(palabra);
    **/  
         
        /**CONSTANTES**/
     /**   
        final int numero = 10; ///Al declarar "final" a la variable "numero" deja en claro que es una constante. Imposibilitando 
                               ///una nueva asignación en esa misma variable.
        //numero = 15; //No será posible, ya que "numero" es una constante.
        System.out.println("Numero constante: "+numero);
      
        
        /**ENTRADA DE DATOS**/
        ///GUARDAR NUMEROS
       /** 
        Scanner entrada = new Scanner(System.in); ///Para que funcione el Scanner, se debe importar su biblioteca.
        //int numero;
        float numero;
        //double numero;
        
        System.out.println("Ingrese un numero: ");
        //numero = entrada.nextInt(); ///Se guarda el valor entero, en la variable numero.
        //numero = entrada.nextFloat(); ///Se guarda el valor flotante, en la variable numero. Se debe ingresar el numero con "," y no con ".".
        //numero = entrada.nextDouble(); //Se guarda el valor double, en la variable numero.
        System.out.println("El numero es: " +numero);
     **/   
        
        //GUARDAR CADENAS
    /**   
        Scanner entrada2 = new Scanner(System.in);
        String cadena; 
        
        System.out.println("Ingrese una cadena: ");
        cadena = entrada2.next(); ///El "next()" guarda la cadena hasta que encuentre un espacio, lo demás no lo guarda. 
        cadena = entrada2.nextLine(); ///Se utiliza el "nextLine()" para guardar una cadena con espacios.
        
        System.out.println("La cadena es: " +cadena);
    **/
        ///GUARDAR CARACTER
    /**    
        Scanner entrada3 = new Scanner(System.in);
        char letra;
        
        System.out.println("Ingrese una letra: ");
        letra = entrada3.next().charAt(0); ///el "charAt(0)" guarda el primer caracter que lea en la variable "letra".
        
        System.out.println("La letra es: " +letra);
    **/    
        
    /**    
        String cadena;
        int entero;
        char letra;
        float decimal;
        
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: "); //Lo que se escriba dentro del JOptionPane se guarda en la variable "cadena".
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: ")); //Para una variable entera hay que guardar en un parseInt, y dentro meter el JOptionPane.
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0); //Se agregar el charAt(0) al final.
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un decimal:")); //Se aplica lo mismo que en el caso de la variable entera.
        //El ingreso de una variable flotante a través de JOptionPane se debe colocar el ".", y no ",".
        ///Se muestra los valores a través de JOptionPane.
        JOptionPane.showMessageDialog(null, "La cadena es: " +cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: " +entero);
        JOptionPane.showMessageDialog(null, "El caracter es: " +letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " +decimal); 
    **/    
        
        /**OPERADORES ARITMETICOS**/
        /**
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2, suma, resta, mult, div, resto;
        
        System.out.println("Ingrese 2 numeros: ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La division es: "+div);
        System.out.println("El resto es: "+resto);
        **/
        
        /**COMBINADOS CON ASIGNACION**/
    /**    
        int numero = 0;
        
        numero += 5;//numero = numero +5;
        numero -= 5;
        numero /= 5;
        numero %= 5;
        
        System.out.println("El numero es: "+numero);
    **/    
        /**OPERADOR DE INCREMENTO Y DECREMENTO**/
    /**    
        int x = 5, y;
        //x ++; //x += 1;
        //x --: //x -= 1;
        
        y = x++; //y se le asigna x, y luego x incrementa. Por precedencia de operadores.
        
       //La forma correcta sería:
       //y = ++x; //Aumenta x, y luego se lo asigna a y.
       //y = --x; //Disminuye x, y luego se lo asigna a y.
          
        System.out.println("Y vale: "+y);
        System.out.println("X vale: "+x);
    **/
        
        /**CLASE MATH**/
        //Metodo RAIZ CUADRADA
    /*    
        //double raiz = Math.sqrt(36.6); //Se debe ingresar un double y retorna un double. Si ingreso un int, saltará error.
        int raiz = Math.sqrt(2); //Esta opcion sirve para ingresar un int.
         System.out.println(raiz);
     **/   
        /**
        //Metodo BASE ELEVADA A CIERTO EXPONENTE:
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
         System.out.println(resultado);
         
        //Metodo ROUND (Redondeo)
        //Primera manera:
        double numero = 4.56;
        long resultado2 = Math.round(numero); //Se ingresa una variable double y retorna un long.
        System.out.println(resultado2);
        //Segunda manera:
        float numero2 = 4.56f;
        int resultado3 = Math.round(numero2); //Se ingresa una variable float y retorna un int.
        System.out.println(resultado3);
    **/  
        //Metodo RANDOM
        /**
        float numero3 = Math.round((Math.random())); //Generará un numero random por cada ejecución.
        System.out.println(numero3);
        **/
      
        
        
    }
    
}
