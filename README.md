## 
css 파일과 같은 정적 리소스 파일이 브라우저에서 disk cache 되어 있어서,
css 파일을 변경해도 변하지 않고, 유저가 캐쉬를 삭제하거나, 캐쉬하는 시간이 만료되야 반영됨

보통은 css파일의 뒤에 시간,날짜를 찍는다.

Spring에서는 file의 뒤에 finger-print 형태로 변화된 파일명 뒤에 이름을 붙여준다.

## 참고
https://www.baeldung.com/spring-mvc-static-resources