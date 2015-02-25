package userarticles.fanpage.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.engine.Engine.Get;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.monitor.jvm.JvmInfo.Mem;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.json.JSONException;
import org.json.JSONObject;

import com.sun.media.jai.opimage.AddCollectionCRIF;

import userarticles.fanpage.service.ElasticsearchConnect;

public class Hii {

	static ElasticsearchConnect es = new ElasticsearchConnect();
	public static void main(String[] args) throws JSONException, InterruptedException  {
		// TODO Auto-generated method stub
		String index = "hiii";
		String membertype = "member";
		String producttype = "product";
		String logintype = "login";
		String accesstype= "access";
		member(index,membertype);
		Thread.sleep(3000);
		product(index, producttype);
		Thread.sleep(3000);
		login(index,logintype);
		Thread.sleep(5000);
		access(index, accesstype);
		System.out.println("==================end==================");
		
	}
	
	public static void  member(String index,String type) throws JSONException{
		JSONObject js = new JSONObject();
		List<String> Liststring = new ArrayList<String>();
		Liststring.add("Macbook Air");
		Liststring.add("掃地機器人");
		Liststring.add("Asus MeMo pad7");
		Liststring.add("時尚鋪檄外套");
		Liststring.add("HTC Desire");
		Liststring.add("馬卡龍三洋電蕊");
		Liststring.add("美國水鳥羽毛冬被");
		Liststring.add("自拍神器");
		Liststring.add("真空不銹鋼保溫瓶");
		Liststring.add("格紋領層次假兩件設計針織毛衣");
		Liststring.add("Samsung GALAX Tab4");
		Liststring.add("IPhome6 Pluse 64G");
		Liststring.add("帥勁鋪棉連帽皮外套");
		Liststring.add("HERAN 42吋LDE液晶電視");
		Liststring.add("SHARP LC40LE265T 40吋 LDE液晶電視");
		Liststring.add("紳士短靴K-539-6");
		Liststring.add("反折內鋪暖芯短靴");
		Liststring.add("潮流編織感懶人鞋");
		Liststring.add("極細麂皮輕鬆綁帶帆船司");
		Liststring.add("TPMS 胎外式 無線胎壓偵測器");
		Liststring.add("GALAXY Note Edge 5.6吋四核 智慧手機LTE 32GB_白");
		Liststring.add("Galaxy Alpha 4.7吋八核LTE全頻 智慧機G850Y");
		Liststring.add("Galaxy Note4 32G 5.7吋 雙四核 4G全頻旗艦機");
		Liststring.add("Xperia C3 4G全頻自拍神機-白");
		Liststring.add("iPhone6 4.7吋-64G 香檳金");
		Liststring.add("GALAXY Note Edge 5.6吋四核 智慧手機LTE 32GB_黑");
		Liststring.add("【德國卡蜜兒Kamill】足跟加倍修護滋養7件組");
		Liststring.add("【babyou姊妹淘】平衡油脂 控油調理男性面膜M 10片");
		Liststring.add("【Issey Miyake三宅一生】極地探險瀚海男性淡香水 75ml-送沐浴洗髮乳");
		Liststring.add("Elizavecca】小青豬豬皮晚安面膜 100ml");
		Liststring.add("【GARMIN】nuvi 3595R 5吋數位電視 行車記錄衛星導航");
		Liststring.add("【GARMIN】nuvi 52 5吋 新玩樂國民機");
		Liststring.add("【GARMIN 】NAVTUNE 7190 2DIN整合性汽車 多媒體影音導航系統");
		Liststring.add("【Trywin DTN-3DX】捌代 高畫質5吋行車記錄 衛星導航機");
		Liststring.add("【征服者】蒙面俠 K68 行車雷達測速器");
		Liststring.add("【安伯特】汽車用胎壓偵測氣嘴蓋 32PSI");
		Liststring.add("【Glorify 】iTPMS I311OBDII抬頭顯示型 智能行車電腦");
		Liststring.add("【全省】OUTBACK/焱牛排館/帝國牛排套餐 通用券");
		Liststring.add("【台北/內湖 廣山居】港點午茶饗宴");
		Liststring.add("【台北 Ben鐵板燒】鐵板燒單人午餐饗宴");
		Liststring.add("【三義西湖渡假村】雙人門票+下午茶套餐");
		Liststring.add("北投紗帽谷溫泉餐廳】風味火鍋+男女泡湯40分鐘 ");
		Liststring.add("【烏來泉世界溫泉會館】雙人套房休息泡湯券");
		Liststring.add("【金山海灣溫泉會館】雙人平假日泡海風湯房2小時 ");
		Liststring.add("【烏來慈云溫泉會館】客房休憩泡湯券");
		Liststring.add("【真心良品】樂活衣物分類收納架 (附輪)");
		Liststring.add("【funcube方塊躲貓】秋妍1號單層架 2色");
		Liststring.add("【IKLOO宜酷屋】移動式雙桿抽屜收納衣架/衣桿");
		Liststring.add("【COUCH】宮野三人座獨立筒布沙發 (三色)");
		int j=0;
		List<String> gend = new ArrayList<String>();
		gend.add("Male");
		gend.add("Female");
		gend.add("Male");
		gend.add("Female");
		gend.add("Male");
		gend.add("Female");
		
		try {
			for ( j = 0; j < 200; j++) {
				if(Liststring.get(j)!=null){
					int list = (int)(Math.random() * Liststring.toArray().length);
					js.put("memberPaidProductName", Liststring.get(list));
				}
				
				int len = 1;
				StringBuffer gendSt  = new StringBuffer();
				for (int i = 0; i < len; i++) {
					int idx = (int)(Math.random() * gend.toArray().length);
					gendSt.append(gend.get(idx));
				}

				js.put("memberId", "0000001"+j);
				js.put("gender", gendSt.toString());
				js.put("age", (int)(Math.random()*50 + 15));
				js.put("address", "台北市信義區忠孝東路四段"+(int)(Math.random()*50 + 1)+"號");
				es.getClient().prepareIndex(index,type,"M000001"+j).setSource(js.toString()).execute().actionGet();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			for ( j = 48; j < 200; j++) {

				int len = 1;
				StringBuffer gendSt  = new StringBuffer();
				for (int i = 0; i < len; i++) {
					int idx = (int)(Math.random() * gend.toArray().length);
					gendSt.append(gend.get(idx));
				}
				js.put("memberId", "0000001"+j);
				js.put("gender", gendSt.toString());
				js.put("age", (int)(Math.random()*70 + 18));
				js.put("address", "台北市信義區忠孝東路四段"+(int)(Math.random()*200 + 1)+"號");
				js.put("memberPaidProductName", "");
				es.getClient().prepareIndex(index,type,"M000001"+j).setSource(js.toString()).execute().actionGet();
				
			}
			
		}
		
		System.out.println("member end");
	}
	
	public static void product(String index,String type) {

		List<String> Liststring = new ArrayList<String>();
		Liststring.add("Macbook Air");
		Liststring.add("掃地機器人");
		Liststring.add("Asus MeMo pad7");
		Liststring.add("時尚鋪檄外套");
		Liststring.add("HTC Desire");
		Liststring.add("馬卡龍三洋電蕊");
		Liststring.add("美國水鳥羽毛冬被");
		Liststring.add("自拍神器");
		Liststring.add("真空不銹鋼保溫瓶");
		Liststring.add("格紋領層次假兩件設計針織毛衣");
		Liststring.add("Samsung GALAX Tab4");
		Liststring.add("IPhome6 Pluse 64G");
		Liststring.add("帥勁鋪棉連帽皮外套");
		Liststring.add("HERAN 42吋LDE液晶電視");
		Liststring.add("SHARP LC40LE265T 40吋 LDE液晶電視");
		Liststring.add("紳士短靴K-539-6");
		Liststring.add("反折內鋪暖芯短靴");
		Liststring.add("潮流編織感懶人鞋");
		Liststring.add("極細麂皮輕鬆綁帶帆船司");
		Liststring.add("TPMS 胎外式 無線胎壓偵測器");
		Liststring.add("GALAXY Note Edge 5.6吋四核 智慧手機LTE 32GB_白");
		Liststring.add("Galaxy Alpha 4.7吋八核LTE全頻 智慧機G850Y");
		Liststring.add("Galaxy Note4 32G 5.7吋 雙四核 4G全頻旗艦機");
		Liststring.add("Xperia C3 4G全頻自拍神機-白");
		Liststring.add("iPhone6 4.7吋-64G 香檳金");
		Liststring.add("GALAXY Note Edge 5.6吋四核 智慧手機LTE 32GB_黑");
		Liststring.add("【德國卡蜜兒Kamill】足跟加倍修護滋養7件組");
		Liststring.add("【babyou姊妹淘】平衡油脂 控油調理男性面膜M 10片");
		Liststring.add("【Issey Miyake三宅一生】極地探險瀚海男性淡香水 75ml-送沐浴洗髮乳");
		Liststring.add("Elizavecca】小青豬豬皮晚安面膜 100ml");
		Liststring.add("【GARMIN】nuvi 3595R 5吋數位電視 行車記錄衛星導航");
		Liststring.add("【GARMIN】nuvi 52 5吋 新玩樂國民機");
		Liststring.add("【GARMIN 】NAVTUNE 7190 2DIN整合性汽車 多媒體影音導航系統");
		Liststring.add("【Trywin DTN-3DX】捌代 高畫質5吋行車記錄 衛星導航機");
		Liststring.add("【征服者】蒙面俠 K68 行車雷達測速器");
		Liststring.add("【安伯特】汽車用胎壓偵測氣嘴蓋 32PSI");
		Liststring.add("【Glorify 】iTPMS I311OBDII抬頭顯示型 智能行車電腦");
		Liststring.add("【全省】OUTBACK/焱牛排館/帝國牛排套餐 通用券");
		Liststring.add("【台北/內湖 廣山居】港點午茶饗宴");
		Liststring.add("【台北 Ben鐵板燒】鐵板燒單人午餐饗宴");
		Liststring.add("【三義西湖渡假村】雙人門票+下午茶套餐");
		Liststring.add("北投紗帽谷溫泉餐廳】風味火鍋+男女泡湯40分鐘 ");
		Liststring.add("【烏來泉世界溫泉會館】雙人套房休息泡湯券");
		Liststring.add("【金山海灣溫泉會館】雙人平假日泡海風湯房2小時 ");
		Liststring.add("【烏來慈云溫泉會館】客房休憩泡湯券");
		Liststring.add("【真心良品】樂活衣物分類收納架 (附輪)");
		Liststring.add("【funcube方塊躲貓】秋妍1號單層架 2色");
		Liststring.add("【IKLOO宜酷屋】移動式雙桿抽屜收納衣架/衣桿");
		Liststring.add("【COUCH】宮野三人座獨立筒布沙發 (三色)");
		
		
		List<String> productType = new ArrayList<String>();
		productType.add("Computer");
		productType.add("Clear");
		productType.add("Android");
		productType.add("Coat");
		productType.add("Android");
		productType.add("Battery");
		productType.add("Quilt");
		productType.add("Camera");
		productType.add("Thermos");
		productType.add("Sweater");
		productType.add("Android");
		productType.add("iPhone");
		productType.add("Coat");
		productType.add("TV");
		productType.add("TV");
		productType.add("Boot");
		productType.add("Boot");
		productType.add("Boot");
		productType.add("Boot");
		productType.add("Car");
		productType.add("Android");
		productType.add("Android");
		productType.add("Android");
		productType.add("Android");
		productType.add("iPhone");
		productType.add("Android");
		productType.add("Skin");
		productType.add("Mask");
		productType.add("Perfume");
		productType.add("Mask");
		productType.add("Navigation");
		productType.add("Navigation");
		productType.add("Navigation");
		productType.add("Navigation");
		productType.add("Speed detector");
		productType.add("Tire Pressure");
		productType.add("Trip computer");
		productType.add("Food Coupon");
		productType.add("Food Coupon");
		productType.add("Food Coupon");
		productType.add("Food Coupon");
		productType.add("Spa");
		productType.add("Spa");
		productType.add("Spa");
		productType.add("Spa");
		productType.add("Storage Rack");
		productType.add("Storage Rack");
		productType.add("Storage Rack");
		productType.add("Sofa");
		
		JSONObject js = new JSONObject();
		int i;
		try {
			for ( i = 1; i < 49; i++) {
				Calendar calendar = Calendar.getInstance();
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
				js.put("storeId", "S9000"+i);
				if (Liststring.get(i)!=null){
					js.put("productname",Liststring.get(i) );
					js.put("productType", productType.get(i));
				}
				js.put("price", (int)(Math.random()*6000 + 500));
				js.put("statime", df.format((calendar.getTime())));
				calendar.add(Calendar.HOUR, (int)(Math.random()*1000 +i));
				js.put("endTime", df.format((calendar.getTime())));
//				System.out.println(js.toString());
				es.getClient().prepareIndex(index,type,"P00000"+i).setSource(js.toString()).execute().actionGet();
			}
			
		} catch (JSONException e) {
//			 TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("product end");

	}

	public static void login(String index, String type){
		JSONObject js = new JSONObject();
		List<String> meb = new ArrayList<String>();
		BoolQueryBuilder query = QueryBuilders.boolQuery(); 
		query.must(QueryBuilders.prefixQuery("member.memberId", "000"));
		SearchResponse response = es.getClient().prepareSearch("hiii")  
//			       .setTypes("post")  
			       //查詢條件,  
			       .setQuery(query)
			       .setFrom(0)
			       .setSize(400)//筆數			       
			       .execute().actionGet();  
			/** 
			* SearchHits是SearchHit的複數形式，表示这个是一个列表 
			*/  			
			SearchHits shs = response.getHits(); 
			//totabl全部搜尋資料
//			long total = response.getHits().getTotalHits();
			//es全部的like數量
			for(SearchHit hit : shs){  
				meb.add( hit.getSource().get("memberId").toString());
			}
		try {
			for (int i = 0; i < 1000; i++) {
				int len =1;
				String str = "0123456789876543210";
				  StringBuffer sb = new StringBuffer();
				  for (int s = 0; s < len; s++) {
				   int idx = (int)(Math.random() * str.length());
				   int idx2 = (int)(Math.random() * 7+1);
				   int idx3 = (int)(Math.random() * 2+5);
				   int idx4 = (int)(Math.random() * 6+6);
				   int idx5 = (int)(Math.random() * 10+5);
				   int idx6 = (int)(Math.random() * 12+3);
				   int idx7 = (int)(Math.random() * 2+6);
				   int idx8 = (int)(Math.random() * 12+3);
				   int idx9 = (int)(Math.random() * 11+5);
				   int idx10 = (int)(Math.random() * 6+3);
				   int idx11 = (int)(Math.random() * 1+4);
				   int idx12 = (int)(Math.random() * 10+3);
				   sb.append(str.charAt(idx));
				   sb.append(str.charAt(idx2));
				   sb.append(str.charAt(idx3));
				   sb.append(str.charAt(idx4));
				   sb.append(str.charAt(idx5));
				   sb.append(str.charAt(idx6));
				   sb.append(str.charAt(idx7));
				   sb.append(str.charAt(idx8));
				   sb.append(str.charAt(idx9));
				   sb.append(str.charAt(idx10));
				   sb.append(str.charAt(idx11));
				   sb.append(str.charAt(idx12));
				  }
				  
				Calendar calendar = Calendar.getInstance();
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
				js.put("projectId", "0000"+(int)(Math.random()*500 + 0));
				js.put("memberId", meb.get((int)(Math.random()*199 + 0)));
				js.put("account", sb);
				js.put("type", "dddy");
				js.put("redirect", "");
				js.put("result", "success");
				js.put("server", "sso-00"+(int)(Math.random()*10 + 1)+".ak.hiii");
				js.put("remote_addr", "111.112.113."+(int)(Math.random()*200 + 1));
				js.put("request_url", "/web/login?fetnet=1&fb=1&appKey=br846abb3523e23f8a7d74cd8a00cdfc33e9cf26e3&redirectUrl=http://goshopp.dddy.tw/member/login&referer=voucher%2Findex");
				js.put("http_referer", "https://sys-sso.dddy.tw/web/login?fetnet=1&fb=1&appKey=br846abb3523e23f8a7d74cd8a00cdfc33e9cf26e3&redirectUrl=http://goshopp.dddy.tw/member/login&referer=voucher%2Findex");
				calendar.add(Calendar.HOUR, (int)(Math.random()*-220 +20));// -220日期減少 20日期增加
				js.put("timestamp", df.format((calendar.getTime())));
				es.getClient().prepareIndex(index,type,"L00000"+i).setSource(js.toString()).execute().actionGet();
			}
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("login log end");
	}
	
	public static void access(String index, String type){
		JSONObject js = new JSONObject();
		List<String> remoteList = new ArrayList<String>() ;
		List<String> timestampList = new ArrayList<String>() ;
		BoolQueryBuilder query = QueryBuilders.boolQuery(); 
		query.must(QueryBuilders.prefixQuery("login.remote_addr","111.112.113" ));
		SearchResponse response = es.getClient().prepareSearch("hiii")  
			       //查詢條件,  
			       .setQuery(query)
			       .setFrom(0)
			       .setSize (1000)	 //Search 筆數		       
			       .execute().actionGet();  
			/** 
			* SearchHits是SearchHit的複數形式，表示这个是一个列表 
			*/  
//			long total = response.getHits().getTotalHits();
//			System.out.println("searchEs:"+total);
			SearchHits shs = response.getHits(); 
			for(SearchHit hit : shs){  
				remoteList.add((String) hit.getSource().get("remote_addr"));
				timestampList.add((String) hit.getSource().get("timestamp"));
			}
		List<String> geoip_country = new ArrayList<String>();
		geoip_country.add("TW");
		geoip_country.add("CN");
		geoip_country.add("USA");
		geoip_country.add("HK");
		geoip_country.add("JP");
		geoip_country.add("UK");
		
		List<String> agent = new ArrayList<String>();
		agent.add("Android");
		agent.add("webOS");
		agent.add("iPhone");
		agent.add("iPod");
		agent.add("webOS");
		agent.add("webOS");
		agent.add("webOS");
		agent.add("webOS");
		
		List<String> statushttp = new ArrayList<String>();
		statushttp.add("200");
		statushttp.add("404");
		statushttp.add("500");
		statushttp.add("501");
		statushttp.add("200");
		statushttp.add("200");
		statushttp.add("200");
		statushttp.add("200");
		statushttp.add("200");
		statushttp.add("200");
		
		try {
		for (int i = 0; i < remoteList.size(); i++) {
			int sd = (int)(Math.random()*48 + 1);//亂數從1~48
			
			int so = (int)(Math.random()*48 + 1);//亂數從1~48
			// geoip_country random
			int len = 1;
			StringBuffer geoip  = new StringBuffer();
			for (int K = 0; K < len; K++) {
				int idx = (int)(Math.random() * geoip_country.toArray().length);
				geoip.append(geoip_country.get(idx));
				
			}
			
			int agentlen = 1;
			StringBuffer agentWeb  = new StringBuffer();
			for (int K = 0; K < agentlen; K++) {
				int agenidx = (int)(Math.random() * agent.toArray().length);
				agentWeb.append(agent.get(agenidx));
				
			}
			
			int statuslen = 1;
			StringBuffer statussb  = new StringBuffer();
			for (int K = 0; K < statuslen; K++) {
				int statusidx = (int)(Math.random() * statushttp.toArray().length);
				statussb.append(statushttp.get(statusidx));
				
			}
				js.put("timestamp",timestampList.get(i) );
				js.put("agent", agentWeb);
				js.put("domain", remoteList.get(i));
				js.put("geoip_country", geoip);
				js.put("host", "");
				js.put("method", "GET");
				js.put("referer", "http://goshopp.dddy.tw/salecenter/index?saleNo=S9000"+so);
				js.put("path", "http://goshopp.dddy.tw/salecenter/index?saleNo=S9000"+sd );
				js.put("size", (int)(Math.random()*150 + 0));
				js.put("status", statussb);
				js.put("user", "null");
//				System.out.println(js.toString());
				es.getClient().prepareIndex(index,type,"A00000"+i).setSource(js.toString()).execute().actionGet();

			}
		
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("access log end");
	}
	
	
	

	
}
