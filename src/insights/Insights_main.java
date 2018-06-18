package insights;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.personality_insights.v3.model.Profile;

public class Insights_main {

		// TODO 自動生成されたメソッド・スタブ
		public static void main(String[] args) {
		    //PersonalityInsights service = new PersonalityInsights("2016-10-19");
		    //service.setUsernameAndPassword("55ad027f-d01c-4fdf-94f7-a567594e20aa", "zPH2F4pkbi1D");
			 MySQL mysql = new MySQL();

			    String text = "Call me Ishmael. Some years ago-never mind how long "
		        + "precisely-having little or no money in my purse, and nothing "
		        + "particular to interest me on shore, I thought I would sail about "
		        + "a little and see the watery part of the world. It is a way "
		        + "I have of driving off the spleen and regulating the circulation. "
		        + "Whenever I find myself growing grim about the mouth; whenever it "
		        + "is a damp, drizzly November in my soul; whenever I find myself "
		        + "involuntarily pausing before coffin warehouses, and bringing up "
		        + "the rear of every funeral I meet; and especially whenever my "
		        + "hypos get such an upper hand of me, that it requires a strong "
		        + "moral principle to prevent me from deliberately stepping into "
		        + "the street, and methodically knocking people''s hats off-then, "
		        + "I account it high time to get to sea as soon as I can.";

		    /*ProfileOptions options = new ProfileOptions.Builder()
		        //.contentLanguage(Language.JA)//日本語入力
		        .acceptLanguage(Language.JA)//日本語出力
		    	.text(text)
		        .build();*/
		    //Profile profile = service.profile(options).execute();
		    Insights_lib ins = new Insights_lib(text);
		    Profile profile = ins.getprofile();
		    System.out.println(profile);

		    //System.out.println(profile);
		    String s = String.valueOf(profile);
		    ObjectMapper mapper = new ObjectMapper();

		    try {
				JsonNode node = mapper.readTree(s);

					double openness = node.get("personality").get(0).get("percentile").asDouble();
                    double conscientiousness = node.get("personality").get(0).get("children").get(0).get("percentile").asDouble();
                    double extraversion = node.get("personality").get(0).get("children").get(1).get("percentile").asDouble();
                    double agreeableness = node.get("personality").get(0).get("children").get(2).get("percentile").asDouble();
                    double neuroticism = node.get("personality").get(0).get("children").get(3).get("percentile").asDouble();
                    double adventurousness = node.get("personality").get(0).get("children").get(4).get("percentile").asDouble();
                    double artistic = node.get("personality").get(0).get("children").get(5).get("percentile").asDouble();

                    double emotionality = node.get("personality").get(1).get("percentile").asDouble();
                    double imagination = node.get("personality").get(1).get("children").get(0).get("percentile").asDouble();
                    double intellect = node.get("personality").get(1).get("children").get(1).get("percentile").asDouble();
                    double challenging = node.get("personality").get(1).get("children").get(2).get("percentile").asDouble();
                    double striving = node.get("personality").get(1).get("children").get(3).get("percentile").asDouble();
                    double cautiousness = node.get("personality").get(1).get("children").get(4).get("percentile").asDouble();
                    double dutifulness = node.get("personality").get(1).get("children").get(5).get("percentile").asDouble();

                    double orderliness = node.get("personality").get(2).get("percentile").asDouble();
                    double discipline = node.get("personality").get(2).get("children").get(0).get("percentile").asDouble();
                    double efficacy = node.get("personality").get(2).get("children").get(1).get("percentile").asDouble();
                    double activity = node.get("personality").get(2).get("children").get(2).get("percentile").asDouble();
                    double assertiveness = node.get("personality").get(2).get("children").get(3).get("percentile").asDouble();
                    double cheerfulness = node.get("personality").get(2).get("children").get(4).get("percentile").asDouble();
                    double seeking = node.get("personality").get(2).get("children").get(5).get("percentile").asDouble();

                    double outgoing = node.get("personality").get(3).get("percentile").asDouble();
                    double gregariousness = node.get("personality").get(3).get("children").get(0).get("percentile").asDouble();
                    double altruism = node.get("personality").get(3).get("children").get(1).get("percentile").asDouble();
                    double cooperation = node.get("personality").get(3).get("children").get(2).get("percentile").asDouble();
                    double modesty = node.get("personality").get(3).get("children").get(3).get("percentile").asDouble();
                    double uncompromising = node.get("personality").get(3).get("children").get(4).get("percentile").asDouble();
                    double sympathy = node.get("personality").get(3).get("children").get(5).get("percentile").asDouble();

                    double trust = node.get("personality").get(4).get("percentile").asDouble();
                    double fiery = node.get("personality").get(4).get("children").get(0).get("percentile").asDouble();
                    double worry = node.get("personality").get(4).get("children").get(1).get("percentile").asDouble();
                    double melancholy = node.get("personality").get(4).get("children").get(2).get("percentile").asDouble();
                    double immoderation = node.get("personality").get(4).get("children").get(3).get("percentile").asDouble();
                    double consciousness = node.get("personality").get(4).get("children").get(4).get("percentile").asDouble();
                    double susceptible = node.get("personality").get(4).get("children").get(5).get("percentile").asDouble();

                    System.out.println("openness" + openness);
                    System.out.println("conscientiousness" + conscientiousness);
                    System.out.println("extraversion" + extraversion);
                    System.out.println("agreeableness" + agreeableness);
                    System.out.println("neuroticism" + neuroticism);
                    System.out.println("adventurousness" + adventurousness);
                    System.out.println("imagination" + imagination);
                    System.out.println("intellect" + intellect);
                    System.out.println("challenging" + challenging);
                    System.out.println("striving" + striving);
                    System.out.println("cautiousness" + cautiousness);
                    System.out.println("dutifulness" + dutifulness);
                    System.out.println("orderliness" + orderliness);
                    System.out.println("discipline" + discipline);
                    System.out.println("efficacy" + efficacy);
                    System.out.println("activity" + activity);
                    System.out.println("assertiveness" + assertiveness);
                    System.out.println("cheerfulness" + cheerfulness);
                    System.out.println("seeking" + seeking);
                    System.out.println("outgoing" + outgoing);
                    System.out.println("gregariousness" +gregariousness);
                    System.out.println("altruism" + altruism);
                    System.out.println("cooperation" + cooperation);
                    System.out.println("modesty" + modesty);
                    System.out.println("uncompromising" + uncompromising);
                    System.out.println("sympathy" + sympathy);
                    System.out.println("trust" + trust);
                    System.out.println("fiery" + fiery);
                    System.out.println("worry" + worry);
                    System.out.println("melancholy" + melancholy);
                    System.out.println("immoderation" + immoderation);
                    System.out.println("consciousness" + consciousness);
                    System.out.println("susceptible" + susceptible);


				mysql.updateImage(openness, conscientiousness,extraversion,agreeableness,neuroticism,
						adventurousness, artistic, emotionality, imagination, intellect, challenging,
						striving, cautiousness, dutifulness, orderliness, discipline, efficacy,
						activity, assertiveness, cheerfulness, seeking, outgoing, gregariousness,
						altruism, cooperation, modesty, uncompromising, sympathy, trust,
						fiery, worry, melancholy, immoderation, consciousness, susceptible, text);



			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		  }
}
