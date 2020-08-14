package com.prahs.clinical6.servicename.dao.impl;

import com.prahs.clinical6.servicename.dao.IServiceNameDao;
import com.prahs.clinical6.servicename.model.ServiceNameModel;
import com.prahs.clinical6.servicename.repository.ServiceNameRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * This class is used as Java classes for interface that directly access the database
 */
@Component // This annotation marks the Java class as a bean
public class ServiceNameDaoImpl implements IServiceNameDao {

  @Autowired // The @Autowired annotation injects object dependency
  private ServiceNameRepo demoRepo;

  @Override
  public ServiceNameModel save(ServiceNameModel demo) { // To save the modelRequest in the database
    // TODO Auto-generated method stub
    return null;
  }

}
