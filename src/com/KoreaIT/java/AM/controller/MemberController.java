package com.KoreaIT.java.AM.controller;

import com.KoreaIT.java.AM.dto.Member;
import com.KoreaIT.java.AM.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController {

  private Scanner sc;
  List<Member> members;

  public MemberController(Scanner sc) {
    this.sc = sc;
    members = new ArrayList<>();
  }

  int lastMemberId = 0;

  public void dojoin() {
    int id = lastMemberId + 1;
    lastMemberId = id;

    String regDate = Util.getNowDateTimeStr();
    String loginId = null;

    while (true) {
      System.out.printf("아이디 : ");
      loginId = sc.nextLine();
      if (isJoinableLoginId(loginId) == false) {
        System.out.println("이미 가입된 아이디입니다");
        continue;
      }
      break;
    }
    String password = null;
    while (true) {
      System.out.printf("비밀번호 : ");
      password = sc.nextLine();
      System.out.printf("비밀번호 확인 : ");
      String passwordCk = sc.nextLine();
      if (password.equals(passwordCk) == false) {
        System.out.println("비밀번호가 일치하지 않습니다");
        continue;
      }
      break;
    }
    System.out.printf("이름 : ");
    String name = sc.nextLine();

    Member member = new Member(id, regDate, loginId, password, name);
    members.add(member);

    System.out.printf("%s님 회원이 가입되었습니다\n", name);

  }

  private boolean isJoinableLoginId(String loginId) {
    for (int i = 0; i < members.size(); i++) {
      Member member = members.get(i);
      if (member.loginId.equals(loginId)) {
        return false;
      }
    }
    return true;
  }
}
