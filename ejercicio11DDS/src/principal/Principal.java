package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import modelo.Carrera;


public class Principal {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("11DDSPU");
        EntityManager em= emf.createEntityManager();
        Carrera c = new Carrera();
        String nombre ="Historia de mexico";
        String descripcion="descripcion de hm";
        
        //insert(em, nombre, descripcion);
        //update(em,4);
        select(em,3);
        //delete(em, 2);
        //selectQuery(em,4);
        //selectQueryMejorado(em,4);
            
        
    }
    public static void insert (EntityManager em,  String nombre, String descripcion){
        Carrera c=new Carrera();
        c.setNombreCarrera(nombre);
        c.setDescripcionCarrera(descripcion);
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    public static void update (EntityManager em, int id){
        Carrera c=new Carrera();
        em.getTransaction().begin();
        c.setIdCarrera(id);
        em.merge(c); //actualiza
        em.getTransaction().commit();
    }
    public static void select (EntityManager em, int id){
        Carrera c=new Carrera();
        c.setIdCarrera(id);
        em.getTransaction().begin();
        System.out.println(em.find(c.getClass(), c.getIdCarrera()));
        em.getTransaction().commit();
    }
    
    public static void delete (EntityManager em,  int id){
        Carrera c=new Carrera();
        c.setIdCarrera(id);
        em.getTransaction().begin();
        c=em.find(c.getClass(), c.getIdCarrera());
        em.remove(c);
        em.getTransaction().commit();
    }
    public static void selectQuery (EntityManager em,  int id){
        Carrera c=new Carrera();
        c.setIdCarrera(id);
        em.getTransaction().begin();
        Query q = em.createQuery("select c from Carrera c");
        System.out.println(q.getResultList());
        em.getTransaction().commit();
    }
    
    public static void selectQueryMejorado (EntityManager em, int id){
        Carrera c=new Carrera();
        c.setIdCarrera(id);
        em.getTransaction().begin();
        //SI QUIERO CREAR MI PROPIO QUERY CON CRETEQUERY Y SI USO LOS NOMBRES QUE SE CREAN AUTOMATICAMENTE EN LA CLASE CREATENAMEQUERY
        TypedQuery <Carrera> q2 =  em.createNamedQuery("Carrera.findAll", Carrera.class);
        System.out.println(q2.getResultList());
        em.getTransaction().commit();
    }
}
