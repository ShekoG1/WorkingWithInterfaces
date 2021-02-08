/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithinterfaces;

/**
 *
 * @author SHEKHAR
 */

interface mywaterbottle{
String colour = "blue";

void fillup();

}

public class WorkingWithInterfaces implements mywaterbottle{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(colour);
        
        WorkingWithInterfaces a = new WorkingWithInterfaces();
        a.fillup();
    }

    @Override
    public void fillup() {
       System.out.println("It is filled");
    }
    
}
