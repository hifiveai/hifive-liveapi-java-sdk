package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.company.HifiveCompanySheet;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFCompanySheetPostResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiField("data")
    private HifivePage<HifiveCompanySheet> hifivePage;

    public HifivePage<HifiveCompanySheet> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HifiveCompanySheet> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
