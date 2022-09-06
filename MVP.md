## MVP란

**M**odel **V**iew **P**resenter 패턴 

- **MVC**(Model View Controller) 패턴을 기반으로 하는 아키텍처 패턴

- 관심사의 분리를 높임
- 단위 테스트를 용이하게 함

(MVC 패턴에서 View와 Model의 의존성을 없애고 단위 테스트가 어려웠던 문제점을 해결하기 위해 등장하게 된 패턴이라고 할 수 있다.)

![post-thumbnail](https://velog.velcdn.com/images/bang/post/bc4ddaaa-64e7-4052-a657-beb97d05b556/mvp.png)

#### Model

- 앱에 사용되는 데이터를 관리 담당하는 역할을 함
- '비즈니스 로직'
- network API, 데이터 캐싱, 데이터베이스 등이 포함
- Repository pattern을 사용하는 경우 Repository도 포함

(Repository pattern이란 : 

Data의 출처에 관계 없이 동일한 인터페이스로 데이터에 접근할 수 있도록 하는 패턴

즉, DataSource를 캡슐화 시킴)



#### View

- 사용자 인터페이스 영역
- Activity, Fragment 등이 포함
- 데이터를 표시하는 역할만 함
- Presenter를 통해서 데이터를 요청, 전달 받음 (Presenter에 의존적)



#### Presenter

- View와 Model 사이 중개자 역할을 담당

- View에서 사용자 이벤트를 받음 -> Model에 데이터를 요청 -> 전달받은 데이터 View에 전달

  (MVVM의 ViewModel과 비교했을 때 ViewModel은 View를 알지 못함

  but Presenter는 View와 Model 모두 참조 하고 있음)
