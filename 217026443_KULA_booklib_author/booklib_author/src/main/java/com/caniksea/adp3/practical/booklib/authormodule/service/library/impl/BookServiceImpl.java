package com.caniksea.adp3.practical.booklib.authormodule.service.library.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.library.Book;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.BookRepository;
import com.caniksea.adp3.practical.booklib.authormodule.repository.library.impl.BookRepositoryImpl;
import com.caniksea.adp3.practical.booklib.authormodule.service.library.BookService;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IService.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in BookService.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement service using singleton with a link to your repository. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update methods. (0.75 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *
 */
public class BookServiceImpl implements BookService {

    public static BookService bookService = null;
    private BookRepository bookRepository;

    private BookServiceImpl(){
        this.bookRepository = BookRepositoryImpl.getBookRepo();
    }

    public static BookService getBookService (){
        if (bookService == null){
            bookService = new BookServiceImpl();
        }
        return bookService;
    }

    @Override
    public Book create(Book book) {
       return this.bookRepository.create(book);
    }

    @Override
    public Book update(Book book) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Book read(String s) {
        return this.bookRepository.read(s);
    }

    @Override
    public void delete(String s) {
        this.bookRepository.delete(s);
    }

    @Override
    public Set<Book> getall() {
        return this.bookRepository.getall();
    }
}
