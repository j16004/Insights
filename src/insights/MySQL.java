package insights;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MySQL {

	String driver;// JDBCドライバの登録
    String server, dbname, url, user, password;// データベースの指定
    Connection con;
    Statement stmt;
    Map<String, Object> lng = new HashMap<>();
    private String id;

	public MySQL() {
		this.driver = "org.gjt.mm.mysql.Driver";
        this.server = "sangi2018.sist.ac.jp";
        this.dbname = "sangi2018";
        this.url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=UTF-8";
        this.user = "sangi2018";
        this.password = "sistsangi2018";
        this.id = "J16004";
        try {
            this.con = DriverManager.getConnection(url, user, password);
            this.stmt = con.createStatement ();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Class.forName (driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

	//値の無い物全て
	/*public ResultSet getID() {
		ResultSet rs = null;
		String sql = "SELECT * FROM  `images` WHERE `age_min` = -1";
		try {
			rs = stmt.executeQuery (sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}*/

	public void updateImage(double openness,double conscientiousness,double extraversion,double agreeableness,double neuroticism,
			double adventurousness,double artistic,double emotionality,double imagination,double intellect,
			double challenging,double striving,double cautiousness,double dutifulness,double orderliness,
			double discipline,double efficacy,double activity,double assertiveness,double cheerfulness,double seeking,
			double outgoing,double gregariousness,double altruism,double cooperation,double modesty,double uncompromising,
			double sympathy,double trust,double fiery,double worry,double melancholy,double immoderation,double consciousness,
			double susceptible, String text) {
		//keywordテーブルへ格納
		StringBuffer buf = new StringBuffer();
		//int gender_id = -1;
		//if(gender.equals("MALE")) gender_id = 0;
		//else if(gender.equals("FEMALE")) gender_id = 1;
		//buf.append("UPDATE images SET  `age_min` = " + age_min + ", `age_max` = " + age_max + ", `age_score` = " + age_score + ", `gender` = " + gender_id + ", `gender_score` = " + gender_score + "   WHERE  id = " + image_id + ";");
		//buf.append("INSERT INTO  `speeches` (`user_id`, `transcript` ,`confidence`) VALUES ( 'J16004','テスト',  '0.5');");

		buf.append(" INSERT INTO `screens`(`user_id`, `openness` , `conscientiousness` , `extraversion` , `agreeableness`, `neuroticism`,`adventurousness`,"
				+ " `artistic`, `emotionality`, `imagination`, `intellect`, `challenging`, `striving`, `cautiousness`, `dutifulness`, `orderliness`,"
				+ " `discipline`,`efficacy`, `activity`, `assertiveness`, `cheerfulness`, `seeking`, `outgoing`, `gregariousness`, `altruism`,"
				+ " `cooperation` , `modesty`, `uncompromising`,`sympathy`, `trust`, `fiery`, `worry`, `melancholy`, `immoderation`,"
				+ " `consciousness`, `susceptible` ,`text`) VALUES ( 'J16004' ," + openness + ", "+ conscientiousness +" , "+ extraversion +", "+ agreeableness +", "+ neuroticism +", "+ adventurousness +", "+ artistic +", " + emotionality + " ," + imagination +", "+ intellect +", "+ challenging +", "+ striving +", "+ cautiousness +", "+ dutifulness +", "+ orderliness +", "+ discipline +", "+ efficacy +" , "+ activity +", "+ assertiveness +", "+ cheerfulness +", "+ seeking +", "+ outgoing +", "+ gregariousness +", "+ altruism +", "+ cooperation +" , "+ modesty + ", "+ uncompromising +", "+ sympathy +", "+ trust +", "+ fiery +", "+ worry +", "+ melancholy +", "+ immoderation +", "+ consciousness +", "+ susceptible +", '"+ text +"' );");

		String sql = buf.toString();
		try {
			stmt.execute (sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
