//package com.hisujung.microservice.filter;
//
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//@Component
//public class CustomGlobalFilter implements GlobalFilter, Ordered {
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        // 토큰 검증 로직 및 회원 ID 추출
//        String token = extractToken(exchange);
//        String memberId = validateTokenAndGetMemberId(token);
//
//        // 회원 ID를 요청 헤더에 추가
//        exchange.getRequest().mutate().header("X-Member-Id", memberId).build();
//        return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return -1;  // 필터 순서 설정
//    }
//
//    private String extractToken(ServerWebExchange exchange) {
//        // 토큰 추출 로직
//    }
//
//    private String validateTokenAndGetMemberId(String token) {
//        // 토큰 검증 및 회원 ID 추출 로직
//    }
//}
//
