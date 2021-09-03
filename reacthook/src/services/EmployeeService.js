import axios from "axios";

const EMPLOYEE_API_URL = "http://localhost:8081/api/employees"

class EmployeeService{

    getEmployee(){
        return axios.get(EMPLOYEE_API_URL);
    }
}

export default new EmployeeService();