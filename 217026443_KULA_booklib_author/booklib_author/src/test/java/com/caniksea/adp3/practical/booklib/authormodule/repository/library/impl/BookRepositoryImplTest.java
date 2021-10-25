package com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookFactory;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in BookRepositoryImpl.java before attempting tasks below.
 *  > Use JUNIT testing framework ONLY.
 *  > Use appropriate assert method(s).
 *
 * Tasks:
 *  > Replace the throw exception with test cases the create methods. (0.25 marks)
 *  > Replace the throw exception with test cases the read methods. (0.5 marks)
 *  > Replace the throw exception with test cases the update methods. (0.75 marks)
 *  > Replace the throw exception with test cases the delete methods. (0.75 marks)
 *  > Write a test case for the getall method. (0.25 marks)
 *  > Ensure your tests run in a right order (Hint: method name ascending). (0.125 marks)
 *
 */
@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class BookRepositoryImplTest {

    private static BookRepository bookRepository = BookRepositoryImpl.getBookRepo();
    private static Book book = BookFactory.buildBook("Intoduction", 2010);

    @Test
    public void a_create() {
        Book book1 = bookRepository.create(book);
        Assert.assertEquals(book.getId(), book1.getId());
        System.out.println(book1);
    }

    @Test
    public void c_update() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void b_read() {
        Book updateBook = new Book.Builder().setTitle("Inro").setYear(2020).create();
        updateBook = bookRepository.update(updateBook);

    }

    @Test
    public void f_delete() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void d_getall(){
        System.out.println("Get All : " + bookRepository.getall());
    }
}