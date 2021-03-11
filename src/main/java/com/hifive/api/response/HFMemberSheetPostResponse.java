package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.company.HifiveMemberSheet;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFMemberSheetPostResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiField("data")
    private HifivePage<HifiveMemberSheet> hifivePage;

    public HifivePage<HifiveMemberSheet> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HifiveMemberSheet> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
