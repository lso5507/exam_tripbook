package com.example.tripbook.board.comment;

import com.example.tripbook.member.domain.Member;

import java.time.LocalDateTime;

/**
 * 2023-02-12 이석운 작성함
 * @param id - PK
 * @param user - 작성자
 * @param content - 내용
 * @param createdAt - 작성일자
 * @param updatedAt - 수정일자
 */
public record Comment(
        Long id,
        Member user,
        String content,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
