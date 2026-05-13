//Using the Book and Library classes from before, write the output of the main
//method below. If a line errors, put the precise reason it errors and continue
//execution.
public class Main {
    public static void main(String[] args) {
        System.out.println(Library.totalBooks); // 0
//        System.out.println(Book.lastBookTitle()); // NullPointerException
//        System.out.println(Book.getTitle()); // instance method can't call from class

        Book goneGirl = new Book("Gone Girl");
        Book fightClub = new Book("Fight Club");

        System.out.println(goneGirl.title); // Gone Girl
        System.out.println(Book.lastBookTitle()); // Fight Club
        System.out.println(fightClub.lastBookTitle()); // Fight Club
        System.out.println(goneGirl.last.title); // Fight Club

        Library libraryA = new Library(1);
        Library libraryB = new Library(2);
        libraryA.addBook(goneGirl);

        System.out.println(libraryA.index); // 1
        System.out.println(libraryA.totalBooks); // 1

        libraryA.totalBooks = 0;
        libraryB.addBook(fightClub);
        libraryB.addBook(goneGirl);

        System.out.println(libraryB.index); // 2
        System.out.println(Library.totalBooks); // 2
        System.out.println(goneGirl.library.books[0].title); // Fight Club
    }
}