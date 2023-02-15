package com.example.tripbook.member.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * 2023.02.15 이석운 작성
 * id -PK
 * image - 뱃지 이미지 절대경로(협의필요)
 * content - 뱃지 이름
 */
@Getter
public class MemberBadge{
    private Long id;
    private String image;
    private String content;
    @Builder
    public MemberBadge(Long id, String image, String content) {
        this.id = id;
        this.image = image;
        this.content = content;
    }
}
