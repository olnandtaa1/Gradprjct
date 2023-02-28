package com.example.graduationproject.DAO;

import com.example.graduationproject.Domain.Artist;
import com.example.graduationproject.Domain.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CountryDAOImpl implements CountryDAO{
    private static final Logger logger = LoggerFactory.getLogger(CountryDAOImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public CountryDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public void addCountry(Country country) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(country);
        logger.info("Country is successfully saved. Country details: " + country);
    }

    @Override
    public void updateCountry(Country country) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(country);
        logger.info("Country is successfully updated. Country details: " + country);
    }

    @Override
    public void removeCountry(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Country country = session.load(Country.class, id);
        if (country!=null) {
            session.delete(country);
        }
        logger.info("Country is successfully removed. Country details: " + country);
    }

    @Override
    public Country getACountryById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Country country = session.load(Country.class, id);
        logger.info("Country is successfully loaded. Country details: " + country);
        return null;
    }
}
