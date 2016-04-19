/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jokee.app.service;

import com.jokee.app.dao.AbstractFacade;
import com.jokee.app.pojo.Jokee;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ann
 */
@Path("api")
public class JokeeFacadeREST extends AbstractFacade<Jokee> {

    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com_Jokee-app_war_0.0.1PU");
    EntityManager entitymanager = emfactory.createEntityManager();

    public JokeeFacadeREST() {
        super(Jokee.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Jokee entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Jokee entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Jokee find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<Jokee> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Jokee> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @GET
    @Path("increaseLike/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String increaseLike(@PathParam("id") int id) {
        Jokee find = super.find(id);
        find.setLike(find.getLike() + 1);
        super.edit(find);
        return find.getLike().toString();
    }

    @GET
    @Path("increaseDislike/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String increaseDislike(@PathParam("id") int id) {
        Jokee find = super.find(id);
        find.setDislike(find.getDislike() + 1);
        super.edit(find);
        return find.getDislike().toString();
    }

    @Override
    protected EntityManager getEntityManager() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return entitymanager;
    }

}
