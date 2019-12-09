<template>
<header>
    <h1>Employee Details</h1>
    <div class="employee-details">
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                </tr>
            </thead>
            <tbody>
                <td>{{employee.employeeId}}</td>
                <td>{{employee.firstName}}</td>
                <td>{{employee.lastName}}</td>
            </tbody>
        </table>
    </div>
    </header>
</template>
<script>
export default {
    
    data() {
        return {
            apiURL: "http://localhost:8080/api/employees/3f3b36e1-5479-4e4d-a504-f09d05b8416f",
            employee: {
                employeeId: "",
                firstName: "",
                lastName: ""
            }
        };
    },
     created() {
    fetch(this.apiURL)
      .then(response => {
        return response.json();
      })
      .then((employee) => {
        this.employee = employee;
      })
  }
};
</script>
<style scoped>

</style>