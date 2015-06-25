package cn.com.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.security.oauth2.provider.token.JdbcTokenStore;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class Test {

	
	public static void main(String[] args) {
		
	/*	JdbcTokenStore store = new JdbcTokenStore();*/
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 BasicDataSource   dataSource = (BasicDataSource) ctx.getBean("dataSource"); 
		 String sql = "insert into oauth_access_token (token_id, token, authentication_id, user_name, client_id, authentication, refresh_token) values (?, ?, ?, ?, ?, ?, ?)";
		 String qSql = "select * from oauth_access_token";
		 
		 String tSql = "insert into user_log(user_id) values (?)";
		 
		 JdbcTokenStore store = new JdbcTokenStore(dataSource);
		 try{
			 
			 TestOAuth2AccessToken t = new TestOAuth2AccessToken();
			 TestAuthorizationRequest request = new TestAuthorizationRequest();
			 TestAuthentication a = new TestAuthentication();
			 TestOAuth2Authentication token = new TestOAuth2Authentication(request,a);
			 JdbcTemplate template = new JdbcTemplate(dataSource);
			
//			 int i = template.update(sql, new Object[]{ t.getValue(),
//					"tets","354534","","","",""}, new int[] {
//				Types.VARCHAR, Types.BLOB, Types.VARCHAR, Types.VARCHAR, Types.VARCHAR, Types.BLOB, Types.VARCHAR });
//			 System.out.println(i);
			 
			 DefaultTransactionDefinition def = new DefaultTransactionDefinition();
			 
			 PlatformTransactionManager  tr = ctx.getBean(DataSourceTransactionManager.class);
			 TransactionStatus status = tr.getTransaction(def);
			 template.execute("update tb_user set email='ddd'");
			 tr.commit(status);
			 
		/*	 int j = template.update(tSql, new Object[]{"123"}, new int[]{Types.VARCHAR});
			 System.out.println(j);
			 */
			 
			 
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
		
		 
		 
		
	}
	
	
}
