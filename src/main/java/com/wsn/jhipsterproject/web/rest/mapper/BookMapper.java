package com.wsn.jhipsterproject.web.rest.mapper;

import com.wsn.jhipsterproject.domain.*;
import com.wsn.jhipsterproject.web.rest.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookMapper {

    BookDTO bookToBookDTO(Book book);

    Book bookDTOToBook(BookDTO bookDTO);
}
