package com.cg;

import java.util.*;

public class EmployeePayrollService {

	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {
	}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
	}

	static Scanner in;
	
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		in = new Scanner(System.in);
		EmployeePayrollData employeePayrollData = new EmployeePayrollData();
		employeePayrollService.readPayrollData(in);
		employeePayrollService.writePayrollData();
	}

	private void readPayrollData(Scanner in) {
		System.out.println("enter employee id: ");
		int id = in.nextInt();
		System.out.println("enter employee name: ");
		String name = in.next();
		System.out.println("enter employee salary: ");
		double salary = in.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}

	private void writePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to console\n" + employeePayrollList);
	}
}
