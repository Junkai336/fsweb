package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.*;

import javax.persistence.Id;
import javax.swing.text.html.parser.Entity;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ArticleForm {
    private Long id;
    private String title;
    private String content;
    public Article toEntity() {
        return new Article(id, title, content);
    }


}