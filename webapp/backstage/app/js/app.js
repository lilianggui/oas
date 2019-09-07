'use strict';


// Declare app level module which depends on filters, and services
var myApp = angular.module('myApp', [
    'ui.bootstrap',
    'ngRoute',
    // 'myApp.filters',
    // 'myApp.services',
    // 'myApp.directives',
    'myApp.controllers'
]).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/companyStructure', {templateUrl: 'app/partials/companyStructure.html', controller: 'CompanyStructureCtrl'});
        $routeProvider.when('/staff', {templateUrl: 'app/partials/staff.html', controller: 'TablesCtrl'});
        $routeProvider.when('/companyRole', {templateUrl: 'app/partials/companyRole.html', controller: 'ModalsCtrl'});
        $routeProvider.when('/processManage', {templateUrl: 'app/partials/processManage.html', controller: 'ControlsCtrl'});
        $routeProvider.when('/icons', {templateUrl: 'app/partials/icons.html', controller: 'IconsCtrl'});
        $routeProvider.when('/type', {templateUrl: 'app/partials/type.html', controller: 'TypeCtrl'});
        $routeProvider.when('/charts', {templateUrl: 'app/partials/charts.html', controller: 'ChartCtrl'});
        $routeProvider.when('/forms', {templateUrl: 'app/partials/forms.html', controller: 'FormsCtrl'});
        $routeProvider.when('/view1', {templateUrl: 'app/partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.when('/view2', {templateUrl: 'app/partials/partial2.html', controller: 'MyCtrl2'});
        $routeProvider.otherwise({redirectTo: '/companyStructure'});
    }]);
