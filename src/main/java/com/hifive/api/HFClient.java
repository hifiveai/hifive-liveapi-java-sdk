package com.hifive.api;


/**
 * HIFIVE客户端。
 *
 * @author yong.huang
 * @since 1.0, Sep 12, 2009
 */
public interface HFClient {

    /**
     * 执行TOP公开API请求。
     *
     * @param <T> 请求入参
     * @param request 具体的TOP请求
     * @return 返回结果
     * @throws ApiException 请求异常
     */
    <T extends HifiveResponse> T execute(HifiveRequest<T> request) throws ApiException;

    /**
     * 执行TOP隐私API请求。
     *
     * @param <T> 请求入参
     * @param request 具体的TOP请求
     * @param session 用户会话授权码
     * @return 返回结果
     * @throws ApiException 请求异常
     */
    <T extends HifiveResponse> T execute(HifiveRequest<T> request, String session) throws ApiException;
}
