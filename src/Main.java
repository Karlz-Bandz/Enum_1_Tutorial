import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Movies movie1 = new Movies("Lord of the Rings", MovieCategory.THRILLER, 2001);
        Movies movie2 = new Movies("Matrix", MovieCategory.THRILLER, 1990);
        Movies movies3 = new Movies("Harry Potter I", MovieCategory.MAGIC, 2000);
        Movies movie4 = new Movies("Harry Potter II", MovieCategory.MAGIC, 2002);


        ArrayList<Movies> movieArray = new ArrayList<>(Arrays.asList(
                new Movies("Earth", MovieCategory.DOCUMENTARY, 2022),
                new Movies("Titanic", MovieCategory.ROMANTIC, 2000),
                new Movies("Animals", MovieCategory.DOCUMENTARY, 2012)));

        movieArray.add(movie1);
        movieArray.add(movie2);
        movieArray.add(movies3);
        movieArray.add(movie4);


        //Here adding Values from movie category to categoryEnum array
        MovieCategory [] categoryEnum = MovieCategory.values();

        System.out.println("--------- Movie categories -------- ");
        for (MovieCategory c : categoryEnum){
            System.out.println(c.getStr());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter category: ");
        String userInput = scanner.nextLine();
        System.out.println();


        //Here I make conversion from String userInput to enum MovieCategory
        //For this I need valueof()

        MovieCategory inputCategory = MovieCategory.valueOf(userInput.toUpperCase());

        for (Movies c : movieArray){
            if(c.getCategory() == inputCategory){
                System.out.println(c.displayMovieData());
            }
        }






    }

}
