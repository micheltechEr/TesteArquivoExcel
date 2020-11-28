package trabalhoar;
import javax.swing.*;
import java.io.*;
public class Tela  {
     String ID ;
     String name ;
     String age;
    public Tela(){ //Construtor com os atributos
        ID = this.ID;
        name = this.name;
        age = this.age;
    }
    public void telinha(){
Salvar s = new Salvar(); //Instancia do objeto Salvar

JPanel contentPane = new JPanel();//Instancia do JPanel

JOptionPane.showMessageDialog(null,"Por favor,salve com a extensão csv"); //Mensagem

JTextField textField = new JTextField(); //Caixa de texto

JFileChooser chooser = new JFileChooser(); //Escolhedor

int selecao = chooser.showOpenDialog(contentPane); //Selecao do escolhedor

if(selecao == JFileChooser.APPROVE_OPTION){ //Verfica caso a escolha foi aprovada
    
    File arquivo = chooser.getSelectedFile(); //Pega o arquivo
    
    textField.setText(arquivo.getAbsolutePath()); //Escreve no arquivo
    
     ID = JOptionPane.showInputDialog("Digite o ID"); //Leitura dos atributos
    
     name =JOptionPane.showInputDialog("Digite o nome") ;
    
     age = JOptionPane.showInputDialog("Digite a idade"); 
    
    s.salvar(ID,name,age,arquivo); //Chamada do metodo para salvar
}
    }
}
