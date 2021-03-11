package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.common.HifivePage;
import com.hifive.api.domain.company.HifiveMusic;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFMemberSheetMusicPostResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiField("data")
    private HifivePage<HifiveMusic> hifivePage;

    public HifivePage<HifiveMusic> getHifivePage() {
        return hifivePage;
    }

    public void setHifivePage(HifivePage<HifiveMusic> hifivePage) {
        this.hifivePage = hifivePage;
    }
}
