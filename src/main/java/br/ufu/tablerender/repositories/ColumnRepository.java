package br.ufu.tablerender.repositories;

import javax.enterprise.context.ApplicationScoped;

import br.ufu.tablerender.models.ColumnMetadata;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ColumnRepository implements PanacheRepository<ColumnMetadata> {

    // @Inject EntityManager em;

    // @Override
    // public ColumnMetadata findById(Long id) {
    //     return em.find(ColumnMetadata.class, id);
    // }

    // @Override
    // public List<ColumnMetadata> findAll() {
    //     return em.createQuery("select o from ColumnMetadata o", ColumnMetadata.class).getResultList();
    // }

    // @Override
    // public void save(ColumnMetadata obj) {
    //     if (obj.getId() == null) {
    //         em.persist(obj);
    //     } else {
    //         em.merge(obj);
    //     }
    // }

    // @Override
    // public void delete(ColumnMetadata obj) {
    //     em.remove(em.getReference(ColumnMetadata.class, obj.getId()));
    // }
}