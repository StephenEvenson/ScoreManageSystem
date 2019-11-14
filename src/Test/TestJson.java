package Test;

import Lib.org.json.JSONArray;
import Utils.CreateJsonUtil;
import java.util.*;
import json.*;

public class TestJson {
    public static void main(String[] args) {
        List<Object> agencyList = new ArrayList<Object>();
        Map<String, Object> agencyMap = new HashMap<>();
        String agencyName = "name";
        String agencyAddress = "address";
        String companyName = "companyName";
        String logoImageId = "logoImageId";
        String agencyAuctionAddress = "agencyAuctionAddress";
        String logoImage = "logoImage";
        agencyMap.put("agencyName",agencyName);
        agencyMap.put("agencyAddress", agencyAddress);
        agencyMap.put("companyName", companyName);
        agencyMap.put("logoImageId", logoImageId);
        agencyMap.put("auctionAddress", agencyAuctionAddress);
        agencyMap.put("logoImage", logoImage);
        agencyList.add(agencyMap);


        JSONArray jsonObject = new JSONArray(agencyList);
        String jsonString1 = jsonObject.toString();
        System.out.println("here");
        CreateJsonUtil.createJsonFile(jsonString1, "/Users/zhangruntian/GitProject/ScoreManageSystem/src/json", "agency");
    }
}
