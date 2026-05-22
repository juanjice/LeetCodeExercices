package theory.dataStructuresJava.UsingArrays.GamesEntries;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ScoreBoard myBoard = new ScoreBoard(9);
        Map<String,Integer> nombres = new HashMap<>(Map.of("Juan",700,"Migugel",200,"Andres",180,"Gerardo",90,"Ignacio",60,"Julian",500));

        nombres.forEach((k,v)->{
            myBoard.addEntry(new GameEntry(k,v));
        });

        System.out.println(myBoard);
        myBoard.removeEntry(2);
        System.out.println(myBoard);
        myBoard.removeEntry(4);
        System.out.println(myBoard);

    }
}
