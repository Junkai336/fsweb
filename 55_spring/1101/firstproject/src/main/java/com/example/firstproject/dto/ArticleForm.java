package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Id;
import javax.swing.text.html.parser.Entity;

public class ArticleForm {

    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String content;


    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }


}
