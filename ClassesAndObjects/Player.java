public class Player {
    private String name;
    private String position;
    private String jersyNumber;

    Player(String name,String position,String jersyNumber) {
        this.name = name;
        this.position = position;
        this.jersyNumber = jersyNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getJersyNumber(){
        return jersyNumber;
    }
    public void setJersyNumber(String jersyNumber){
        this.jersyNumber = jersyNumber;
    }
    public void playGame(){
        System.out.println("Playing game.....");
    }
    public void train(){
        System.out.println("training.....");
    }
}
