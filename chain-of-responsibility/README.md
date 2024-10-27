# Chain Of Responsibility pattern

명령 객체와 일련의 처리 객체를 포함하는 디자인패턴

각자의 처리 객체는 명령 객체를 처리할 수 있는 연산의 집합이고, 체인 안의 처리 객체가 핸들할 수 없는 명령은
다음 처리 객체로 넘겨진다.

이 작동 방식은 새로운 처리 객체부터 체인의 끝까지 다시 반복된다.
