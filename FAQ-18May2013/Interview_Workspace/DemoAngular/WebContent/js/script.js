/**
 * 
 */

var app = angular.module('myApp', []);
app.controller('MainController',function($scope, $http){
	$http.get('http://localhost:8080/ext-integrations/rest/statusLink/getStatusLink?instructionCheckId=NDc4MTMwNQ', {
		headers : {
				'Access-Control-Allow-Origin': 'http://localhost',
				'Content-Type': 'application/json'
		}
	})
    .success(function(data){
    $scope.entity = data;
    })
	$scope.message = "Hello Angular JS";
		
});

/*var MainController = function($scope){
	$scope.message = "Hello Angular JS"
};*/


