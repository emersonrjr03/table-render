package br.ufu.tablerender.repositories;

import javax.enterprise.context.ApplicationScoped;

import br.ufu.tablerender.models.TableMetadata;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TableRepository implements PanacheRepository<TableMetadata> {
    // @Inject EntityManager em;

    // @Override
    // public TableMetadata findById(Long id) {
    //     return em.find(TableMetadata.class, id);
    // }

    // @Override
    // public List<TableMetadata> findAll() {
    //     return em.createQuery("select o from TableMetadata o", TableMetadata.class).getResultList();
    // }

    // @Override
    // @Transactional(value = TxType.REQUIRED)
    // public void save(TableMetadata obj) {
    //     if (obj.getId() == null) {
    //         em.getTransaction().begin();
    //         em.persist(obj);
            
    //     } else {
    //         em.merge(obj);
    //     }
    // }

    // @Override
    // public void delete(TableMetadata obj) {
    //     em.remove(em.getReference(TableMetadata.class, obj.getId()));
    // }


}
