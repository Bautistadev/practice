package com.openapi.generationCode.practice.DB;

import java.util.List;
import java.util.Map;

public interface DAO<K,E>{

    public E findEmployee(K id) throws Exception;

    public List<E> getAllEmployee() throws Exception;

    public Boolean deleteEntity(E entity);

    public List<E> findEmployeesByAtributte(Map<String,Object> atributtes);

}
