package cn.com.sy.oauth.client;

import javax.sql.DataSource;

import org.springframework.security.oauth2.provider.JdbcClientDetailsService;

public class CustomerClientDetailService extends JdbcClientDetailsService {

	private static final String SELECT_CLIENT_DETAILS_SQL = "select client_id, client_secret, resource_ids, scope, authorized_grant_types, "
			+ "web_server_redirect_uri, authorities, access_token_validity, refresh_token_validity, additional_information "
			+ "from oauth_client_details where client_id = ? and archived = 0 ";

	public CustomerClientDetailService(DataSource dataSource) {
		 super(dataSource);
         setSelectClientDetailsSql(SELECT_CLIENT_DETAILS_SQL);
	}

}
