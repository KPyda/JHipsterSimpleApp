package com.wsn.jhipsterproject.service;

import com.wsn.jhipsterproject.domain.Book;
import com.wsn.jhipsterproject.web.rest.dto.BookDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.LinkedList;
import java.util.List;

/**
 * Service Interface for managing Book.
 */
public interface BookService {

    /**
     * Save a book.
     * @return the persisted entity
     */
    public BookDTO save(BookDTO bookDTO);

    /**
     *  get all the books.
     *  @return the list of entities
     */
    public Page<Book> findAll(Pageable pageable);

    /**
     *  get the "id" book.
     *  @return the entity
     */
    public BookDTO findOne(Long id);

    /**
     *  delete the "id" book.
     */
    public void delete(Long id);

    /**
     * search for the book corresponding
     * to the query.
     */
    public List<BookDTO> search(String query);
}
