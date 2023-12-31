package com.example.firstproject.api;


import com.example.firstproject.annotation.RunningTime;
import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentApiController {

    private final CommentService commentService;

    // 댓글 목록 조회

    @GetMapping("/api/articles/{articleId}/comments")
    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long articleId) {
        // 서비스에게 위임
      List<CommentDto> dtos  = commentService.comments(articleId);

       // 결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

    // 댓글 생성
    @PostMapping("/api/articles/{articleId}/comments")
    public ResponseEntity<CommentDto> create(@PathVariable Long articleId, @RequestBody CommentDto dto) {
        // @RequestBody CommentDto dto
        // Spring이 JSON 데이터를 CommentDto 개체로 변환하여 컨트롤러 메서드에 전달
        // 이후 컨트롤러 메서드에서 dto를 사용할 수 있습니다.

        // 서비스에 위임
        CommentDto createdDto = commentService.create(articleId, dto);

        return ResponseEntity.status(HttpStatus.OK).body(createdDto);
    }

    // 댓글 수정
    @PatchMapping("/api/comments/{id}")
    public ResponseEntity<CommentDto> patch(@PathVariable Long id, @RequestBody CommentDto dto) {
        // 서비스에 위임
        CommentDto updateDto = commentService.update(id, dto);

        return ResponseEntity.status(HttpStatus.OK).body(updateDto);
    }

    // 댓글 삭제
   @RunningTime
    @DeleteMapping("/api/comments/{id}")
    public ResponseEntity<CommentDto> delete(@PathVariable Long id) {
        // 서비스에게 위임
        CommentDto deleteDto = commentService.delete(id);

        return ResponseEntity.status(HttpStatus.OK).body(deleteDto);

    }

}
