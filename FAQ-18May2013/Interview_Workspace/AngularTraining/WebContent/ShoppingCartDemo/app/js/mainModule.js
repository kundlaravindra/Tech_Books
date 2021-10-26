angular.module("mainModule",["ngRoute","productsModule"]).
	config(function($routeProvider){
	

					$routeProvider
						.when(
								"/",
								{
									templateUrl : "app/modules/products/views/productsListView.html",
									controller : "productsController"
								});
					$routeProvider
							.when(
									"/loginView",
									{
										templateUrl : "app/modules/accounts/views/loginView.html",
										controller : "accountsController"
									});
					$routeProvider
							.when(
									"/signup",
									{
										templateUrl : "app/modules/accounts/views/createNewUserView.html",
										controller : "accountsController"
									});
					$routeProvider
							.when(
									"/confirm",
									{
										templateUrl : "app/modules/order/views/orderView.html",
										controller : "orderController"
									});
				});

