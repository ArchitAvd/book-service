package com.ust.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class BookEntity {

    @Id
    private long bookId;

    private String bookName;

    private String bookAuthor;
}
