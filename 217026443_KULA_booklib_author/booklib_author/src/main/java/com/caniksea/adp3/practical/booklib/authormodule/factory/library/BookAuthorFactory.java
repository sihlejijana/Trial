package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;

public class BookAuthorFactory {

    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > bookId & authorId parameters must not be empty, null or "null"
     *
     * Tasks:
     *  > Replace the throw exception (line 20) with your attempt of the factory method. (3 mark)
     *
     * @param bookId
     * @param authorId
     * @return
     */
    public static BookAuthor buildBookAuthor(String bookId, String authorId) { // DO NOT MODIFY THIS LINE.

         Book book = null;
        Author author = null;

        bookId = book.getId();
        authorId = author.getId();

        BookAuthor bookAuthor = new BookAuthor.Builder().setBookId(bookId).setAuthorId(authorId).
                create();

        return bookAuthor;
    }
}
