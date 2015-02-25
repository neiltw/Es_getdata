package userarticles.fanpage.utility;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JSpinner;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import jdk.nashorn.internal.scripts.JS;
import netscape.javascript.JSObject;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.sun.prism.es2.ES2Graphics;

import userarticles.fanpage.service.ElasticsearchConnect;

public class Fanlike {

	static ElasticsearchConnect es = new ElasticsearchConnect();
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		String id = "148395741852581";  //fan id
		
		String post ="148395741852581_984045378287609"; // post id


		querymatch();
		
	}



	public static void querymatch(){
		BoolQueryBuilder query = QueryBuilders.boolQuery();  
//		query.mustNot(QueryBuilders.prefixQuery("post.from.id", "rt"));

		query.must(QueryBuilders.termQuery("member.memberId", "00000013"));
//		query.must(QueryBuilders.termQuery("like.post_id", post));

		SearchResponse response = es.getClient().prepareSearch("hiii")  
//		       .setTypes("post")  
		       //查詢條件,  
		       .setQuery(query)
		       .setFrom(0)
		       .setSize(5)			       
		       .execute().actionGet();  
		/** 
		* SearchHits是SearchHit的複數形式，表示这个是一个列表 
		*/  			
		SearchHits shs = response.getHits(); 
		//totabl全部搜尋資料
		long total = response.getHits().getTotalHits();
		//es全部的like數量
//		System.out.println("like_aount:"+total);
		
		for(SearchHit hit : shs){  
			System.out.println("memberName:"+hit.getSource().get("memberName"));  
			System.out.println("memberId:"+hit.getSource().get("memberId"));
		}
		
	  }

	}

