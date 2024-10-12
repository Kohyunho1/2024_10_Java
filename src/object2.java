class object2 {
  public static void main(String[] args) {
    //정수, 논리, String으로 구성된 객체를 만들고 값을 저장하고 출력하세요
    홍길동 person1 = new 홍길동();
    person1.age = 22;
    person1.isMarried = false;
    person1.name = "길동";

    person1.age++;
    person1.introduce();

    홍길동 person2 = new 홍길동();
    person2.age = 33;
    person2.isMarried = true;
    person2.name = "길동2";

    person2.introduce();
  }
}

// 명사적인 특징 -> 속성(field, attribute)
class 홍길동 {
  int age;
  boolean isMarried;
  String name;

  void introduce() {
    String name = this.name;
    boolean isMarried = this.isMarried;
    int age = this.age;

    System.out.println("== 자기 소개 ==");
    System.out.printf("이름 : %s\n", this.name);
    System.out.printf("혼인 여부 : %s\n", this.isMarried);
    System.out.printf("나이 : %d\n", this.age);
  }

  // 동사적인 특징(method, 메서드)
  void run() {
    System.out.println("달리다");
  }
}

// 설계도 != 객체
// 설계도 : 객체를 생성하는데 필요한 reference
// 객체 : 설계도(class)를 기반으로 만든 것

/*
1. void method이름() {
    내가 구현할 내용
}
 */