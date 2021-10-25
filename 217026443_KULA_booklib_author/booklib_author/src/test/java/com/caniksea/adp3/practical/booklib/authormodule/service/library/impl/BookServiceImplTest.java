package com.caniksea.adp3.practical.booklib.authormodule.service.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.factory.library.BookFactory;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in BookServiceImpl.java before attempting tasks below.
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
public class BookServiceImplTest {

    private static BookService service = BookServiceImpl.getBookService();
    private static Book book = BookFactory.buildBook("Thulani", 2010);

    @Test
    public void a_create() {
        Book create = service.create(book);
        Assert.assertEquals(book.getId(), create.getId());
    }

    @Test
    public void c_update() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void b_read() {
        Book read = service.read(book.getId());
    }

    @Test
    public void f_delete() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void d_getall(){
        System.out.println("Get All : " + service.getall());
    }
}