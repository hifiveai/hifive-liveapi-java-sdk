package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFSociatyCancelPostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFSociatyCancelRequest extends HFBaseRequest<HFSociatyCancelPostResponse> {

    /**
     * 会员外部ID
     */
    private String sociatyId;

    public String getSociatyId() {
        return sociatyId;
    }

    public void setSociatyId(String sociatyId) {
        this.sociatyId = sociatyId;
    }

    @Override
    public String getApiMethodName() {
        return "LiveCancelSociaty";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("sociatyId", sociatyId);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFSociatyCancelPostResponse> getResponseClass() {
        return HFSociatyCancelPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
