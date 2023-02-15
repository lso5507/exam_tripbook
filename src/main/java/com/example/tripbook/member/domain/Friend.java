package com.example.tripbook.member.domain;

import com.example.tripbook.member.dto.MemberProfile;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Friend{
    private ArrayList<MemberProfile> member;
    @Builder
    public Friend(ArrayList<MemberProfile> member) {
        this.member = member;
    }
}
