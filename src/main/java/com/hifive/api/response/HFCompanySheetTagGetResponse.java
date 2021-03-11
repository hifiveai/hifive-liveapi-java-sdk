package com.hifive.api.response;


import com.hifive.api.HifiveResponse;
import com.hifive.api.domain.company.HifiveTag;
import com.hifive.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: alipay.user.get response.
 *
 * @author auto create
 * @since 1.0, null
 */
public class HFCompanySheetTagGetResponse extends HifiveResponse {

    private static final long serialVersionUID = 8416376835315756311L;

    @ApiListField("data")
    private List<HifiveTag> tagList;

    public List<HifiveTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<HifiveTag> tagList) {
        this.tagList = tagList;
    }
}
