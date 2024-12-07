package com.example.connectivity_emp1;

public class EmpClass {

    public static final String DB_NAME = "dbemp";
    public static final String TABLE_NAME = "Emp_Mstr";
    public static final int DB_VERSION=1;
    public static final String EMP_NO="eno";
    public static final String EMP_NAME="ename";
    public static final String EMP_SAL="esal";
    public static final String EMP_DNO="dno";

    public static final String CREATE_TABLE = "Create table " + TABLE_NAME +
            "(" + EMP_NO + " Integer Primary Key AutoIncrement," +
            EMP_NAME + " Text," +
            EMP_SAL + " Integer," +
            EMP_DNO + " Integer)";
}
