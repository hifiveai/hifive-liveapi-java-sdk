package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFMemberCancelPostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMemberCancelRequest extends HFBaseRequest<HFMemberCancelPostResponse> {

    /**
     * 会员外部ID
     */
    private String memberId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
        setClientId(memberId);
    }

    @Override
    public String getApiMethodName() {
        return "LiveCancelMember";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("memberId", memberId);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMemberCancelPostResponse> getResponseClass() {
        return HFMemberCancelPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
