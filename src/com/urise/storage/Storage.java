package com.urise.storage;

import com.urise.model.Resume;

import java.util.Arrays;

public interface Storage {

    void clear();

    void update(Resume r);

    void save(Resume r);

    void delete(String uuid);

    Resume[] getAll();

    Resume get(String uuid);

    int size();

}
