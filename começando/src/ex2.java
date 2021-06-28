/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samue
 */
import java.util.Scanner;
public class ex2 {
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        String sexo;
        float altura, peso_ideal;
        System.out.print("informe m-masculino ou f-feminino");
        sexo=teclado.next();
        System.out.print("informe a altura: ");
        altura=teclado.nextFloat();
        if(sexo.equals("m")){
            peso_ideal=72.7f*altura-58;
        }
        else{
            peso_ideal=62.1f*altura-44.7f;;
        }
        System.out.println("Peso ideal: "+peso_ideal);
    }
}
