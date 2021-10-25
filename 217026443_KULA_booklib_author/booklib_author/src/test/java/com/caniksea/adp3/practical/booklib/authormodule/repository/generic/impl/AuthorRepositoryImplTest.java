package com.caniksea.adp3.practical.booklib.authormodule.repository.generic.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.factory.generic.AuthorFactory;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.AuthorRepository;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Instructions:
 *  > Make sure you have completed the task(s) in AuthorRepositoryImpl.java before attempting tasks below.
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
public class AuthorRepositoryImplTest {

    private static AuthorRepository authorRepository = AuthorRepositoryImpl.getAuthorRepo();
    private static Author author = AuthorFactory.buildAuthor("Thulani", "Kula");

    @Test
    public void a_create() {
        Author author1 = authorRepository.create(author);
        Assert.assertEquals(author.getId(), author1.getId());
        System.out.println(author1);
    }

    @Test
    public void c_update() {
        throw new UnsupportedOperationException();
    }

    @Test
    public void b_read() {
       Author updateAuthor = new Author.Builder().setFirstName("Thulz").setLastName("Kula").create();
       updateAuthor = authorRepository.update(updateAuthor);
    }

    @Test
    public void f_delete() {
        // deletedAuthor = authorRepository.delete(author.getId());
    }

    @Test
    public void d_getall(){
        System.out.println("Get All : " + authorRepository.getall());
    }
}