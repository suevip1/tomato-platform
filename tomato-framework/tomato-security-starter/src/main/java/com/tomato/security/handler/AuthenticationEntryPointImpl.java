package com.tomato.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tomato.common.resp.Resp;
import com.tomato.jackson.utils.JacksonUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import java.io.IOException;

/**
 * 认证失败处理类->未登录访问，前端重定向到登录页
 *
 * @author lizhifu
 * @since 2022/12/16
 */
@Slf4j
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        log.info("[commence][访问 URL({}) 时，没有登录({})]", request.getRequestURI(), authException.getLocalizedMessage());
        // 请求授权失败，需要进行用户认证。客户端可再次发起请求、并在请求头中提供一个包含认证证书、如会话跟踪cookie
        Resp<Void> resp = Resp.buildFailure(String.valueOf(HttpStatus.UNAUTHORIZED.value()),"未登录访问");
        response.setStatus(HttpStatus.OK.value());
        // TODO 这里使用 deprecated, 官方说浏览器已经默认支持utf8了
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        JacksonUtils.objectMapper().writeValue(response.getWriter(), resp);
    }
}
