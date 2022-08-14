public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("firstName1" , "surName1");

        Author author2 = new Author("firstName2" , "surName2");

        Book book1 = new Book("book1", author1 , 2022);

        Book book2 = new Book("book2", author2 , 2023);

        System.out.println("имя автора " + book1.getName() + " " + book1.getAuthor().getFullName() + " " + book1.getPublicationYear());

        book1.setPublicationYear(2000);

        System.out.println("имя автора " + book1.getName() + " " + book1.getAuthor().getFullName() + " " + book1.getPublicationYear());

        System.out.println("имя автора " + book2.getName() + " "  + book2.getAuthor().getFullName() + " " + book2.getPublicationYear());

    }
}