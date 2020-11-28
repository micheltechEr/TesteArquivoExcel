package trabalhoar;
import java.io.*;
import javax.swing.*;

public class Salvar {
     public Salvar(){ //Construtor
        
    }
    public void salvar(String ID,String name,String age,File filepath){ //Metodo de salvar
        try{
            FileWriter fw = new FileWriter(filepath,true); //Abre o arquivo
            BufferedWriter bf = new BufferedWriter(fw); //Pega a String para escrita
            PrintWriter pw = new PrintWriter(bf);//Escreve o registro

            pw.println(ID+","+name+","+age); //Escreve os valores do parametro no arquivo
            pw.flush();
            pw.close(); //Fecha o PrintWritter
            JOptionPane.showMessageDialog(null,"Arquivo salvo"); //Exibe na tela 
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null, "Arquivo não salvo");
        }
}
}
