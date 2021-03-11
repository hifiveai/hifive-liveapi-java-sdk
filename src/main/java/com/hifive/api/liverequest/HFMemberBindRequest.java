package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFMemberBindPostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMemberBindRequest extends HFBaseRequest<HFMemberBindPostResponse> {

    /**
     * 外部会员ID
     */
    private String memberId;
    /**
     * 外部公会ID
     */
    private String sociatyId;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
        setClientId(memberId);
    }

    public String getSociatyId() {
        return sociatyId;
    }

    public void setSociatyId(String sociatyId) {
        this.sociatyId = sociatyId;
    }

    @Override
    public String getApiMethodName() {
        return "LiveBindMember";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("memberId", memberId);
                put("sociatyId", sociatyId);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMemberBindPostResponse> getResponseClass() {
        return HFMemberBindPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
