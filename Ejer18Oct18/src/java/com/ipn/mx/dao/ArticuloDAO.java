/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ipn.mx.dao;

import com.ipn.mx.entidades.Articulo;
import com.ipn.mx.utilerias.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Esli
 */
public class ArticuloDAO {

    public void create(Articulo articulo) {
        /*Checar que sea la session de hibernate y que se immporte la que creamos en el paquete utleria*/
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            session.saveOrUpdate(articulo);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public void update(Articulo articulo) {
        /*Checar que sea la session de hibernate y que se immporte la que creamos en el paquete utleria*/

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            session.update(articulo);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public void delete(Articulo articulo) {
        /*Checar que sea la session de hibernate y que se immporte la que creamos en el paquete utleria*/
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.getTransaction();
        try {
            /*Antes de proceder cone l borado debemos que ir por el ususario*/
            transaction.begin();
            session.delete(articulo);
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
    }

    public Articulo find(Articulo articulo) {
        /*Checar que sea la session de hibernate y que se immporte la que creamos en el paquete utleria*/
 /*Podria recibir solamnete el valor del  id*/
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            articulo = (Articulo) session.get(Articulo.class, articulo.getClaveArticulo());
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
        return articulo;
    }

    public List findAll(Articulo articulo) {
        /*Checar que sea la session de hibernate y que se immporte la que creamos en el paquete utleria*/
 /*Podria recibir solamnete el valor del  id*/
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.getTransaction();
        List lista = null;
        try {
            transaction.begin();
            Query q = session.createQuery("select * from Articulo");
            lista = q.list();
            transaction.commit();
        } catch (HibernateException he) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
        }
        return lista;
    }
    
    public static void main(String[] args) {
        Articulo a = new Articulo();
        a.setClaveArticulo("art01");
        a.setDescripcion("telefono celular");
        a.setExistencias(100);
        a.setPrecio(250);
        
        ArticuloDAO d= new ArticuloDAO();
        d.create(a);
    }

}
