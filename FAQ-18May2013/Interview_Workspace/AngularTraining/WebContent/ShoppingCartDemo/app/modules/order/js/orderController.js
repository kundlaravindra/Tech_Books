angular.module("orderModule").
	controller("orderController",
			["$scope","$location",function($scope,$location){
		
				$scope.confirm = function(){
						
					$location.path("/");
				};
		
	}]);