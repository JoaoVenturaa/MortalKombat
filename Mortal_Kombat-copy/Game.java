import java.util.*;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private final int ATTACKS_LIMIT = 5;
    // instance variables - replace the example below with your own
    private Character[] characters;
    private Character player1;
    private Character player2;
    private String[] sequencesAttacks = new String[this.ATTACKS_LIMIT];
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // Set Characters
        this.setCharacters();
    }
    
    /**
     * Inicia o array das personagens
     */
    private void setCharacters() {
        Character c1 = new Character("Goro", "Presas de Dragão", "Ilha Shokan, Outworld", "Shokan Kuatan",4.30);
        Character c2 = new Character("Liu Kang", "Espada do Dragão", "Henan, China", "Jun Fan (MK:D, MK:A)Pao Chui (MK:D)Jeet Kune Do (MK:SM)Dragão (MK:SM)Choy Lay Fut (MK:SM)Macaco (MK:SM) ",1.78);
        Character c3 = new Character("Sonya Blade", "Catavento, Bastões de Kali", "Austin, Texas, EUA", "Kempo (MK:DA:Tae Kwon Do (MK:DA,MK:A)", 1.78);
        Character c4 = new Character("Johnny Cage", "Faca Bowie, Pistola", "Venice, Califórnia, EUA,", "Jeet Kune Do (MK:DA, MK:TE)",1.80);
        Character c5 = new Character("Kano", "Austrália","Butterfly knife", "Hsing Yi/Xing YiAikido", 1.80);
        Character c6 = new Character("Raiden","Martelo, Bastão", "Céu","Nan Quan (MK:DA, MK:D, MK:AR)",1.80);
        Character c7 = new Character("Sub-Zero", "Earthrealm (China)", "Clava de Gelo Espada-Kōri", "Shotokan Dragão", 1.80);
        Character c8 = new Character("Scorpion", "Japão; renascido em Netherrealm (submundo)", "NA", "NA",1.80);
        Character c9 = new Character("Reptile", "Earthrealm", "NA", "NA", 1.80);
        Character c10 = new Character("Ermac", "Vaeternus", "NA", "NA",1.80);
        Character c11 = new Character("Shang Tsung", "China","Espada estreita", "NA",1.80);
        
        this.characters = new Character[]{c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11};
        
        this.player1 = this.characters[this.selectPlayer()];
        this.player2 = this.characters[this.selectPlayer()];
        
        this.play();
        
        // Implementar o metodo que vai mostrar a sequencia dos golpes
        
        this.sequenceAttack();
        
        this.showWinner();
    }
    
    public Character getPlayer1() {
        return this.player1;
    }

    public Character getPlayer2() {
        return this.player2;
    }
    
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("----Num de CHARACTER > " + this.characters.length + "----\n");
        return str.toString();
    }
    
    private void play() {
        int attacks = 0;
        Random rand = new Random();        
        while(attacks < this.ATTACKS_LIMIT) {
            String sequence ="";
            
            int playerIndexToAttack = rand.nextInt(1);
            
            String attackStr;
            
            if(playerIndexToAttack == 0) {
                this.player2.sufferAttack();
                
                attackStr = this.player2.generateAttack();
                
                sequence = this.player1.toString() + attackStr;
            } else {
                this.player1.sufferAttack();
                
                attackStr = this.player1.generateAttack();
                
                sequence =this.player2.toString() + attackStr;
            }
            
            this.sequencesAttacks[attacks] = sequence;
            
            attacks ++;
        }
    }
    
    public void sequenceAttack(){
        for(int i = 0; i < this.ATTACKS_LIMIT ; i++){
            System.out.println(this.sequencesAttacks[i]);
        }
    }
    
    public void showWinner(){
        if(this.player1.getEnergy() < this.player2.getEnergy()){
            System.out.println("O player 2 ganhou e ficou com:" + this.player2.getEnergy());
        }else{
            System.out.println("O player 1 ganhou e ficou com:" + this.player1.getEnergy());
        }
    }
    
    private int selectPlayer() {
        Random rand = new Random();
        int charactersIndex = rand.nextInt(this.characters.length - 1);
        return charactersIndex;
    }
}