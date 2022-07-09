public class Movies implements MovieInter{
    private String title;
    private MovieCategory category;
    private int year;

    Movies(String title, MovieCategory category, int year){
        this.setTitle(title);
        this.setCategory(category);
        this.setYear(year);
    }



    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setCategory(MovieCategory category) {
       this.category = category;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public MovieCategory getCategory() {
        return this.category;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String displayMovieData() {
        return "Title: " + this.title + "\nCategory: " + this.category.getStr() + "\nYear: " + this.year;
    }
}
