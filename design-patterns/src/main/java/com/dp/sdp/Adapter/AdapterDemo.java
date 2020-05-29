package com.dp.sdp.Adapter;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();


        //Will not work! This is where the adapter comes into play!
        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterFromLdap(employeeFromLdap));

        System.out.println(employees);
    }
}
