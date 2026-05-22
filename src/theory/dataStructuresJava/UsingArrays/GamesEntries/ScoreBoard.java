package theory.dataStructuresJava.UsingArrays.GamesEntries;

public class ScoreBoard {
    public int currentCapacity;
    public GameEntry[] games;
    public ScoreBoard(int capacity){
        this.games=new GameEntry[capacity];
    }

    public void addEntry(GameEntry game){
        int newScore= game.getScore();
        if(currentCapacity<this.games.length || games[currentCapacity-1].getScore()<newScore){
            if(currentCapacity<this.games.length)
                currentCapacity++;

            int comparison=currentCapacity-1;
            while (comparison>0 && games[comparison-1].getScore()<newScore) {
                games[comparison] = games[comparison-1];
                comparison--;
            }
            this.games[comparison]=game;

        }
    }
    public void removeEntry(int i) throws IndexOutOfBoundsException{
        if(i>this.currentCapacity-1 || i<0)
            throw new IndexOutOfBoundsException("Indice no valido :"+i);
//        int distance = i - currentCapacity -1;
        for(int j=i;j<this.currentCapacity-1;j++){
            this.games[j]=this.games[j+1];
        }
        this.games[currentCapacity-1]=null;
        this.currentCapacity--;
    }

    public String toString(){
        StringBuilder result= new StringBuilder();
        for(int i=0;i<currentCapacity;i++){
            result.append("[ ").append(games[i].toString()).append(" ],\n");
        }
        return result.toString();
    }
}
