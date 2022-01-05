
package lecture12;
import java.io.*;
import java.util.*;


/**
 *
 * @author Admin
 */
class Movie implements Comparable<Movie>{
   private double rating;
   private int year;
   private String name;
   public int compareTo(Movie m){
       return this.year - m.year;
   }
   public Movie(String nm, double rt, int yr){
       this.name = nm;
       this.rating = rt;
       this.year =yr;
   }
   // Getter methods for accesing private data 
   public double getRating(){
       return rating;
   }
   public String getName(){
       return name;
   }
   public int getYear (){
       return year;
   }
   
}
class RatingCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        if(m1.getRating()<m2.getRating()) return -1;
        else if(m1.getRating() > m2.getRating()) return 1;
        else return 0;
    }
}
class NameCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}
public class comparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Doctor Strange Multiverse of Maddness",9.5,2022));
        list.add(new Movie("Spider Man No Way Home",9,2021));
        list.add(new Movie("Avenger Infinity War",8.0,2019));
        list.add(new Movie("Avenger End Game",8.5,2020));
        
        System.out.println("Sorted by rating ");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for(Movie movie: list)
            System.out.println(movie.getRating() + " "+ movie.getName() + " " + movie.getYear());
        
        System.out.println("\nSorted by name");
        NameCompare namecompare = new NameCompare();
        Collections.sort(list, namecompare);
        for(Movie movie: list)
            System.out.println(movie.getRating() + " "+ movie.getName() + " " + movie.getYear());
        
    }
    
}
