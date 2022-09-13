### MVC 패턴이란?

MVC란? 

**M**odel-**V**iew-**C**ontroller의 약자 

애플리케이션을 세가지 역할로 구분한 개발 방법론

![img](https://blog.kakaocdn.net/dn/bDpdks/btrjV9EuRJ3/egwkkBELr5i0oYOv4t9Qy1/img.png)

1. 사용자가 Controller를 조작하면 Controller는 Model을 통해 데이터를 가져옴.

2. 그 데이터를 바탕으로 View를 통해 시각적 표현을 제어
3. 사용자에게 전달



#### 모델 (Model)

모델은 **데이터 + 상태 + 비즈니스 로직**

**뷰나 컨트롤러에 묶이지 않으므로 많은 곳에서 재사용 가능**



#### 뷰 (View)

뷰는 모델의 **표현**

앱과 상호작용 할 때 컨트롤러와 통신하는 책임을 맡음



#### 컨트롤러 (Controller)

앱을 묶어주는 **접착제**

안드로이드 앱에서는 컨트롤러가 주로 액티비티나 프래그먼트로 표현

![Tic Tac Toe - MVC](https://images.contentful.com/emmiduwd41v7/2XWsL8SmQEg24GIegMsOOs/a595a0352d2dd26ead78a338c16b8419/MVCsvg.svg)



#### 컨트롤러 문제점

- 테스트 용이성 - 유닛 테스트 어려움
- 모듈화 및 유연성 - 뷰를 변경하면 컨트롤러로 돌아가서 변경해야함
- 유지 보수 - 시간이 지남에 따라 보다 많은 코드가 컨트롤러로 모이면서 문제 발생 쉬워짐
