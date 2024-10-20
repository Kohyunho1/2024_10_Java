package com.KoreaIT.java.AM.controller;

import com.KoreaIT.java.AM.dto.Member;
import com.KoreaIT.java.AM.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberController extends Controller {

  private Scanner sc;
  private List<Member> members;

  public MemberController(Scanner sc) {
    this.sc = sc;
    members = new ArrayList<>();
  }

  int lastMemberId = 3;

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

  public void doLogin() {

    if (isLogined) {
      System.out.println("이미 로그인 상태입니다");
      return;
    }

    Member member = null;

    while (true) {
      System.out.print("아이디 : ");
      String loginId = sc.nextLine();
      System.out.print("비밀번호 : ");
      String password = sc.nextLine();
      // 얘 있나? -> 현재 로그인을 시도하는 사용자가 입력한 아이디랑 일치하는 회원이 나한테 있는가?
      // 뒤져봐야겠다 -> members 를
      member = getMemberByLoginId(loginId);
      if (member == null) {
        System.out.println("일치하는 회원이 없습니다");
        continue;
      }
      // 회원 찾았다!
      if (member.password.equals(password) == false) {
        System.out.println("비밀번호가 일치하지 않습니다");
        continue;
      }
      break;
    }

    isLogined = true;
    loginedMember = member;
    System.out.printf("로그인 성공! (%s)\n", member.name);
  }
  public void doLogout() {
    if (!isLogined) {
      System.out.println("이미 로그아웃 상태입니다");
      return;
    }
    isLogined = false;
    loginedMember = null;
    System.out.println("로그아웃 성공!");
  }

  private boolean isJoinableLoginId(String loginId) {
    for (Member member : members) {
      if (member.loginId.equals(loginId)) {
        return false;
      }
    }
    return true;
  }

  private Member getMemberByLoginId(String loginId) {
    for (Member member : members) {
      if (member.loginId.equals(loginId)) {
        return member;
      }
    }
    return null;
  }

  public void makeTestData() {
    System.out.println("테스트를 위한 회원 데이터를 생성합니다.");
    members.add(new Member(1, Util.getNowDateTimeStr(), "test1", "test1", "test1"));
    members.add(new Member(2, Util.getNowDateTimeStr(), "test2", "test2", "test2"));
    members.add(new Member(3, Util.getNowDateTimeStr(), "test3", "test3", "test3"));
  }
}
