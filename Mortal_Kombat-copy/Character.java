
/**
 * Escreva uma descrição da classe CharacterSecundary aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Character
{
    private String name;
    private String homeland;
    private double height;
    
    public Character(String name, String homeland, double height){
        this.name = name;
        this.homeland = homeland;
        this.height = height;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getHomeland(){
        return this.homeland;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("----CHARACTER----\n");
        str.append("----Name:----\n");
        str.append(this.name + "\n");
        str.append("----Homeland:----\n");
        str.append(this.homeland + "\n");
        str.append("----Height:----\n");
        str.append(this.height + "\n");
        str.append("--------------\n");
        
        return str.toString();
    }
}