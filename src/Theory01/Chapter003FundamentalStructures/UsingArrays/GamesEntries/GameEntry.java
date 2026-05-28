package Theory01.Chapter003FundamentalStructures.UsingArrays.GamesEntries;

public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String name,int score){
        this.setName(name);
        this.setScore(score);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;
    }
    public String toString(){
        return "Nombre : " + this.getName() + " , Puntaje : "+ this.getScore();
    }
}
