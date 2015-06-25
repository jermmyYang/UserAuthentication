package cn.com.sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.sy.dao.OauthDao;
import cn.com.sy.entity.OauthClientDetails;
import cn.com.sy.entity.OauthClientDetailsDto;
import cn.com.sy.service.OauthService;

@Service("oauthService")
public class OauthServiceImpl implements OauthService {

	@Autowired
	private OauthDao oauthDao;
	
	@Override
	public OauthClientDetails loadOauthClientDetails(String clientId) {
		return oauthDao.findOauthClientDetails(clientId);
	}

	@Override
	public List<OauthClientDetailsDto> loadAllOauthClientDetailsDtos() {
		   List<OauthClientDetails> clientDetailses = oauthDao.findAllOauthClientDetails();
	       return OauthClientDetailsDto.toDtos(clientDetailses);
	}

	public void archiveOauthClientDetails(String clientId) {
		oauthDao.updateOauthClientDetailsArchive(clientId, true);
    }

    public OauthClientDetailsDto loadOauthClientDetailsDto(String clientId) {
        final OauthClientDetails oauthClientDetails = oauthDao.findOauthClientDetails(clientId);
        return oauthClientDetails != null ? new OauthClientDetailsDto(oauthClientDetails) : null;
    }

    public void registerClientDetails(OauthClientDetailsDto formDto) {
        OauthClientDetails clientDetails = formDto.createDomain();
        oauthDao.saveOauthClientDetails(clientDetails);
    }

}
