# vue_spring
# **Title -** *사용자의 정보로 Profile 생성*

*작업은 Vue & Spring으로 진행할 예정이다.*

### DB -> Postgresql
```
User Data Model
id 계정 String -> varchar()

name 닉네임 String -> varchar()

password 비밀번호 String -> varchar();

address 집 주소 String -> varchar();

email 메일 String -> varchar()

phoneNumber 폰번호 String -> varchar()

age 나이 integer -> int

authority 권한 enum -> varchar()

craeteAt 만들어진시간 LocalDateTime -> timestamp

saveAt User의 정보를 수정한시간 LocalDateTime -> timestamp
```

## Content
```
1.로그인함 계정이 없는 경우 회원가입.
2.계정을 생성할때 사용자에 관한 필수 정보들을 받음.
3.입력한 필수 값에 따라 Profile을 만들어줌.
4.선택한 레이아웃으로 profile을 생성
5.Contents란에 나의 Spec을 적음 save 버튼을 누를시 DB에 저장

어드민 권한을 가지고 있는 사람을 사용자 권한인 사람들을 관리할 수 있음.
```

## Vue
```vue.js
component 기반의 프레임 워크 구조를 잘 짜봅시다.
vuex
babel
vue router
vue-apollo graphql
markDown 사용 가능한 웹 페이지 만들 것임

사용자 관리 페이지 개발
레이아웃 선택 페이지 개발
사용자의 프로필 페이지 개발
사용자의 콘텐츠 페이지 개발
```

# Java
```
  Graphql Server Settings,
  DB Entity 설계
  Login 설계
```