package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.company.HifiveSearchConfig;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFSearchConfigGetResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiListField("data")
    private List<HifiveSearchConfig> configList;

    public List<HifiveSearchConfig> getConfigList() {
        return configList;
    }

    public void setConfigList(List<HifiveSearchConfig> configList) {
        this.configList = configList;
    }
}
