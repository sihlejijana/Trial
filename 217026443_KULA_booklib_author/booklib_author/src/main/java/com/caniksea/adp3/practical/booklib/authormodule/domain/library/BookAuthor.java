package com.caniksea.adp3.practical.booklib.authormodule.domain.library;

/**
 * Instructions:
 *  > Do NOT modify class instance variable declaration.
 *
 * Tasks:
 *  > Implement class using Builder Pattern ONLY. (2 marks)
 *
 */
public class BookAuthor {

    private String bookId, authorId; // DO NOT MODIFY THIS LINE.

    public BookAuthor(Builder builder) {
        this.bookId = builder.bookId;
        this.authorId = builder.authorId;
    }

    public String getBookId() {
        return bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "BookAuthor{" +
                "bookId='" + bookId + '\'' +
                ", authorId='" + authorId + '\'' +
                '}';
    }

    public static class Builder {
        private String bookId, authorId;

        public Builder setBookId(String bookId){
            this.bookId = bookId;
            return this;
        }

        public Builder setAuthorId(String authorId){
            this.authorId = authorId;
            return this;
        }

        public BookAuthor create(){
            return new BookAuthor(this);
        }

    }
}
