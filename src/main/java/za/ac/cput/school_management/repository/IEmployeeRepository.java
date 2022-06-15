/* IEmployeeRepository.java
   Author: Damone Hartnick
   Student Number : 219093717
   Date: June 2022
*/
package za.ac.cput.school_management.repository;

import za.ac.cput.school_management.domain.Employee;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee, String> {

    public List<Employee> getAll();

}
