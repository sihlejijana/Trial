package com.caniksea.adp3.practical.booklib.authormodule.factory.generic;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;

import java.util.UUID;

public class AuthorFactory {

    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > firstName & lastName parameters must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 20) with your attempt of the factory method. (3 mark)
     *
     * @param firstName
     * @param lastName
     * @return
     */
    public static Author buildAuthor(String firstName, String lastName) { // DO NOT MODIFY THIS LINE
       String id = UUID.randomUUID().toString();

       Author author = new Author.Builder().setId(id).
               setFirstName(firstName).setLastName(lastName).
               create();

       return author;
    }
}
