angular.module("employee.service", []).service("EmployeeService", [
  "$http",
  function($http) {
    var service = {};

    var baseUrl = "http://localhost:8080";

    service.addEmployee = function(employee) {
      return $http.post(baseUrl + "/employees", employee);
    };

    service.getAllEmployees = function() {
      return $http.get(baseUrl + "/employees");
    };

    service.deleteEmployee = function(index) {
      return $http.delete(baseUrl + "/employees/" + index);
    };

    service.updateEmployee = function(index, employee) {
      return $http.put(baseUrl + "/employees/" + index + "/" + employee);
    };

    return service;
  }
]);
