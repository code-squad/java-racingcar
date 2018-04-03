package racingGame;

import java.util.List;

public class Printer {
    static int printAll(List<Car> cars) { //1. Pobi님!! print()가 테스트를 통과하면 printAll() 테스트없이도 오류없는 코드라 확정해도 될까요?
        int result=0;
        for(Car car : cars) {
            result += print(car);
        }
        System.out.println("");
        return result;
    }

    static int print(Car car) {
        int carPosition = car.getPosition();
        int result = 0; //2. Pobi님!! 테스트를 위해 result 변수를 사용했는데 테스트를 위해 프로덕션 코드에 변수를 추가하는것이 바람직한가요?
        for(int i=0; i<carPosition; ++i) {
            System.out.print("-");
            result++;
        }
        System.out.println("");
        return result;
    }
}
