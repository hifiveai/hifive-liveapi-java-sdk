package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.company.HifiveChannel;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFCompanyChannelGetResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiListField("data")
    private List<HifiveChannel> channelList;

    public List<HifiveChannel> getChannelList() {
        return channelList;
    }

    public void setChannelList(List<HifiveChannel> channelList) {
        this.channelList = channelList;
    }
}
