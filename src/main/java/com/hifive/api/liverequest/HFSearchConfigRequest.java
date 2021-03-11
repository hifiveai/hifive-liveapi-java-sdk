package com.hifive.api.liverequest;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFSearchConfigGetResponse;

import java.util.Map;

/**
 * TOP API: hifive.channel.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFSearchConfigRequest extends HFBaseRequest<HFSearchConfigGetResponse> {


    @Override
    public String getApiMethodName() {
        return "LiveSearchMusicConfig";
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
    public Class<HFSearchConfigGetResponse> getResponseClass() {
        return HFSearchConfigGetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
