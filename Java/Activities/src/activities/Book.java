package activities;

//Abstract class
abstract class Book {
    String title;
    abstract void setTitle(String s);

    //Concrete method
    String getTitle() {
        return title;
    }
}
