angular.module("productsModule").
	controller("productsController",["$scope","$location","$rootScope", function($scope,$location,$rootScope){ 
	
		$scope.productList = [
				{name: "p1", desc: "product p1", price: 1234},
				{name: "p2", desc: "product p2", price: 1235},
				{name: "p3", desc: "product p3", price: 1245},
				{name: "p4", desc: "product p4", price: 1345},
				{name: "p5", desc: "product p5", price: 2345}
			];
			
		$scope.selectProduct = function(product){
			
			$rootScope.selectedProduct = product;
			$location.path("/loginView");
		
		};
	
	}]);