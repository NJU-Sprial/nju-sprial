package dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface SimpleHibernateDao<T, PK extends Serializable> {

    void save(T entity);

    void merge(T entity);

    void delete(T entity);

    void delete(PK id);

    T get(PK id);

    List<T> get(Collection<PK> ids);

    List<T> getAll();

    List<T> getAll(String orderByProperty, boolean isAsc);

    List<T> findByProperty(String propertyName, Object value);

    T findUniqueByProperty(String propertyName, Object value);

    <X> List<X> find(String hql, Object... values);

    <X> List<X> find(String hql, Map<String, ?> values);

    <X> X findUnique(String hql, Object... values);

    <X> X findUnique(String hql, Map<String, ?> values);

    int batchExecute(String hql, Object... values);

    int batchExecute(String hql, Map<String, ?> values);

    Query createQuery(String queryString, Object... values);

    Query createQuery(String queryString,
                      Map<String, ?> values);

    List<T> find(Criterion... criterions);

    T findUnique(Criterion... criterions);

    Criteria createCriteria(Criterion... criterions);

    void initProxyObject(Object proxy);

    void flush();

    Query distinct(Query query);

    Criteria distinct(Criteria criteria);

    String getIdName();

    boolean isPropertyUnique(String propertyName,
                             Object newValue, Object oldValue);
}
