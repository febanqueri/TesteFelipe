package testefelipe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.Pilotos;
import java.util.ArrayList;
import java.util.List;

public class TesteFelipe {

    public static void main(String[] args) {

        String path = "C:\\Users\\feban\\Documents\\NetBeansProjects\\TesteFelipe\\Log.txt";
        
        List<Pilotos> list = new ArrayList<Pilotos>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); //descartando primeira linha
            line = br.readLine();
            while (line != null) {
                String[] vetor = line.split("\\t"); //seperar pelo TAB
                Double hour;
                hour = Double.valueOf(vetor[0]);
                String name = vetor[1];
                Integer lap = Integer.parseInt(vetor[2]);
                float timelap = Float.parseFloat(vetor[3]);
                float speed = Float.parseFloat(vetor[4]);
                
                Pilotos pilot = new Pilotos(hour,name,lap,timelap,speed);
                list.add(pilot);
                
                line = br.readLine(); //Realizar leitura da próxima linha.
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
