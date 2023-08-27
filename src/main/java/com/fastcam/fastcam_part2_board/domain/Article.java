package com.fastcam.fastcam_part2_board.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private Article article;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;//생성자
    private LocalDateTime modifiedAt;
    private String mofieddBy;//수정자

}
