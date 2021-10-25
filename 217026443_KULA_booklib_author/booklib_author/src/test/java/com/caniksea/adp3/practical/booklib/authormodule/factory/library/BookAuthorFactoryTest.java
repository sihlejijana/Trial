package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.factory.generic.AuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.factory.generic.AuthorFactoryTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task on BookAuthorFactory.java.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 */
public class BookAuthorFactoryTest {

    /**
     * Tasks:
     *  > Replace the throw exception with your implementation of a test case for buildBookAuthor. (2 marks)
     */
    @Test
    public void buildBookAuthor() {
       Author author;
       Book book;

       author = AuthorFactory.buildAuthor("Thulani", "Kula");
       book = BookFactory.buildBook("Intro", 2010);
        BookAuthor bookAuthor = BookAuthorFactory.buildBookAuthor(book.getId(), author.getId());

        Assert.assertEquals(author.getId(), bookAuthor.getAuthorId());
        Assert.assertEquals(book.getId(), bookAuthor.getBookId());
    }
}