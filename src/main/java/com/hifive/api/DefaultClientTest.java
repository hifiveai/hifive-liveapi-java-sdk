package com.hifive.api;

import com.alibaba.fastjson.JSON;
import com.hifive.api.domain.constants.GenderEnum;
import com.hifive.api.domain.constants.MediaTypeEnum;
import com.hifive.api.liverequest.*;
import com.hifive.api.response.*;

import java.util.Arrays;

public class DefaultClientTest {


    public static void main(String[] args) {
        String url = "https://hifive-gateway-demo.hifiveai.com";
        String appkey = "300a44d050c942eebeae8765a878b0ee";
        String secret = "0e31fe11b31247fca8";
        HFClient client = new DefaultHFClient(url, appkey, secret);
        HifivePostCreateMember(client);
//        HifivePostBindMember(client);
//        HifivePostUnBindMember(client);
//        HifivePostCancelMember(client);
//        HifivePostSociatyCancel(client);

//        HifiveGetCompanySheetList(client);
//        HifiveGetCompanyChannelList(client);
//        HifiveGetCompanySheetTagList(client);
//        HifiveGetCompanySheetMusicList(client);
//        HifiveGetCompanySheetMusicAll(client);
//
//        HifivePostMemberSheetList(client);
//        HifivePostMemberSheetMusicList(client);
//        HifivePostMemberSheetMusicALL(client);
//        HifivePostMusicDetail(client);
//        HifiveRemoveMemberSheetMusic(client);
//        HifiveAddMemberSheetMusic(client);


//        HifivePostReportMusicRecord(client);

//        HifiveGetSearchConfigList(client);
        HifiveGetMusicList(client);
//        HifiveClearSearchHistory(client);
//        HifiveGetSearchRecordList(client);


    }

