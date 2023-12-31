package com.example.firstproject.entity;


import com.example.firstproject.dto.CommentDto;
import lombok.*;

import javax.persistence.*;
//import org.springframework.data.annotation.Id; no-sql mongoDB
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    @Column
    private String nickname;

    @Column
    private String body;

    public static Comment createComment(CommentDto dto, Article article) {
        //예외 발생
        if(dto.getId() != null)
            throw new IllegalArgumentException("댓글생성실패! 댓글에 id가 없어야 합니다.");
        if(dto.getArticleId() != article.getId())
            throw new IllegalArgumentException("댓글생성실패! 게시글의 id가 잘못되었습니다.");

        //엔티티 생성및 반환
        return new Comment(
                dto.getId(),
                article,
                dto.getNickname(),
                dto.getBody()
        );
//        Comment comment = new Comment();
//        comment.setArticle(article);
//        comment.setNickname(dto.getNickname());
//        comment.setBody(dto.getBody());
//
//        return comment;
    }

    public void patch(CommentDto dto) {
        //예외발생
        if(this.id != dto.getId())
            throw new IllegalArgumentException("댓글 수정 실패! 잘못된 id가 입력되었습니다.");
        //객체를 갱신
        if(dto.getNickname() != null)
            this.nickname = dto.getNickname();

        if (dto.getBody() != null)
            this.body = dto.getBody();

    }
}
