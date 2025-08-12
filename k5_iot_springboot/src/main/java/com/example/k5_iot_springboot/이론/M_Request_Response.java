package com.example.k5_iot_springboot.이론;
/*
    === 요청(Request) & 응답(Response) ===

    1. 요청
        1) start line: Request Message의 시작 라인 (3가지로 구성)
            - HTTP 메서드: GET,POST, PUT. DELETE 등
            - Request Target: HTTP Request 가 전송되는 목표 주소

        2) headers: 해당 Request에 대한 추가 정보를 담는 부분
        3) body: 해당 Request가 전송하는 데이터를 담는 부분 (전송하는 데어터가 없으면 비워짐)

    2. 응답
        1) status line: Response 의상태를 간략하게 나타냄
            - HTTP Version
            - Status Code
            - Status Text

        2) headers
        3) body: 데이터를 전송할 필요가 없는 경우 생략 가능

     === 스프링부트 응답 데이터 정형화 ===
     : 데이터 전송이 일관성을 유지하기 위해 사용
     - 클라이언트(프론트맨드)가 항상 예측 가능한 구조의 응답을 받을 수 있도록 설계

     1)ResponseEntity
        : 스트링에서 HTTP 응답 전체를 제어할 수


 */
public class M_Request_Response {
}
