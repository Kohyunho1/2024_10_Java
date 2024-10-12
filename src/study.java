class study {
  public static void main(String[] args) {
//    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//    int sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr[7] + arr[8] + arr[9];

//    int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int[] arr = new int[10];
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i + 1) * 10;
    }

//    int i = 0;
//    while (i < arr.length) {
//      sum += arr[i];
//      i++;
//    }
//    System.out.println(sum);

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println(sum);

    int avg = sum / arr.length;
    System.out.println(avg);
  }
}
/*
1. 키워드 new를 통해서 객체 한 개 생성
2. 객체가 int[3] 인 경우 배열이고 그 공간의 갯수는 3
3. 객체는 직접 접근 불가능하므로 원격을 접근해야 한다(변수를 통해서)
4. 객체의 종류는 다양하고 무한하다(현실의 실체가 존재하는 모든것)
 */