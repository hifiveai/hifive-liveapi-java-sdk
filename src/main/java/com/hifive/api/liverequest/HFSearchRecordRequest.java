package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFPageRequest;
import com.hifive.api.response.HFSearchRecordPostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFSearchRecordRequest extends HFPageRequest<HFSearchRecordPostResponse> {

    @Override
    public String getApiMethodName() {
        return "LiveSearchHistory";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("page", getPage());
                put("pageSize", getPageSize());
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFSearchRecordPostResponse> getResponseClass() {
        return HFSearchRecordPostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
