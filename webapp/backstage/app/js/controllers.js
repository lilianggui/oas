'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
    .controller('CompanyStructureCtrl', ['$scope','$http','$modal', function ($scope,$http,$modal) {
        $scope.openModal = function() {
            var modalInstance = $modal.open({
                templateUrl : 'app/template/myModalContent.html',//script标签中定义的id
                controller : 'modalCtrl',//modal对应的Controller
                resolve : {
                    data : function() {//data作为modal的controller传入的参数
                        return {name:123};//用于传递数据
                    }
                }
            })
        };

        $http({
            method: 'GET',
            url: '/department/listDept.json?pageNum=1'
        }).then(function successCallback(response) {
            console.log(response.data);
            $scope.deptList = response.data.data.list;
        }, function errorCallback(response) {
            // 请求失败执行代码
        });

        $scope.selectAllOrCancel = function($event){
            var isChecked = $($event.target)[0].checked;
            var checkedCount = 0;
            if(isChecked){
                $("input[name='checkbox']").each(function(){
                    this.checked = true;
                    checkedCount++;
                });
            }else{
                $("input[name='checkbox']").each(function(){
                    this.checked = false;
                });
            }
            changeBtnBgColor(checkedCount);
        };

        $scope.checkboxClick = function($event){
            var isAllUnchecked = true;//假设所有都没选中
            var checkedCount = 0;
            $("input[name='checkbox']").each(function(){
                if(this.checked){
                    isAllUnchecked = false;//至少有一个选中
                    checkedCount ++;
                }
            });
            $("#selectAllOrCancel")[0].checked = !isAllUnchecked;
            changeBtnBgColor(checkedCount);
        };

        function changeBtnBgColor(checkedCount){
            if(checkedCount === 0){
                $("#updateBtn").css({'background-color':'#ccc'});
                $("#ableBtn").css({'background-color':'#ccc'});
                $("#disableBtn").css({'background-color':'#ccc'});
                $("#deleteBtn").css({'background-color':'#ccc'});
            }else if(checkedCount === 1){
                $("#updateBtn").css({'background-color':'#48BDF0'});
                $("#ableBtn").css({'background-color':'#48BDF0'});
                $("#disableBtn").css({'background-color':'#48BDF0'});
                $("#deleteBtn").css({'background-color':'#48BDF0'});
            }else{
                $("#updateBtn").css({'background-color':'#ccc'});
                $("#ableBtn").css({'background-color':'#48BDF0'});
                $("#disableBtn").css({'background-color':'#48BDF0'});
                $("#deleteBtn").css({'background-color':'#48BDF0'});
            }
        }

    }])
    .controller('modalCtrl', function($scope, $modalInstance, data) {
        $scope.data= data;
        //在这里处理要进行的操作
        $scope.ok = function() {
            $modalInstance.close();
        };
        $scope.cancel = function() {
            $modalInstance.dismiss('cancel');
        }
    })
    .controller('ChartCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Charts";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/chart.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('TypeCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Typography";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/cutting_pad.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('IconsCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Icons";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/box_address.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('TablesCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Tables";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/document-plaid-pen.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('ModalsCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Modals";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/fullscreen.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('ControlsCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Controls";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/button_blue_add.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('FormsCtrl', ['$scope', function ($scope) {
        $scope.$parent.title = "Forms";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/tablet.png";
        $scope.$parent.showTopToggle = false;

    }])
    .controller('MyCtrl1', ['$scope', function ($scope) {
        $scope.$parent.title = "Maverix Theme";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/screen_aqua_glossy.png";
        $scope.$parent.showTopToggle = true;

    }])
    .controller('MyCtrl2', ['$scope', function ($scope) {
        $scope.$parent.title = "Warnings";
        $scope.$parent.img = "img/iconset-addictive-flavour-set/png/moleskine_black.png";
        $scope.$parent.showTopToggle = false;
    }])
    .controller('AppCtrl', ['$scope', '$location', function ($scope, $location) {
        $scope.isActive = function (viewLocation) {
            return viewLocation === $location.path();
        };

        $scope.isDisplayNone = function (barNum) {
            switch (barNum){
                case 1:
                    if($location.path() === "/companyStructure" || $location.path() === "/staff" || $location.path() === "/companyRole"){
                        return false;
                    }else{
                        return true;
                    }
                    break;
                case 2:
                    if($location.path() === "/processManage"){
                        return false;
                    }else{
                        return true;
                    }
                    break;
            }
        };

        $scope.title = "Maverix Theme";
        $scope.subNav1 = 0;
        $scope.img = "img/iconset-addictive-flavour-set/png/screen_aqua_glossy.png";
        $scope.showTopToggle = false;
    }]);
