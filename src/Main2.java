class Main2 {

//  int a = 10; // 전역 변수(global variable)

  public static void main(String[] args) {
    int rs = 계산기2.합(30, 40); // 인자 30, 40
    System.out.println(rs);

//    int b = 10; // 지역 변수(local variable)
  }
}

class 계산기2 {
  static int 합(int a, int b) { // 매개변수(int a , b)
    int c = a + b;
    return c;
  }
}

/*
* "return type" "method name()" {
*  return "return_value";
* }
*/

// 인자 : 함수 호출 할 때 함수에게 주는 값
// 매개변수 : 함수가 호출 될 때 외부에서 받은 값을 담는 변수

// 전역변수 : 함수 외부, "프로그램의 시작(만들어진 시점) ~ 끝"
// 지역변수 : 함수 내부, "메서드 시작(함수 내에서 생성된 시적) ~ 메서드 끝"
// 매개변수 : 지역 변수의 일종으로 메서드의 외부와 내부를 연결하는 매개체
// 인자     : args(arguments), 매개변수로 전달되는 데이터

// 인자와 매개변수의 타입과 갯수는 일치해야 한다