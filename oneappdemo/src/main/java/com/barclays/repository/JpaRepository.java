package com.barclays.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

public interface JpaRepository<T , ID extends Serializable>  extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T> {
}
