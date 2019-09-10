# BaseballGame Project

Kotlin 언어를 이용해 간단한 야구게임 안드로이드 앱 만드는 프로젝트









## 예상 레이아웃





### 1) 메인화면

게임시작과 게임 설명 버튼이 있다. 게임 설명을 누르면 2번 레이아웃으로 넘어가고 게임 시작버튼을 누르면 3번으로 넘어간다.

![01](https://user-images.githubusercontent.com/49340180/64612039-cbc72480-d40d-11e9-9b40-a5d02374d1a7.PNG)



### 2) 게임설명

간단한 게임룰이 적혀있다. 상단에 다시 메인 메뉴로 갈 수 있는 버튼이 생긴다.

![02](https://user-images.githubusercontent.com/49340180/64612041-cc5fbb00-d40d-11e9-867b-dd5e63b82aa4.PNG)



### 3-1) 랜덤번호 생성

메인 메뉴의 게임시작 버튼을 누르면 넘어오는 창으로, 유저가 맞출 번호를 랜덤으로 생성한다. 번호는 0~9 사이의 3자리 수로 0으로 시작하지 않고, 중복되지 않은 숫자로 발생된다.

![03](https://user-images.githubusercontent.com/49340180/64612042-cc5fbb00-d40d-11e9-8fe6-8feb088df9a1.PNG)



### 3-2) 랜덤번호 생성

번호 생성 버튼을 누르면 번호가 생성되고 이미지가 바뀐다. 그리고 게임 시작 버튼이 생긴다. 게임 시작 버튼을 누르면 4번으로 넘어간다.

![04](https://user-images.githubusercontent.com/49340180/64612043-cc5fbb00-d40d-11e9-85f5-56ee3297dc79.PNG)



### 4) 번호입력

여기서는 생성된 번호를 맞추기 위해 유저가 번호를 입력하는 창이다. 만약 번호를 입력하지 않고 결과 확인 버튼을 누르면 "숫자를 입력해주세요"라는 메시지가 뜬다. 밑에 결과입력창은 결과 확인 후 결과를 입력하기 위한 텍스트 창이다.  맞추는 기회는 제한두지 않았다.

![05](https://user-images.githubusercontent.com/49340180/64612044-ccf85180-d40d-11e9-93ef-7e37af93996d.PNG)





### 5-1) ball, strike,out 있을 때 결과창

ball, strike, out이 섞여있을때의 창이다. 물론 ball만 나올때도 이 창이 뜬다.

![06](https://user-images.githubusercontent.com/49340180/64612046-ccf85180-d40d-11e9-8e54-2f371caddead.PNG)



### 5-2) 3out 결과창

결과가 3out일 때의 창이다.

![07](https://user-images.githubusercontent.com/49340180/64612048-ccf85180-d40d-11e9-830c-018b262aff0e.PNG)



### 5-3) 번호를 다 맞춘 결과창

결과가 3strike, 즉 번호를 다 맞췄을때 뜨는 결과창이다. 이때 메인 화면 버튼을 누르면 다시 처음 화면으로 돌아간다.

![08](https://user-images.githubusercontent.com/49340180/64612049-ccf85180-d40d-11e9-8fa5-39d9909c835a.PNG)



### 6) 어떻게 문제를 맞췄는지에 대한 레이아웃 (보류)

5번 다 맞췄을때 예측 내역 버튼이 뜨는데 누르면 여기로 이동한다. 번호를 맞추기 위했던 시도들이 적혀있는 창이다. 근데 이건 안 만들어도 될 거 같아서 최종 앱 완성에는 빠질 수 있는 레이아웃이다.

![09](https://user-images.githubusercontent.com/49340180/64612050-cd90e800-d40d-11e9-853c-53fa4c185aed.PNG)

