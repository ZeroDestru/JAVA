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
public class ex1 {
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        float p_custo, p_venda;
        System.out.print("informe o preço de custo: ");
        p_custo=teclado.nextFloat();
        p_venda=p_custo + p_custo*0.12f + p_custo*0.2695f;
        System.out.println("Preço de venda do produto R$ " + p_venda);
    }
    
}
