package com.KoreaIT.java.AM;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int lastArticleId = 0;
    List<Article> articles = new ArrayList<>();

    while (true) {
      System.out.printf("명령어 ) ");
      String cmd = sc.nextLine().trim();

      if (cmd.length() == 0) {
        System.out.println("명령어를 입력하세요");
        continue;
      }

      if (cmd.equals("system exit")) {
        System.out.println("==프로그램 종료==");
        break;
      }

      if (cmd.equals("article list")) {
        if (articles.size() == 0) {
          System.out.println("게시글이 없습니다");
          continue;
        } else {
          System.out.println("번호  |  제목");
          for (int i = articles.size() - 1; i >= 0; i--) {
            Article article = articles.get(i);
            System.out.printf("%d  |  %s\n", article.id, article.title);
          }
        }
      } else if (cmd.equals("article write")) {
        int id = lastArticleId + 1;
        lastArticleId = id;

        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();
        LocalDate now = LocalDate.now();

        Article article = new Article(id, title, body, now);
        articles.add(article);

        System.out.printf("%d번 글이 생성되었습니다\n", id);
      } else if (cmd.startsWith("article detail ")) {

        String[] cmdDiv = cmd.split(" ");

        // article detail 1 => "1" -> 1
        int id = Integer.parseInt(cmdDiv[2]);

        Article foundArticle = null;

        for (int i = 0; i < articles.size(); i++) {
          Article article = articles.get(i);
          if (article.id == id) {
            foundArticle = article;
            break;
          }
        }

        if (foundArticle == null) {
          System.out.printf("%d번 게시글은 없습니다.\n", id);
        } else {
            System.out.printf("번호 : %d\n", foundArticle.id);
            System.out.printf("날짜 : %s\n", foundArticle.now);
            System.out.printf("제목 : %s\n", foundArticle.title);
            System.out.printf("내용 : %s\n", foundArticle.body);
        }

      } else {
        System.out.println("존재하지 않는 명령어입니다");
      }
    }
  }
}

class Article {
  int id;
  String title;
  String body;
  LocalDate now;

  // 생성자
  public Article(int id, String title, String body, LocalDate now) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.now = now;
  }
}