angular.module("myApp", ["employee.service"]).controller("myController", [
  "EmployeeService",
  "$scope",
  function(EmployeeService, $scope) {
    var vm = this;

    _setUp();

    vm.addEmployee = function() {
      EmployeeService.addEmployee(vm.empName).then(function(employeeList) {
        vm.employees = employeeList.data;
      });
    };

    vm.deleteEmployee = function(index) {
      EmployeeService.deleteEmployee(index).then(function(employeeList) {
        vm.employees = employeeList.data;
      });
    };

    vm.updateEmployee = function(index) {
      EmployeeService.updateEmployee(index, vm.updatedName)
        .then(function(employeeList) {
          vm.employees = employeeList.data;
        })
        .finally(function() {
          vm.isEditing[index] = false;
        });
    };

    vm.updateStatus = function(index) {
      vm.isEditing[index] = true;
      vm.updatedName = vm.employees[index].name;
      console.log("here");
    };

    function _setUp() {
      vm.isEditing = {};
      EmployeeService.getAllEmployees().then(function(employeeList) {
        vm.employees = employeeList.data;
      });
    }
  }
]);
