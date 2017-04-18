package dao;

import model.BaseEntity;

/**
 * Created by Владислав on 14.04.2017.
 */
public interface Filable<T extends BaseEntity> {
    public void add(T t);

    public void remove(int id);

    public void update();


}
