public class Book{
    private String name;
    private String author;
    private boolean isHardCover;
    private double price;
    private int numberOfPages;
    private int numberOfTimesRead;

    
    public Book(String name, String author, boolean isHardCover, double price, int numberOfPages){
        this.name = name;
        this.author = author;
        this.isHardCover = isHardCover;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.numberOfTimesRead = 0;
        
    }
    
    public void setName(String name){
        this.name = name;
    }
        
    public String getName(){
        return this.name;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setIsHardCover(boolean isHardCover){
        this.isHardCover = isHardCover;
    }

    public boolean getIsHardCover(){
        return this.isHardCover;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }
    
    public void setNumberOfTimesRead(int numberOfTimesRead){
        this.numberOfTimesRead = numberOfTimesRead;
    }
    public void incrementNumberOfTimesRead(){
        this.numberOfTimesRead++;
    }

    public double getAverageReadTime()
    {
        double averageTime;
        averageTime = numberOfPages * 0.8;

        return averageTime;
    }

    public String isReadale()
    {
        double averageTime = getAverageReadTime();

        if(averageTime <= 61) {
            return "You can read this.";
        }
        else if (averageTime >= 60 && averageTime <= 240) {
            return "Are you sure you want to read this now?";
        }
        else{
            return "You should not start reading this right now";
        }
    }
}