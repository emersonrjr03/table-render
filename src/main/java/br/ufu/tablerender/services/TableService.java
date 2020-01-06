package br.ufu.tablerender.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.ufu.tablerender.models.TableMetadata;
import br.ufu.tablerender.repositories.TableRepository;

@ApplicationScoped
public class TableService {
    

    @Inject
    TableRepository repository;

    @Transactional
    public void createTable(TableMetadata tableMetadata){
        repository.persist(tableMetadata);
    }

	public List<TableMetadata> getAll() {
        return repository.listAll();
	}
}