    private static void HifivePostCreateMember(HFClient client) {
        HFMemberCreateRequest request = new HFMemberCreateRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setBirthday(1594639059L);
        request.setFavoriteSinger("jone");
        request.setGender(GenderEnum.MAN.ordinal());
        request.setHeaderUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1604319582611&di=0e2e37d4b77bec931dcf72401feefca4&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F64%2F52%2F01300000407527124482522224765.jpg");
        request.setLocation("成都2");
        request.setMemberId("hifivetest-meiyang");
        request.setMemberName("jone");

        try {
            HFMemberCreatePostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostBindMember(HFClient client) {
        HFMemberBindRequest request = new HFMemberBindRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setMemberId("hifivetest-meiyang");
        request.setSociatyId("003");
        try {
            HFMemberBindPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostUnBindMember(HFClient client) {
        HFMemberUnbindRequest request = new HFMemberUnbindRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setMemberId("hifivetest-meiyang");
        request.setSociatyId("6");
        try {
            HFMemberUnbindPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostCancelMember(HFClient client) {
        HFMemberCancelRequest request = new HFMemberCancelRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setMemberId(request.getClientId());
        try {
            HFMemberCancelPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostSociatyCancel(HFClient client) {
        HFSociatyCancelRequest request = new HFSociatyCancelRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        request.setSociatyId("14");
        try {
            HFSociatyCancelPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }


    private static void HifiveGetCompanyChannelList(HFClient client) {
        HFComanyChannelRequest request = new HFComanyChannelRequest();
        request.setMethod(HifiveRequest.METHOD_GET);
        request.setVersion("V1.2.1");
        request.setClientId("1740");
        try {
            HFCompanyChannelGetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetCompanySheetTagList(HFClient client) {
        HFComanySheetTagRequest request = new HFComanySheetTagRequest();
        request.setMethod(HifiveRequest.METHOD_GET);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        try {
            HFCompanySheetTagGetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetCompanySheetList(HFClient client) {
        HFCompanySheetRequest request = new HFCompanySheetRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
//        request.setChannelId("gej09ciceh");
        request.setLanguage(0);
        request.setRecoNum(4);
        request.setPage(1);
        request.setPageSize(20);
        request.setClientId("hifivetest-meiyang");
        request.setField(Arrays.asList("album", "sheetTag", "musicTag", "artist"));
        try {
            HFCompanySheetPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetCompanySheetMusicList(HFClient client) {
        HFCompanySheetMusicRequest request = new HFCompanySheetMusicRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setLanguage(0);
        request.setSheetId(1947L);
        request.setField(Arrays.asList("album", "musicTag", "artist"));
        request.setPage(4);
        request.setPageSize(100);
        request.setClientId("hifivetest-meiyang");
        try {
            HFCompanySheetMusicPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

//    private static void HifiveGetCompanySheetMusicAll(HFClient client) {
//        HFCompanySheetMusicAllRequest request = new HFCompanySheetMusicAllRequest();
//        request.setMethod(HifiveRequest.METHOD_POST);
//        request.setVersion("V1.2.1");
//        request.setLanguage(0);
//        request.setSheetId(1773L);
//        request.setField(Arrays.asList("album", "musicTag", "artist"));
//        request.setClientId("hifivetest-meiyang");
//        try {
//            HFCompanySheetMusicAllPostResponse response = client.execute(request);
//            System.out.println(JSON.toJSON(response));
//        } catch (ApiException e) {
//            e.printStackTrace();
//        }
//    }


    private static void HifivePostMemberSheetList(HFClient client) {
        HFMemberSheetRequest request = new HFMemberSheetRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setPage(1);
        request.setPageSize(20);
        request.setClientId("hifivetest-meiyang");
        try {
            HFMemberSheetPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostMemberSheetMusicList(HFClient client) {
        HFMemberSheetMusicRequest request = new HFMemberSheetMusicRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setLanguage(0);
        request.setField(Arrays.asList("album", "musicTag", "artist"));
        request.setSheetId(11567L);
        request.setPage(1);
        request.setPageSize(20);
        request.setClientId("hifivetest-meiyang");
        try {
            HFMemberSheetMusicPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostMemberSheetMusicALL(HFClient client) {
        HFMemberSheetMusicAllRequest request = new HFMemberSheetMusicAllRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setLanguage(0);
        request.setField(Arrays.asList("album", "musicTag", "artist"));
        request.setSheetId(11567L);
        request.setClientId("hifivetest-meiyang");
        try {
            HFMemberSheetMusicAllPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostMusicDetail(HFClient client) {
        HFMusicDetailRequest request = new HFMusicDetailRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setLanguage(0);
        request.setField(Arrays.asList("musicTag", "album", "artist"));
        request.setMusicId("5316CBABB62443");
        request.setPage(1);
        request.setMediaType(MediaTypeEnum.K.getValue());
        request.setPageSize(20);
        request.setClientId("12345678");
        try {
            HFMusicDetailPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveAddMemberSheetMusic(HFClient client) {
        HFSheetMusicAddRequest request = new HFSheetMusicAddRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setSheetId(11567L);
        request.setMusicId("CE61A56F2240");
        request.setClientId("hifivetest-meiyang");
        try {
            HFSheetMusicAddPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveRemoveMemberSheetMusic(HFClient client) {
        HFSheetMusicRemoveRequest request = new HFSheetMusicRemoveRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setSheetId(11567L);
        request.setMusicId("01004159275442");
        request.setClientId("hifivetest-meiyang");
        try {
            HFSheetMusicRemovePostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifivePostReportMusicRecord(HFClient client) {
        HFMusicRecordReportRequest request = new HFMusicRecordReportRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setRecordId(877L);
        request.setMediaType(MediaTypeEnum.L.getValue());
        request.setDuration(100L);
        request.setClientId("hifivetest-meiyang");
        try {
            HFMusicRecordReportPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetSearchConfigList(HFClient client) {
        HFSearchConfigRequest request = new HFSearchConfigRequest();
        request.setMethod(HifiveRequest.METHOD_GET);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        try {
            HFSearchConfigGetResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetMusicList(HFClient client) {
        HFMusicRequest request = new HFMusicRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        request.setKeyword("Follow");
        request.setField(Arrays.asList("musicTag","album","artist"));
        try {
            HFMusicPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveGetSearchRecordList(HFClient client) {
        HFSearchRecordRequest request = new HFSearchRecordRequest();
        request.setMethod(HifiveRequest.METHOD_GET);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        try {
            HFSearchRecordPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    private static void HifiveClearSearchHistory(HFClient client) {
        HFSearchHistoryClearRequest request = new HFSearchHistoryClearRequest();
        request.setMethod(HifiveRequest.METHOD_POST);
        request.setVersion("V1.2.1");
        request.setClientId("hifivetest-meiyang");
        try {
            HFClearSearchHistoryPostResponse response = client.execute(request);
            System.out.println(JSON.toJSON(response));
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
