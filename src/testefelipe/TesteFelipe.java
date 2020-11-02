/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefelipe;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class TesteFelipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path caminho = Paths.get("C:\\Users\\feban\\Documents\\NetBeansProjects\\TesteFelipe\\Log.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            System.out.println(leitura);
                        
        } catch(Exception erro){
            
        }
    }
}

    