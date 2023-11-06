package com.example.firstproject.api;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ArticleApiController {
    private final ArticleService articleService;

//    @Autowired
//    private  ArticleRepository articleRepository;

//    private final ArticleRepository articleRepository;
//    이경우 @RequiredArgsConstructor


    //Get
    // 게시글 페이지 (메인 페이지)
    @GetMapping("/api/articles")
    public List<Article> index(){
        return  articleService.index();
    }

    // 게시글 상세페이지 (단건조회)
    @GetMapping("/api/articles/{id}")
    public Article show(@PathVariable Long id){
//        return articleRepository.findById(id).orElse(null);
          return articleService.show(id);
    }

    //post
    // 게시글 추가
    @PostMapping("/api/articles")
    public ResponseEntity<Article> create(@RequestBody ArticleForm dto){
        Article created = articleService.create(dto);
        return (created != null)?
                ResponseEntity.status(HttpStatus.OK).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
    // @RequestBody -> Json 데이터 받기

    //Patch(update)
    @PatchMapping("/api/articles/{id}")
    public ResponseEntity<Article> update(@PathVariable Long id,
                                          @RequestBody ArticleForm dto){

        // 수정할 id -> id
        // form에서 수정한 데이터

        Article updated = articleService.update(id, dto);

        return (updated != null) ?
                    ResponseEntity.status(HttpStatus.OK).body(updated) :
                    ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

    }

    // ResponseEntity<Article> - ResponseEntity
    // Article을 담아서 ResponseEntity로 리턴 값을 보내야 한다.
    // 응답코드를 반환할 수 있다.
    // ResonseEntity 에 Article 에 담겨서 JSON 으로 반환
    // 상태코드 200, json 에 내용이 같이 반환된다.

    //delete
    @DeleteMapping("/api/articles/{id}")
    public ResponseEntity<Article> delete(@PathVariable Long id){

        Article deleted = articleService.delete(id);

        return (deleted != null) ?
                ResponseEntity.status(HttpStatus.NO_CONTENT).build() :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        // ResponseEntity.status(HttpStatus.NO_CONTENT) - 204 no_content
        // 요청이 성공적으로 처리 되었음을 알린다. 또한 응답 본문에는 데이터가 반환되지 않는다.
    }

    // 트랜잭션 -> 예외발생 -> 롤백
    @PostMapping("/api/transaction-test")
    public ResponseEntity<List<Article>> transactionTest(@RequestBody List<ArticleForm> dtos) {
        // Article을 리스트(묶음 단위 전송), ResponseEntity로 감싸서 받음
        List<Article> createList = articleService.createArticle(dtos);
        return (createList != null) ?
                ResponseEntity.status(HttpStatus.OK).body(createList) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }



}