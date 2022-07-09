public enum MovieCategory {
    HORROR("Horror"),
    THRILLER("Thriller"),
    DOCUMENTARY("Documentary"),
    ROMANTIC("Romantic"),
    MAGIC("Magic");

    private String category;

    MovieCategory(String category){
        this.category = category;
    }

    String getStr(){
        return category;
    }

}
