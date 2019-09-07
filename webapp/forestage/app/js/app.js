'use strict';


// Declare app level module which depends on filters, and services
angular.module('myApp', [
    'ngRoute',
    'myApp.filters',
    'myApp.services',
    'myApp.directives',
    'myApp.controllers'
]).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/workManage', {templateUrl: 'app/partials/workManage.html', controller: 'MaverixCtrl'});
        $routeProvider.when('/organizationalStructure', {templateUrl: 'app/partials/organizationalStructure.html', controller: 'TablesCtrl'});
        $routeProvider.when('/personalCenter', {templateUrl: 'app/partials/personalCenter.html', controller: 'ModalsCtrl'});
        $routeProvider.when('/newsAndInformation', {templateUrl: 'app/partials/newsAndInformation.html', controller: 'ControlsCtrl'});
        $routeProvider.when('/icons', {templateUrl: 'app/partials/icons.html', controller: 'IconsCtrl'});
        $routeProvider.when('/type', {templateUrl: 'app/partials/type.html', controller: 'TypeCtrl'});
        $routeProvider.when('/charts', {templateUrl: 'app/partials/charts.html', controller: 'ChartCtrl'});
        $routeProvider.when('/forms', {templateUrl: 'app/partials/forms.html', controller: 'FormsCtrl'});
        $routeProvider.when('/view1', {templateUrl: 'app/partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.when('/view2', {templateUrl: 'app/partials/partial2.html', controller: 'MyCtrl2'});
        $routeProvider.otherwise({redirectTo: '/workManage'});
    }]);
