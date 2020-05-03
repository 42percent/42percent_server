####> This is a first blockqute.
>	> This is a second blockqute.
>	>	> This is a third blockqute.

1. First

`````
Black wow
`````

* 1. First of First
    2. Second of First
    3. third of First
       

    <pre>
    <code>
    public class BootSpringBootApplication {
      public static void main(String[] args) {
        System.out.println("Hello, min woo");
      }
    
    }
    </code>
    </pre>
    Entering to database & Docker compsoe 

    # 1.

spring.datasource.url=jdbc:mysql://

- 앞에 jdbc:mysql:// 항상 명시

jdbc:mysql://127.0.0.1:8000/42percent 

- host:port / 스키마 정보

---

```
spring.datasource.url=jdbc:mysql://127.0.0.1:8000/42percent
spring.datasource.username=root
spring.datasource.password=example
```

# 2.

Docker compose,

하나의 컨테이너말고 여러개의 컨테이너를 바탕으로 실행될때  이용

 ex) DB, Web,

```jsx
version: '3.1'
services:
db:
image: mysql
command: --default-authentication-plugin=mysql_native_password
restart: always
environment:
 MYSQL_ROOT_PASSWORD: example
volumes:
  - ./data:/var/lib/mysql
ports:
  - 8000:3306
```

VerSion : yml 버전

services : 사용하고자하는 컨테이너 항목

volumes : [바인드마운트 경로]:[컨테이너 상의 마운트 경로]로 설정을 표기하며, 예시의 경우 현재 디렉토리를 컨테이너 상의 /mysql 디렉토리에 마운트한다는 의미

TIP)How to open VScode from Git bash

-VS code에서 경로 설정을 git bash로 잡아줘야함 

FOLLOW THIS 

1.Ctrl + , 눌러 설정에 들어가기

2.설정에 [terminal.integrated.shell.windows](http://terminal.integrated.shell.windows)  검색 

3.설정 경로에 Bash 가 설치된 경로  넣기 

ex)"terminal.integrated.shell.windows": "C:\\Program Files\\Git\\bin\\bash.exe",

