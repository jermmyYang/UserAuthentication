package cn.com.sy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.sy.annotation.DataAccessRepository;
import cn.com.sy.entity.OauthClientDetails;


@DataAccessRepository
public interface OauthDao {
    
	OauthClientDetails findOauthClientDetails(String clientId);

    List<OauthClientDetails> findAllOauthClientDetails();

    void updateOauthClientDetailsArchive(@Param("clientId") String clientId, @Param("archive") boolean archive);

    void saveOauthClientDetails(OauthClientDetails clientDetails);
	
}
