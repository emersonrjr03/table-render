package br.ufu.tablerender.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.ufu.tablerender.models.ColumnMetadata;
import br.ufu.tablerender.repositories.ColumnRepository;

@ApplicationScoped
public class ColumnService {
    @Inject
    ColumnRepository repository;

    
    public void createTable(ColumnMetadata ColumnMetadata){
        repository.persist(ColumnMetadata);
    }

	public List<ColumnMetadata> getAll() {
        return repository.listAll();
	}
}