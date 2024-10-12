class object {
  public static void main(String[] args) {
    boolean[] arr1 = new boolean[3];

    arr1[0] = true;
    arr1[1] = true;
    arr1[2] = false;

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    double[] arr2 = {3.14, 5.57, 10.0};

//    arr2[0] = 3.14;
//    arr2[1] = 5.57;
//    arr2[2] = 10.0;

    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);

    int[] arr3 = new int[10];

    for (int i = 0; i < arr3.length; i++) {
      arr3[i] = i+1;
    }

    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }

//    arr3[0] = 1;
//    arr3[1] = 2;
//    arr3[2] = 3;
//    arr3[3] = 4;
//    arr3[4] = 5;
//    arr3[5] = 6;
//    arr3[6] = 7;
//    arr3[7] = 8;
//    arr3[8] = 9;
//    arr3[9] = 10;

//    System.out.println(arr3[0]);
//    System.out.println(arr3[1]);
//    System.out.println(arr3[2]);
//    System.out.println(arr3[3]);
//    System.out.println(arr3[4]);
//    System.out.println(arr3[5]);
//    System.out.println(arr3[6]);
//    System.out.println(arr3[7]);
//    System.out.println(arr3[8]);
//    System.out.println(arr3[9]);

    String[] arr4 = {"hello", "world", "!"};

    System.out.println(arr4[0]);
    System.out.println(arr4[1]);
    System.out.println(arr4[2]);
  }
}

/*
1. 키워드 new를 통해서 객체 한 개 생성
2. 객체가 int[3] 인 경우 배열이고 그 공간의 갯수는 3
3. 객체는 직접 접근 불가능하므로 원격을 접근해야 한다(변수를 통해서)
4. 객체의 종류는 다양하고 무한하다(현실의 실체가 존재하는 모든것)
 */