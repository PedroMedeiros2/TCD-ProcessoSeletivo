package com.ph_sm.tcdprocessoseletivo.utils.data;

import javax.ejb.Local;

/**
 * Interface for the DataInitializer
 * Used to initialize the database with some data
 */
@Local
public interface DataInitializerLocal {
    void init();
}
