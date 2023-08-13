package hello;

public class Car {
    String carName;
    String carModel;
    String carColor;
    int maxSpeed;

    public Car(){
        this("자가용"); // 메개변수 1개인 생성자를 호출
    }

    public Car(String carName){
        this(carName, "쿠페", "파랑", 300); // 메개변수 4개인 생성자를 호출
    }

    // Car 의 필드 4개를 모두 받는 명시 생성자 
    public Car(String carName, String carModel, String carColor, int maxSpeed){
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
    }
}

