package insights;

import com.ibm.watson.developer_cloud.discovery.v1.model.CreateCollectionOptions.Language;
import com.ibm.watson.developer_cloud.personality_insights.v3.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.Profile;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.ProfileOptions;

public class Insights_lib {

	PersonalityInsights service;
	ProfileOptions options = null;

	public Insights_lib(String text){
		service = new PersonalityInsights("2016-10-19");
	    service.setUsernameAndPassword("55ad027f-d01c-4fdf-94f7-a567594e20aa", "zPH2F4pkbi1D");

	    		options = new ProfileOptions.Builder()
		        //.contentLanguage(Language.JA)//日本語入力
		        .acceptLanguage(Language.JA)//日本語出力
		    	.text(text)
		        .build();
	}
	public Profile getprofile(){
		Profile profile = service.profile(options).execute();
		return profile;
	}

}
