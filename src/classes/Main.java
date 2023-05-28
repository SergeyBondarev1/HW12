package classes;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Лев","Толстой");
        Book warAndPeace = new Book("Война и мир ",author,1863);
        System.out.println(warAndPeace.getBookName() + " " + warAndPeace.getAuthor().getFirstName() + " " +
                " " + warAndPeace.getAuthor().getLastName()+ " " + warAndPeace.getYear());

    }
   public void setYear(int year){
        this.setYear(1877);
   }
}

