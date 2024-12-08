package com.atul;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App
{
public static void main( String[] args )
{
Configuration cfg=new Configuration();
cfg.configure("employee.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
Transaction t=session.beginTransaction();
//HQL
//String query="from Employee ";
// String query="from Employee where empid=101";
//Query q=session.createQuery(query);
//List<Employee> list=q.list();
//for(Employee employee:list)
//{
//System.out.println(employee.getEmpid()+" "+employee.getEmpname()+" "+employee.getEmpaddress());
//}
Employee e= new Employee();
e=session.get(Employee.class, 101);
System.out.println(e);
t.commit();
factory.close();
System.out.println("Record inserted successfully");
}
}