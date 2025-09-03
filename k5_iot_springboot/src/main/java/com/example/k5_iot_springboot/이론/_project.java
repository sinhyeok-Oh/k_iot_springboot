package com.example.k5_iot_springboot.이론;

/*
 * [ 스프링부트 CRUD 연습 프로젝트 - 예약(Booking) 시스템 ]
 * : 헬스/교육/수면코칭 등 "서비스"를 등록하고, 사용자가 원하는 시간대에 예약하는 구조
 *
 * 1. 도메인 개요 (엔티티 3개 - User 제외)
 *
 * == 1) Program: 제공되는 서비스
 *       Program : Reservation = 1 : N
 *       Program : ProgramDetail = 1 : 1
 *
 * == 2) ProgramDetail: Program의 상세 정보 (설명, 소요시간, 장소 등)
 *       ProgramDetail : Program = 1 : 1
 *
 * == 3) Reservation: 사용자가 특정 시간대에 예약한 레코드
 *       Reservation : Program = N : 1
 *       Reservation : G_User = N : 1 (G_User는 기존 엔티티 사용)
 *
 * OneToOne: Program — ProgramDetail
 * OneToMany / ManyToOne: Program(1) — Reservation(N)
 * ManyToOne: Reservation(N) — User(1)
 *
 * */
public class _project {
}
