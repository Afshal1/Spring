package com.example.restapis.Service;


import java.util.List;

public interface ShipperService{

    List<String> getAllShipper(String userType);
    List<String> findShipper(String email,String userType);
}
