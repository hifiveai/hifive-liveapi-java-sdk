package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.company.HifiveSearchRecord;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFSearchRecordPostResponse extends HifiveResponse {


    @ApiField("data")
    private HifivePage<HifiveSearchRecord> hifivePage;

    public HifivePage<HifiveSearchRecord> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HifiveSearchRecord> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
