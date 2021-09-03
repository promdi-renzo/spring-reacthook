import React, {useState, useEffect} from 'react'
import EmployeeService from '../services/EmployeeService'

function EmployeeComponent() {

    const [employees, setEmployees] = useState([])


    useEffect(() => {
        getEmployees();
    }, [])

    const getEmployees = () => {
        EmployeeService.getEmployee().then((response) => {
            setEmployees(response.data)
            console.log(response.data)
        });
    }

    return (
        <div className='container'>
            <h1 className='text-center'>Employees List</h1>

            <table className='table table-stripped'>
                <thead>
                    <tr>
                        <th>Employee ID</th>
                        <th>Employee First Name</th>
                        <th>Employee Last Name</th>
                        <th>Employee Email</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        employees.map(
                            employee => 
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.firstname}</td>
                                <td>{employee.lastaname}</td>
                                <td>{employee.email}</td>
                            </tr>)
                    }
                </tbody>
            </table>
        </div>
    )
}

export default EmployeeComponent
