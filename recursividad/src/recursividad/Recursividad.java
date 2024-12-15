    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;


public class Recursividad {
    public static int funcion(int a){
        if (a <= 0){
            return 0;
        }
        System.out.println(a);
        return funcion (a-1);
    }
    public static void main(String[] args) {
        System.out.println(funcion(100));
        
    }
    
}

