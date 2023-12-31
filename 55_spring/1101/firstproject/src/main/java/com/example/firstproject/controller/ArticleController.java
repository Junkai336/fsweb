package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArticleController {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }



    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    // 폼에 있는 내용 전달하려면 postmapping
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        // 1. Dto를 Entity로 변환
        // 전송을 Dto로 하고 Entity로 저장한다.
        Article article = form.toEntity();
        System.out.println(article.toString());
        // 2. Repository에게 Entity를 DB로 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "/";
    }
}

//    @PostMapping("/articles/create")
//    @RequestMapping("/articles/new")
//        public String getArticle (@RequestParam(value = "title") String title, @RequestParam(value = "content") String content, Model model ) {
//        model.addAttribute("title", "title");
//        model.addAttribute("content", "content");
//        return "/articles/create";
//        }
//    }

