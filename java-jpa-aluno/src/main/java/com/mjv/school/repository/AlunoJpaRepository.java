package com.mjv.school.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mjv.school.model.Aluno;

import java.util.List;

public class AlunoJpaRepository {
        private EntityManager em;
        public AlunoJpaRepository() {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ALUNOS_PU");
            em = entityManagerFactory.createEntityManager();         
        }

        public void save(Aluno aluno){
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
        }

        public Aluno findById(Integer id){
            Aluno aluno = em.find(Aluno.class, id);
            return aluno;
        }

        public List<Aluno> findAll(){
            Query query = em.createQuery("Select a From Aluno a");
            return query.getResultList();
        }

        public List<Aluno> findAllAtivos(Boolean ativo){
            Query query = em.createQuery("Select a From Aluno a Where a.ativo = :p1");
            query.setParameter(":p1", ativo);
            return query.getResultList();
        }
}
