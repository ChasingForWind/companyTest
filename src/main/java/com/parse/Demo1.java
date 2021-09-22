package com.parse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author: zhiyang
 * @description: 解析函数
 * @create: 2021-09-02 09:57
 **/


public class Demo1 {
    public static void main(String[] args) {
        String s= "{\"valid\": \"1\", \"itemId\": " +
                "\"36408494192,40313847275,520110952904,520892003368," +
                "521478907882,521837641950,544409947376,561574031630,625078678682,626798596979,627029361304,627046445914,627338694403," +
                "627620355145,627621998789,627662382902,627684091620,627728103169,627904770750,628092430030,628388834396,628682080745,628765113709" +
                ",629006442171,629186022582,629248547805,629446981742,629607883934,629616132510,629749818742,630058333520,630548330419,630558127697" +
                ",630708051722,632013416157,634407691301,634470047570,634812819248,634853606288,635826142223,636236755998,636708495355,636708935454,636709495791,637605951489,637785421496,638222358437,638931908113,639156884739" +
                ",641534206442,643149798491,643515288505,644124826690,644384962252,644393571719,644925192714,645065127701,645131313038,645374127496,647981643067,648575194313,649260457992,652435754962,652896620319\", \"reject\": \"0\", \"relSku\": \"36408494192,40313847275,520110952904,520892003368,521478907882,521837641950,544409947376,561574031630,625078678682,626798596979,627029361304,627046445914,627338694403,627620355145,627621998789,627662382902,627684091620,627728103169,627904770750,628092430030,628388834396,628682080745,628765113709,629006442171,629186022582,629248547805,629446981742,629607883934,629616132510,629749818742,630058333520,630548330419,630558127697,630708051722,632013416157,634407691301,634470047570,634812819248,634853606288,635826142223,636236755998,636708495355,636708935454,636709495791,637605951489,637785421496,638222358437,638931908113,639156884739,641534206442,643149798491,643515288505,644124826690,644384962252,644393571719,644925192714,645065127701,645131313038,645374127496,647981643067,648575194313,649260457992,652435754962,652896620319\", \"brandId\": \"30844\", \"newItem\": 0, \"abcLevel\": null, \"brandName\": \"SUPOR/苏泊尔\", \"lifeCycle\": \"1\", \"relationId\": \"4392226813019|2,4423127384186|2,4447388064269|2,4461663509605|2,4466841624254|2,4467855977518|2,4472759549787|2,4477644021187|2,4483266064950|2,4521444294708|2,4525122835656|2,4533762842892|2,4543700518169|2,4548400404516|2,4551140761467|2,4555410696519|2,4559944741945|2,4569824305521|2,4572857544620|2,4573526640845|2,4593124825672|2,4598098359725|2,4619345854207|2,4619357158584|2,4619423110464|2,4620230818199|2,4620379098404|2,4621735366292|2,4623834919472|2,4625885099402|2,4628198195291|2,4629344771738|2,4630507907906|2,4634812176563|2,4636607070471|2,4640239840630|2,4641299295897|2,4644185249366|2,4644678519632|2,4645634470172|2,4650815453250|2,4651618718720|2,4655521499751|2,4657529199644|2,4671807573891|2,4676649265875|2,4682369501341|2,4687563791281|2,4699305262514|2,4702169916238|2,4703679554396|2,4708659398841|2,4722261350967|2,4732375479443|2,4758443418791|2,4759773959254|2,4780006142599|2,4796813190542|2,4805614386025|2,4806239150668|2,4811513699997|2,4815125679349|2,4817368450521|2,4886365046396|2\", \"channelCode\": \"ali_tmall_plat\", \"channelName\": \"天猫-平台\", \"channelType\": 1, \"sixNineCode\": \"6950609406755\", \"relationInfo\": \"4392226813019|2|1,4423127384186|2|1,4447388064269|2|1,4461663509605|2|1,4466841624254|2|1,4467855977518|2|1,4472759549787|2|1,4477644021187|2|1,4483266064950|2|1,4521444294708|2|1,4525122835656|2|1,4533762842892|2|1,4543700518169|2|1,4548400404516|2|1,4551140761467|2|1,4555410696519|2|1,4559944741945|2|1,4569824305521|2|1,4572857544620|2|1,4573526640845|2|1,4593124825672|2|1,4598098359725|2|1,4619345854207|2|1,4619357158584|2|1,4619423110464|2|1,4620230818199|2|1,4620379098404|2|1,4621735366292|2|1,4623834919472|2|1,4625885099402|2|1,4628198195291|2|1,4629344771738|2|1,4630507907906|2|1,4634812176563|2|1,4636607070471|2|1,4640239840630|2|1,4641299295897|2|1,4644185249366|2|1,4644678519632|2|1,4645634470172|2|1,4650815453250|2|1,4651618718720|2|1,4655521499751|2|1,4657529199644|2|1,4671807573891|2|1,4676649265875|2|1,4682369501341|2|1,4687563791281|2|1,4699305262514|2|1,4702169916238|2|1,4703679554396|2|1,4708659398841|2|1,4722261350967|2|1,4732375479443|2|1,4758443418791|2|1,4759773959254|2|1,4780006142599|2|1,4796813190542|2|1,4805614386025|2|1,4806239150668|2|1,4811513699997|2|1,4815125679349|2|1,4817368450521|2|1,4886365046396|2|1\", \"activityIdList\": null, \"selfCategoryId\": \"50012082\", \"activityNameList\": null, \"selfCategoryName\": \"厨房电器\", \"selfThirdCategoryId\": null, \"selfSecondCategoryId\": \"50012960\", \"selfThirdCategoryName\": null, \"selfSecondCategoryName\": \"电热/火锅\"}";
        JSONObject object = JSON.parseObject(s);
        Object channelCode = object.get("channelCode");
        System.out.println(channelCode);
    }
}
