package com.example.cherrypickserver.member.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Provider {

  KAKAO("카카오");

  private final String name;
}
