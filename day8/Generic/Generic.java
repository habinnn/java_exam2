//package day8.Generic;
//
//public class Generic {
//    public static void main(String[] args) {
//        저장소<Integer> a저장소 = new 저장소<>();
//        a저장소.setData();
//
//        int num1 = a저장소.getData();
//
//        저장소<사과> b저장소 = new 저장소<>();
//
//        b저장소.setData((new 사과());
//        사과 b사과 = b저장소.getData();
//
//    }
//}
//
// 자료형을 정해 놓지 않는다. -> 제너릭
// 타입배개변수를 사용. -> <타입변수>
// 똑같은 기능인데 타입이 다라 클래스가 여러개 생기는 것을 해결하기 위해 도입
// 일반적으로 자료형은 명확한 것이 좋다. 따라서 Object로 저장하는 것보다
// 가능하면 배열처럼 동일한 자료형끼리 저장하고 사용하는 것이 좋다.
//class 저장소<T> {
//
//    public static print(int num){
//        System.out.println(num);
//    }
//    private Object data;
//
//    T getData(){
//        return (T)data;
//    }
//
//    void setData(T inputedData){
//        this.data = inputedData;
//
//    }
//}
