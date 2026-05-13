class Book {
    public String title;
    public Library library;
    public static Book last = null;

    public Book(String name) {
        title = name;
        last = this;
        library = null;
    }

    public static String lastBookTitle() {
        return last.title;
    }

    public String getTitle() {
        return title;
    }
}

//class Library {
//    public Book[] books;
//    public int index;
//    public static int totalBooks = 0;
//    public Library(int size) {
//        books = new Book[size];
//        index = 0;
//    }
//    public void addBook(Book book) {
//        books[index] = book;
//        index++;
//        totalBooks++;
//        book.library = this;
//    }
//}


//1. Change the totalBooks variable to non static -> compile
//2. Change the lastBookTitle method to non static -> compile
//3. Change the addBook method to static -> error
//4. Change the last variable to non static -> error
//5. Change the library variable to static -> compile

//Using the Book and Library classes from before, write the output of the main
//method below. If a line errors, put the precise reason it errors and continue
//execution.
