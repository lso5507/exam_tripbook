package com.example.tripbook.board.diary.domain;

import com.example.tripbook.board.comment.Comment;
import com.example.tripbook.member.domain.Member;
import com.example.tripbook.model.Transport;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 2023-02-12 이석운 작성
 * id - PK
 * title - 제목
 * titlePhoto - 썸네일 이미지
 * transport - 교통수단(enum 클래스 사용)
 * location 장소
 * user 작성자,동행인
 * content 본문내용 (이미지포함->  데이터 전송방식 프론트, AOS,IOS협의필요)
 * review 후기
 * hashtag 게시글 해시태그
 * comments - 댓글리스트
 * createdAt - 작성일자
 * updatedAt  - 수정일자
 * likes - 추천 수
 *
 */
@Getter
public class Diary implements Comparable<Diary> {
    private Long id;
    private String title;
    private String titlePhoto;
    private Transport transport;
    private String location;
    private ArrayList<Member> user;
    private String content;
    private String review;
    private String hashtag;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ArrayList<Comment> comments;
    private Long likes;
    @Builder
    public Diary(Long id, String title, String titlePhoto, Transport transport,
                 String location, ArrayList<Member> user, String content, String review,
                 String hashtag, LocalDateTime createdAt, LocalDateTime updatedAt,
                 ArrayList<Comment> comments, Long likes) {
        this.id = id;
        this.title = title;
        this.titlePhoto = titlePhoto;
        this.transport = transport;
        this.location = location;
        this.user = user;
        this.content = content;
        this.review = review;
        this.hashtag = hashtag;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.comments = comments;
        this.likes = likes;
    }

    @Override
    public int compareTo(Diary o) {
        return this.updatedAt.compareTo(o.updatedAt);
    }
}
