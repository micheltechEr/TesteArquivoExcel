package trabalhoar;
public class Facade {
    private static Facade instance;
    
    private Facade(){ }
    
    public static synchronized Facade getInstance(){ //metodo p/ instanciar objeto
        if(instance == null){
            instance = new Facade();
        }
        return instance;
    }
    
    public void exibir(){
    Tela t = Tela.getInstance();
    t.escreverArquivo();
    }
    
}
