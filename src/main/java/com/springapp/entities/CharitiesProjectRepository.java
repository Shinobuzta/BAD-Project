package com.springapp.entities;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Angela
 * Date: 12/9/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
@SuppressWarnings({"unchecked","rawtypes"})
public class CharitiesProjectRepository{
      @Autowired
        private SessionFactory sessionFactory;

    @Transactional
    public List<CharitiesProject> viewAll(){
        Session session=sessionFactory.getCurrentSession();
        List charitiesProject=session.createQuery("from CharitiesProject").list();
        return  charitiesProject;
    }


}

