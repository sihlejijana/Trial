package com.caniksea.adp3.practical.booklib.authormodule.repository.generic.impl;

import com.caniksea.adp3.practical.booklib.authormodule.domain.generic.Author;
import com.caniksea.adp3.practical.booklib.authormodule.repository.generic.AuthorRepository;

import java.util.Set;

/**
 * Instructions
 *  > Make sure you have read the instructions on IRepository.java before attempting the tasks below.
 *  > Make sure you have completed the task(s) in AuthorRepository.java before attempting the tasks below.
 *
 * Tasks:
 *  > Implement repository using singleton and your chosen Java data structure. (1.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the create methods. (0.25 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the read methods. (0.5 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the update methods. (0.75 marks)
 *  > Replace the throw new UnsupportedOperationException() with your implementation of the delete methods. (0.75 marks)
 *  > Write an implementation of the getall method you declared in the interface. (0.25 marks)
 *
 */
public class AuthorRepositoryImpl implements AuthorRepository {

    public static AuthorRepository authorRepository = null;
    private Set <Author> authorSet;

    public static AuthorRepository getAuthorRepo() {
        if (authorRepository == null){
            authorRepository = new AuthorRepositoryImpl();
        }
        return authorRepository;
    }

    @Override
    public Author create(Author author) {
        this.authorSet.add(author);
        return author;
    }

    @Override
    public Author update(Author author) {
       return null;
    }

    @Override
    public Author read(String s) {
        for (Author author : this.authorSet){
            if (author.getId().equalsIgnoreCase(s))
                return author;
        }
        return null;
    }

    @Override
    public void delete(String s) {
        Author author = read(s);
        if (author != null){
            this.authorSet.remove(author);
        }
    }

    @Override
    public Set<Author> getall() {
        return this.authorSet;
    }
}
