package com.asimily.daomgr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asimily.dao.ConnectorsConnectionInfoDao;
import com.asimily.models.EConnectorsConnectionInfo;

@Component
public class ConnectorsConnectionInfoDaoManager {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ConnectorsConnectionInfoDao connectorsConnectionInfoDao;

	public EConnectorsConnectionInfo saveConnection(EConnectorsConnectionInfo eConnectorsConnectionInfo) {
	  eConnectorsConnectionInfo = connectorsConnectionInfoDao.saveAndFlush(eConnectorsConnectionInfo);
    logger.debug("**DB operation**: Creating/Updating EConnectorsConnectionInfo object " + eConnectorsConnectionInfo.getId());
		return eConnectorsConnectionInfo;
	}

}