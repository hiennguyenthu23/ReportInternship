package Exboook;

public class BookBO {
    public Book createBook(String details) throws InvalidBookException {
        String[] bookDetails = details.split(",");
        String code = bookDetails[0].trim();
        String title = bookDetails[1].trim();
        String author = bookDetails[2].trim();
        double price = Double.parseDouble(bookDetails[3].trim());

        if (!code.substring(0, 1).equalsIgnoreCase(title.substring(0, 1))) {
            throw new InvalidBookException("Invalid book code");
        }

        if (!code.substring(1, 3).equalsIgnoreCase(author.substring(0, 2))) {
            throw new InvalidBookException("Invalid book code");
        }

        for (int i = 3; i < code.length(); i++) {
            if (!Character.isDigit(code.charAt(i))) {
                throw new InvalidBookException("Invalid book code");
            }
        }

        return new Book(code, title, author, price);
    }
}

