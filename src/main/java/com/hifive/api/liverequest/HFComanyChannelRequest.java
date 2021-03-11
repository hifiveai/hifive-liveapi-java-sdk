package com.hifive.api.liverequest;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFCompanyChannelGetResponse;

import java.util.Map;

/**
 * TOP API: hifive.channel.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFComanyChannelRequest extends HFBaseRequest<HFCompanyChannelGetResponse> {


    @Override
    public String getApiMethodName() {
        return "LiveChannel";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFCompanyChannelGetResponse> getResponseClass() {
        return HFCompanyChannelGetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
