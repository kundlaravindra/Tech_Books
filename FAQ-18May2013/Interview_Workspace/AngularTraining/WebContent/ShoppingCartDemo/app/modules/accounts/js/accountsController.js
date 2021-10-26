angular.module("accountsModule").
	controller("accountsController",["$scope","$location","$http", function($scope,$location,$http){ 
	
			
		$scope.signIn = function(){
		
			$http(
	                 {
	                     method: "get",
	                     url: "http://localhost:8082/ValidateLogin/" +
	                         $scope.Credentials.username + "/" + $scope.Credentials.password
	                 }).success(function (data, status) {

	                     if(data=="valid")
	                     {
	                         $location.path("/confirm");
	                     }

	                 }).error(function(er,status){
				
	                	 $scope.loginStatus = "Invalid Username aor Password";
	                 });
		
		};
		
		$scope.signup = function(){
			$location.path("/loginView");
		};
		
	}]);