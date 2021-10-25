package com.caniksea.adp3.practical.booklib.authormodule.service.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.BookAuthor;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookAuthorService;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in BookAuthorService.java before attempting the tasks below.
 *  > Note that no Update operation is needed here.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *  > Write an implementation of the method you declared in the interface that returns all
 *      bookauthor entities given bookid. (1.5 marks)
 *  > Write an implementation of the method you declared in the interface that returns all
 *      bookauthor entities given authorid. (1.5 marks)
 *  > Write an implementation of the method you declared to delete all bookauthor entites
 *      given a bookid. (1.5 marks)
 *
 */
public class BookAuthorServiceImpl implements BookAuthorService {

    @Override
    public BookAuthor create(BookAuthor bookAuthor) {
        throw new UnsupportedOperationException();
    }

    @Override
    public BookAuthor read(String bookId, String authorId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(String bookId, String authorId) {
        throw new UnsupportedOperationException();
    }
}
