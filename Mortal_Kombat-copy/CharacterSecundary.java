
/**
 * Escreva uma descrição da classe CharacterSecundary aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CharacterSecundary extends Character
{
    String utensilio;
    
    public CharacterSecundary(String name, String homeland, double height, String utensilio){
        super(name, homeland, height);
        this.utensilio = utensilio;
    }
    
    public String utensilio(){
        return this.utensilio;
    }
    
    public void setUtensilio(String newUtensilio){
        this.utensilio = newUtensilio;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        str.append("----Utensilio:----\n");
        str.append(this.utensilio + "\n");
        
        return str.toString();
    }
}