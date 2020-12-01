package trabalhoar;
import javax.swing.*;
import java.io.*;
public class Tela {

    private static  Tela instancia;
    
       private Tela(){ }
       
    public static  synchronized Tela getInstance(){ //metodo p/ instanciar objeto,retornando ele mesmo
        if(instancia == null){
            
       instancia = new Tela();
    }
        return instancia;
    }
  
 public void escreverArquivo(){
Salvar s = Salvar.getInstance(); //Instancia do objeto Salvar

JPanel contentPane = new JPanel();//Instancia do JPanel

JOptionPane.showMessageDialog(null,"Por favor,salve com a extensão csv"); //Mensagem

JTextField textField = new JTextField(); //Caixa de texto

JFileChooser chooser = new JFileChooser(); //Escolhedor

int selecao = chooser.showOpenDialog(contentPane); //Selecao do escolhedor

if(selecao == JFileChooser.APPROVE_OPTION){ //Verfica caso a escolha foi aprovada
    
    File arquivo = chooser.getSelectedFile(); //Pega o arquivo
    
    textField.setText(arquivo.getAbsolutePath()); //Escreve no arquivo
    
    String ID = JOptionPane.showInputDialog("Digite o ID"); //Leitura dos atributos
    
    String name =JOptionPane.showInputDialog("Digite o nome") ;
    
   String  age = JOptionPane.showInputDialog("Digite a idade"); 
    
    s.salvar(ID,name,age,arquivo); //Chamada do metodo para salvar
}
    }
}

