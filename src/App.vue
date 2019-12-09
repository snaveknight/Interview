<template>
  <div id="app">
    <employees-list></employees-list>
   <thisEmployee></thisEmployee>
  </div>
</template>

<script>
import EmployeesList from './components/EmployeesList.vue';
import ThisEmployee from './components/ThisEmployee.vue';

export default {
  name: 'app',
  components: {
    EmployeesList,
    ThisEmployee
  }
};
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
