package cn.com.sy.service;

import java.util.List;

import cn.com.sy.entity.OauthClientDetails;
import cn.com.sy.entity.OauthClientDetailsDto;


public interface OauthService {

	    OauthClientDetails loadOauthClientDetails(String clientId);

	    List<OauthClientDetailsDto> loadAllOauthClientDetailsDtos();

	    void archiveOauthClientDetails(String clientId);

	    OauthClientDetailsDto loadOauthClientDetailsDto(String clientId);

	    void registerClientDetails(OauthClientDetailsDto formDto);
	
}
