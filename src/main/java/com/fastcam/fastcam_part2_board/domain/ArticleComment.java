package com.fastcam.fastcam_part2_board.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;//생성자
    private LocalDateTime modifiedAt;
    private String mofieddBy;//수정자

}
