import java.io.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args) throws IOException{
       JOptionPane.showMessageDialog(null, "Caro usuario,salve o arquivo com extensao .csv");
        JPanel contentPane =new JPanel();
        JTextField textField = new JTextField();
        JFileChooser chooser = new JFileChooser();
        int selecao = chooser.showOpenDialog(contentPane);
        if(selecao == JFileChooser.APPROVE_OPTION){
            File arquivo = chooser.getSelectedFile();
            textField.setText(arquivo.getAbsolutePath());
            String ID = JOptionPane.showInputDialog("Digite o ID");
            String name =JOptionPane.showInputDialog("Digite o nome") ;
            String age = JOptionPane.showInputDialog("Digite a idade"); 
            saveRecord(ID,name,age,arquivo);
        }
   
    }
    public static void saveRecord(String ID,String name,String age,File filepath){
        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf);

            pw.println(ID+","+name+","+age);
            pw.flush();
            pw.close();
            JOptionPane.showMessageDialog(null,"Record saved");
        }
        catch(Exception E){
            JOptionPane.showMessageDialog(null, "Record save");
        }
    }
}
