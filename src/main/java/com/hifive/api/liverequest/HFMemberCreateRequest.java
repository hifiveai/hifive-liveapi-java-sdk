package com.hifive.api.liverequest;


import com.hifive.api.ApiRuleException;
import com.hifive.api.internal.util.HifiveHashMap;
import com.hifive.api.request.HFBaseRequest;
import com.hifive.api.response.HFMemberCreatePostResponse;

import java.util.Map;

/**
 * TOP API: hifive.user.get request
 *
 * @author auto create
 * @since 1.0, 2013-12-08 16:51:41
 */
public class HFMemberCreateRequest extends HFBaseRequest<HFMemberCreatePostResponse> {

    /**
     * 会员名称
     */
    private String memberName;
    /**
     * 会员外部ID
     */
    private String memberId;
    /**
     * 公会名称
     */
    private String sociatyName;
    /**
     * 公会外部ID
     */
    private String sociatyId;
    /**
     * 头像URL
     */
    private String headerUrl;
    /**
     * 性别,未知：0，男：1，女：2
     */
    private Integer gender;
    /**
     * 生日
     */
    private Long birthday;
    /**
     * 经纬度信息，纬度在前(30.779164,103.94547)
     */
    private String location;
    /**
     * 喜欢的歌手名，多个用英文逗号隔开
     */
    private String favoriteSinger;
    /**
     * 手机号
     */
    private String phone;


    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
        setClientId(memberId);
    }

    public String getSociatyName() {
        return sociatyName;
    }

    public void setSociatyName(String sociatyName) {
        this.sociatyName = sociatyName;
    }

    public String getSociatyId() {
        return sociatyId;
    }

    public void setSociatyId(String sociatyId) {
        this.sociatyId = sociatyId;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFavoriteSinger() {
        return favoriteSinger;
    }

    public void setFavoriteSinger(String favoriteSinger) {
        this.favoriteSinger = favoriteSinger;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getApiMethodName() {
        return "LiveCreateMember";
    }

    @Override
    public Map<String, String> getTextParams() {
        HifiveHashMap txtParams = new HifiveHashMap() {
            {
                put("memberName", memberName);
                put("memberId", memberId);
                put("sociatyName", sociatyName);
                put("sociatyId", sociatyId);
                put("headerUrl", headerUrl);
                put("gender", gender);
                put("birthday", birthday);
                put("location", location);
                put("favoriteSinger", favoriteSinger);
                put("phone", phone);
            }
        };
        return txtParams;
    }

    @Override
    public Class<HFMemberCreatePostResponse> getResponseClass() {
        return HFMemberCreatePostResponse.class;
    }

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public void putOtherTextParam(String key, String value) {

    }

}
