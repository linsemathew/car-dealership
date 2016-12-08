/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesdb;

/**
 *
 * @author lm
 */
public class Config {
    public static final String DATABASE_NAME = "employees";
    public static final String DATABASE_SERVER = "localhost";
    public static final String DATABASE_USER_ID = "employee";
    public static final String DATABASE_PASSWORD = "employee";

    public static final String connection_url = "jdbc:derby://" + DATABASE_SERVER + "/" + DATABASE_NAME;
}
