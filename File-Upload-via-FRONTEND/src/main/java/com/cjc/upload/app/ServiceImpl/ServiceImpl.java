package com.cjc.upload.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.upload.app.ServiceI.Service_Interace;
import com.cjc.upload.app.model.Upload;
import com.cjc.upload.app.repository.Upload_Repository;

@Service
public class ServiceImpl implements Service_Interace {

	@Autowired Upload_Repository ur;

	@Override
	public Upload saveDoc(Upload u)
	{
		
		return ur.save(u);
	}

}
