package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.common.HifiveRecommandPage;
import com.hifive.api.domain.company.HifiveMusic;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFMusicPostResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiField("data")
    private HifiveRecommandPage<HifiveMusic> hifiveRecommandPage;

    public HifiveRecommandPage<HifiveMusic> getHifiveRecommandPage() {
        return hifiveRecommandPage;
    }

    public void setHifiveRecommandPage(HifiveRecommandPage<HifiveMusic> hifiveRecommandPage) {
        this.hifiveRecommandPage = hifiveRecommandPage;
    }
}
