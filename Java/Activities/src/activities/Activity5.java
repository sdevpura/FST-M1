package activities;
public class Activity5 {

    public static void main(String []args) {
        String title = "Java";

        Book newNovel = new MyBook();

        newNovel.setTitle(title);

        //Print result
        System.out.println("The title is: " + newNovel.getTitle());
    }
}


