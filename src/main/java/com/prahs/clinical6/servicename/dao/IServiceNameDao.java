package com.prahs.clinical6.servicename.dao;

import com.prahs.clinical6.servicename.model.ServiceNameModel;

import org.springframework.stereotype.Component;

/*
 * This interface is used on Java classes that directly access the database
 */
@Component
public interface IServiceNameDao {

  ServiceNameModel save(ServiceNameModel demo);
}
