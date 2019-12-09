<template>
  <header>
    <h1>Employee Listing</h1>
    <div class="employees-list">
          <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>First Name</th>
          <th>Last Name</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="employee in employees" :key="employee.id">
          <td>
             {{employee.employeeId}}
          </td>
          <td>{{employee.firstName}}</td>
          <td>{{employee.lastName}}</td>
        </tr>
      </tbody>
    </table>
    </div>
  </header>
</template>
<script>
export default {
  
  data() {
    return {
      apiURL: "http://localhost:8080/api/employees",
      employees: []
    };
  },
  created() {
    fetch(this.apiURL)
      .then(response => {
        return response.json();
      })
      .then(employees => {
        this.employees = employees;
      })
  }
};
</script>
<style scoped>
td, th {
  padding:6px;
  margin:0;
}
tr:nth-child(even) {
  background-color: rgb(216, 216, 216);
}
</style>