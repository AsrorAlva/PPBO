package Mahasiswa;

import Mahasiswa.Data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setNama("Bogor");

        Company.Employee employee = company.new Employee();
        employee.setNama("Asror");

        System.out.println(employee.getNama());
        System.out.println(employee.getCompany());
    }
}