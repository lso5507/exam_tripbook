package com.example.tripbook.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 2023.02.15 이석운 작성
 * @param nickname -닉네임
 * @param email - 이메일
 * @param gender - 성별
 * @param mbti = MBTI 타입
 */
@Getter
@Setter
@ToString
public class MemberProfile{
    private String nickname;
    private String email;
    private String gender;
    private String mbti;
}
