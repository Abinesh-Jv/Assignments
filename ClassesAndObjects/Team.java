public class Team {
    private String name;
    private String city;
    private String division;

    Team(String name,String city,String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getDivision(){
        return division;
    }
    public void setDivision(String division){
        this.division = division;
    }
    public void playGame(){
        System.out.println("Playing game.....");
    }
    public void hireCoach(){
        System.out.println("hiring coach.....");
    }
}
