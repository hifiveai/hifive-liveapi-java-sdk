package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.company.HifiveMusicDetail;
import com.hifive.api.internal.mapping.ApiField;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFMusicDetailPostResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiField("data")
    private HifiveMusicDetail hifiveMusicDetail;

    public HifiveMusicDetail getHifiveMusicDetail() {
        return hifiveMusicDetail;
    }

    public void setHifiveMusicDetail(HifiveMusicDetail hifiveMusicDetail) {
        this.hifiveMusicDetail = hifiveMusicDetail;
    }
}
