package com.hifive.api.liverequest;

import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFCompanySheetTagGetResponse;

import java.util.Map;

/**
 * TOP API: hifive.channel.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFComanySheetTagRequest extends HFBaseRequest<HFCompanySheetTagGetResponse> {

    @Override
    public String getApiMethodName() {
        return "LiveSheetTag";
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
    public Class<HFCompanySheetTagGetResponse> getResponseClass() {
        return HFCompanySheetTagGetResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {

    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }
}
