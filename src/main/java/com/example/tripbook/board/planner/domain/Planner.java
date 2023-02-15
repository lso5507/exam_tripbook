package com.example.tripbook.board.planner.domain;

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
 * location - 장소
 * dateTime - 일정
 * companion - 동행인
 * accommodation - 숙소(추후 위치정보 연동필요)
 * transport - 교통수단
 * memo - 메모
 *
 */
@Getter
public class Planner implements Comparable<Planner> {
    private final Long id;
    private String title;
    private String location;
    private LocalDateTime dateTime;
    private ArrayList<Member> companion;
    private String accommodation;
    private Transport transport;
    private String memo;
    private String hashtag;
    @Builder
    public Planner(Long id, String title, String location, LocalDateTime dateTime, ArrayList<Member> companion, String accommodation, Transport transport, String memo, String hashtag) {
        this.id = id;
        this.title = title;
        this.location = location;
        this.dateTime = dateTime;
        this.companion = companion;
        this.accommodation = accommodation;
        this.transport = transport;
        this.memo = memo;
        this.hashtag = hashtag;
    }

    @Override
    public int compareTo(Planner o) {
        return this.dateTime.compareTo(o.dateTime);
    }
}
