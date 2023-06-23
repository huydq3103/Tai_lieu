var myApp = angular.module("myModule", ["ngRoute"]);
// chuyen trang
myApp.config(function ($routeProvider, $locationProvider) {
  // xoa khoang trang trinh duyet
  $locationProvider.hashPrefix("");
  // $routeProvider : chuyen trang
  $routeProvider
    .when("/trang-chu", {
      templateUrl: "pages/trang-chu.html",
      controller : ThucVatController,
    })
    .when("/contact", {
      // lam gi thi lam
      // noi dung cua trang chu
      //   template: "<h1>Noi dung trang contact</h1>",
      //Truyen file HTML
      template: "<h1>Noi dung trang cua hang</h1>",
    })
    .when("/cua-hang", {
      // lam gi thi lam
      // noi dung cua trang chu
      templateUrl: "pages/lien-he.html",
      // controller: HienThi,
    })
    .otherwise({
      redirectTo: "/trang-chu",
    });
});
