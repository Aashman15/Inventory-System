package com.inventorysystem.service;
import com.inventorysysystem.model.Admin;
public interface AdminDao {
    boolean signUpAdmin(Admin admin);
    boolean adminExist(String username, String password);
}
