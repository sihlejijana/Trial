package com.caniksea.adp3.practical.booklib.authormodule.factory.library;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;

import java.util.UUID;

public class BookFactory {

    /**
     * Instructions:
     *  > Do NOT modify the method signature.
     *  > year parameter must be 4 digits.
     *  > year parameter must not be older than 1900 and/or in the future.
     *  > title parameter must not be empty, null or "null".
     *
     * Tasks:
     *  > Replace the throw exception (line 22) with your attempt of the factory method. (3 mark)
     *
     * @param title
     * @param year
     * @return
     */
    public static Book buildBook(String title, int year) { // DO NOT MODIFY THIS LINE.

        String id = UUID.randomUUID().toString();
        if (year < 1900 || year > 2020){
            System.out.println("Please return year");
        }
        int year1 = String.valueOf(year).length();

        if (year1 < 4 || year1 > 4){
            System.out.println("Please return year");
        }

        Book book = new Book.Builder().setId(id).setTitle(title).setYear(year).
                create();

        return book;
    }
}
